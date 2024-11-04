package com.dogfood.aa20240808.timing.config;

import com.dogfood.aa20240808.timing.delegate.PluginJDBCDelegate;
import com.dogfood.aa20240808.timing.delegate.PluginRowLockSemaphore;
import liquibase.integration.spring.SpringLiquibase;
import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.quartz.SchedulerFactoryBeanCustomizer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SpringBeanJobFactory;
import org.springframework.util.CollectionUtils;

import java.util.Map;
import java.util.Properties;

@Configuration
@ConditionalOnProperty(value = "spring.quartz.enabled", havingValue = "true")
public class SchedulerConfiguration {
    private static final Logger LOGGER = LoggerFactory.getLogger(SchedulerConfiguration.class);

    /** make sure liquibase load before quartz **/
    @Autowired(required = false)
    private SpringLiquibase springLiquibase;

    @Bean
    public SchedulerFactoryBean quartzScheduler(ObjectProvider<SchedulerFactoryBeanCustomizer> customizers,
        ObjectProvider<JobDetail> jobDetails, Map<String, Calendar> calendars,
            ObjectProvider<Trigger> triggers, ApplicationContext applicationContext, CustomQuartzProperties properties) {
        LOGGER.info("config SchedulerFactoryBean");
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        SpringBeanJobFactory jobFactory = new SpringBeanJobFactory();
        jobFactory.setApplicationContext(applicationContext);
        schedulerFactoryBean.setJobFactory(jobFactory);
        if (properties.getSchedulerName() != null) {
            schedulerFactoryBean.setSchedulerName(properties.getSchedulerName());
        }
        schedulerFactoryBean.setAutoStartup(properties.isAutoStartup());
        schedulerFactoryBean.setStartupDelay((int) properties.getStartupDelay().getSeconds());
        schedulerFactoryBean.setWaitForJobsToCompleteOnShutdown(properties.isWaitForJobsToCompleteOnShutdown());
        schedulerFactoryBean.setOverwriteExistingJobs(properties.isOverwriteExistingJobs());
        if (!CollectionUtils.isEmpty(properties.getProperties())) {
            schedulerFactoryBean.setQuartzProperties(asProperties(properties.getProperties()));
        }

        schedulerFactoryBean.setJobDetails(jobDetails.orderedStream().toArray(JobDetail[]::new));
        schedulerFactoryBean.setCalendars(calendars);
        schedulerFactoryBean.setTriggers(triggers.orderedStream().toArray(Trigger[]::new));
        customizers.orderedStream().forEach((customizer) -> customizer.customize(schedulerFactoryBean));
        // 不能让customizers设置dataSource否则org.quartz.jobStore.class这个配置项会无效，导致不执行MyJobStoreTX
        schedulerFactoryBean.setDataSource(null);
        return schedulerFactoryBean;
    }

    private Properties asProperties(Map<String, String> source) {
        Properties properties = new Properties();
        properties.putAll(source);
        return properties;
    }

}

