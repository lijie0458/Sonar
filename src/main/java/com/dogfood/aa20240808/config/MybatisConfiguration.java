package com.dogfood.aa20240808.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.dogfood.aa20240808.repository.handler.ZonedDateTimeTypeHandler;
import com.dogfood.aa20240808.repository.interceptor.QueryFilterInterceptor;

import javax.annotation.Resource;
import java.time.ZonedDateTime;

@Component
public class MybatisConfiguration implements ConfigurationCustomizer {
    @Resource
    private DataSourceProperties dataSourceProperties;
    private static final Logger LOGGER = LoggerFactory.getLogger(MybatisConfiguration.class);

    private final static String MYSQL_DRIVER_CLASS1 = "com.mysql.jdbc.Driver";
    private final static String MYSQL_DRIVER_CLASS2 = "com.mysql.cj.jdbc.Driver";
    @Value("${lcp.process.database.table.prefix:}")
    private String processTablePrefix;
    @Override
    public void customize(Configuration configuration) {
        configuration.getVariables().setProperty("process_table_prefix",processTablePrefix);
        configOldVersionMysqlDriverZonedDateTime(configuration);
    }

    /**
     * Mybatis in version 3.5.0 or greater ZonedDateTimeTypeHandler implementation is different from the lower version,
     * if using the lower version of mysql driver (before 8.0.21) will not recognize the ZonedDateTime type problem
     * @param configuration
     */
    private void configOldVersionMysqlDriverZonedDateTime(Configuration configuration) {
        if (MYSQL_DRIVER_CLASS1.equals(dataSourceProperties.getDriverClassName()) ||
                MYSQL_DRIVER_CLASS2.equals(dataSourceProperties.getDriverClassName())) {
            LOGGER.info("ZonedDateTimeTypeHandler is overridden when mysql driver is found");
            configuration.getTypeHandlerRegistry().register(ZonedDateTime.class, new ZonedDateTimeTypeHandler());
        }
    }


    @Bean
    public QueryFilterInterceptor queryFilterInterceptor() {
        return new QueryFilterInterceptor();
    }


}
