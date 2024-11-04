package com.dogfood.aa20240808.timing.delegate;

import org.quartz.impl.jdbcjobstore.StdRowLockSemaphore;

public class PluginRowLockSemaphore extends StdRowLockSemaphore {
    public static final String SELECT_FOR_LOCK = "SELECT * FROM {0}LOCKS WHERE SCHED_NAME = {1} AND LOCK_NAME = ? FOR UPDATE";

    public static final String INSERT_LOCK = "INSERT INTO {0}LOCKS(SCHED_NAME, LOCK_NAME) VALUES ({1}, ?)";

    public PluginRowLockSemaphore() {
        super();
        setSQL(SELECT_FOR_LOCK);
        setInsertSQL(INSERT_LOCK);
    }


}
