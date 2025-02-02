package com.dogfood.aa20240808.datasource.dynamic;

import com.dogfood.aa20240808.util.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
// @ConditionalOnProperty(prefix = "spring.initDatabase", name = "enabled", havingValue = "true")
public class InitDatabaseConfig {

    private final Logger log = LoggerFactory.getLogger(InitDatabaseConfig.class);

    @Autowired
    private ApplicationContext applicationContext;

    @PostConstruct
    public void initDatabase() throws Exception {
        log.info("start to init database");
        String init = System.getenv("INIT_DATABASE");
        if (init == null || !init.equalsIgnoreCase("true")) {
            log.info("env variable not true, skip init database");
            return;
        }
        String join = String.join(File.separator, System.getProperty("user.home"), "low-code");
        ExcelUtil.uploadPathFilter(join);
        File dir = new File(join);
        File file = new File(dir, "initDatabase.txt");
        if (file.exists()) {
            log.info("initDatabase.txt exists, skip init database");
            return;
        }

        executeUpgradeSqlScript();
        executeAllSqlScript();

        if (!dir.exists()) {
            dir.mkdirs();
        }
        file.createNewFile();
    }

    private void executeAllSqlScript() throws SQLException {
        PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
        DataSource dataSource;
        Resource[] resources;
        Connection connection;
        List<Connection> connections = new ArrayList<>();

        try {
            dataSource = (DataSource) applicationContext.getBean(DataSource.class);
            resources = pathMatchingResourcePatternResolver.getResources("db/all-defaultDS-*.sql");
            connection = dataSource.getConnection();
            connection.setAutoCommit(false);
            connections.add(connection);
            for (Resource resource : resources) {
                ScriptUtils.executeSqlScript(connection, resource);
            }

            for (Connection c : connections) {
                c.commit();
            }
        } catch (Exception e) {
            log.warn("execute all sql script failed", e);
            for (Connection c : connections) {
                c.rollback();
            }
        } finally {
            for (Connection c : connections) {
                c.close();
            }
        }
    }

    private void executeUpgradeSqlScript() throws SQLException {
        PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
        DataSource dataSource;
        Resource[] resources;
        Connection connection;
        List<Connection> connections = new ArrayList<>();

        try {
            dataSource = (DataSource) applicationContext.getBean(DataSource.class);
            resources = pathMatchingResourcePatternResolver.getResources("db/upgrade-defaultDS-*.sql");
            connection = dataSource.getConnection();
            connection.setAutoCommit(false);
            connections.add(connection);
            for (Resource resource : resources) {
                ScriptUtils.executeSqlScript(connection, resource);
            }

        for (Connection c : connections) {
            c.commit();
        }
        } catch (Exception e) {
            log.warn("execute upgrade sql script failed", e);
            for (Connection c : connections) {
                c.rollback();
            }
        } finally {
            for (Connection c : connections) {
                c.close();
            }
        }
    }
}
