package com.dogfood.aa20240808;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.boot.autoconfigure.quartz.QuartzAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.dogfood.aa20240808.config.LcpProperties;
import com.dogfood.aa20240808.util.CommonFunctionUtil;

import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication(exclude = {QuartzAutoConfiguration.class, LiquibaseAutoConfiguration.class},
        scanBasePackageClasses = Application.class)
@EnableConfigurationProperties({LcpProperties.class})
@MapperScan(basePackages = "com.dogfood.aa20240808.repository", nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class)
@EnableTransactionManagement
@ServletComponentScan
public class Application {
    /**
     * Main method, used to run the application.
     *
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        CommonFunctionUtil.registerEnv(app.run(args).getEnvironment());
    }
}
