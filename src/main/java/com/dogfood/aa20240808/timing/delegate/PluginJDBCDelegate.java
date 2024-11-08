package com.dogfood.aa20240808.timing.delegate;

import org.quartz.Calendar;
import org.quartz.*;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.jdbcjobstore.*;
import org.quartz.impl.matchers.GroupMatcher;
import org.quartz.impl.triggers.SimpleTriggerImpl;
import org.quartz.spi.ClassLoadHelper;
import org.quartz.spi.OperableTrigger;

import java.io.*;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.*;

import static org.quartz.JobKey.jobKey;
import static org.quartz.TriggerBuilder.newTrigger;
import static org.quartz.TriggerKey.triggerKey;

/**
 * 用来处理quartz数据库操作的代理类
 * 因为平台需要对接多种数据库，这里对StdJDBCDelegate做了一层代理
 */
public class PluginJDBCDelegate extends StdJDBCDelegate {
    public static final String SELECT_MISFIRED_TRIGGERS = "SELECT * FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND " +
            "NOT (MISFIRE_INSTR = -1) AND NEXT_FIRE_TIME < ? ORDER BY NEXT_FIRE_TIME ASC, PRIORITY DESC";
    public static final String SELECT_TRIGGERS_IN_STATE = "SELECT TRIGGER_NAME, TRIGGER_GROUP FROM {0}TRIGGERS " +
            "WHERE SCHED_NAME = {1} AND TRIGGER_STATE = ?";
    public static final String SELECT_MISFIRED_TRIGGERS_IN_STATE = "SELECT TRIGGER_NAME, TRIGGER_GROUP FROM {0}TRIGGERS " +
            "WHERE SCHED_NAME = {1} AND NOT (MISFIRE_INSTR = -1) AND NEXT_FIRE_TIME < ? AND TRIGGER_STATE = ? ORDER BY " +
            "NEXT_FIRE_TIME ASC, PRIORITY DESC";
    public static final String SELECT_HAS_MISFIRED_TRIGGERS_IN_STATE = "SELECT TRIGGER_NAME, TRIGGER_GROUP FROM {0}TRIGGERS " +
            "WHERE SCHED_NAME = {1} AND NOT (MISFIRE_INSTR = -1) AND NEXT_FIRE_TIME < ? AND TRIGGER_STATE = ? ORDER BY " +
            "NEXT_FIRE_TIME ASC, PRIORITY DESC";
    public static final String COUNT_MISFIRED_TRIGGERS_IN_STATE = "SELECT COUNT(TRIGGER_NAME) FROM {0}TRIGGERS WHERE " +
            "SCHED_NAME = {1} AND NOT (MISFIRE_INSTR = -1) AND NEXT_FIRE_TIME < ? AND TRIGGER_STATE = ?";
    public static final String SELECT_MISFIRED_TRIGGERS_IN_GROUP_IN_STATE = "SELECT TRIGGER_NAME FROM {0}TRIGGERS WHERE SCHED_NAME = {1} " +
            "AND NOT (MISFIRE_INSTR = -1) AND NEXT_FIRE_TIME < ? AND TRIGGER_GROUP = ? AND TRIGGER_STATE = ? " +
            "ORDER BY NEXT_FIRE_TIME ASC, PRIORITY DESC";
    public static final String SELECT_INSTANCES_RECOVERABLE_FIRED_TRIGGERS = "SELECT * FROM {0}FIRED_TRIGGERS WHERE " +
            "SCHED_NAME = {1} AND INSTANCE_NAME = ? AND REQUESTS_RECOVERY = ?";
    public static final String DELETE_FIRED_TRIGGERS = "DELETE FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1}";
    public static final String DELETE_INSTANCES_FIRED_TRIGGERS = "DELETE FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1} AND INSTANCE_NAME = ?";
    public static final String DELETE_ALL_SIMPLE_TRIGGERS = "DELETE FROM {0}SIMPLE_TRIGGERS  WHERE SCHED_NAME = {1}";
    public static final String DELETE_ALL_SIMPROP_TRIGGERS = "DELETE FROM {0}SIMPROP_TRIGGERS  WHERE SCHED_NAME = {1}";
    public static final String DELETE_ALL_CRON_TRIGGERS = "DELETE FROM {0}CRON_TRIGGERS WHERE SCHED_NAME = {1}";
    public static final String DELETE_ALL_BLOB_TRIGGERS = "DELETE FROM {0}BLOB_TRIGGERS WHERE SCHED_NAME = {1}";
    public static final String DELETE_ALL_TRIGGERS = "DELETE FROM {0}TRIGGERS WHERE SCHED_NAME = {1}";
    public static final String DELETE_ALL_JOB_DETAILS = "DELETE FROM {0}JOB_DETAILS WHERE SCHED_NAME = {1}";
    public static final String DELETE_ALL_CALENDARS = "DELETE FROM {0}CALENDARS WHERE SCHED_NAME = {1}";
    public static final String DELETE_ALL_PAUSED_TRIGGER_GRPS = "DELETE FROM {0}PAUSED_TRIGGER_GRPS WHERE SCHED_NAME = {1}";
    public static final String INSERT_JOB_DETAIL = "INSERT INTO {0}JOB_DETAILS (SCHED_NAME, JOB_NAME, JOB_GROUP, " +
            "DESCRIPTION, JOB_CLASS_NAME, IS_DURABLE, IS_NONCONCURRENT, IS_UPDATE_DATA, REQUESTS_RECOVERY, JOB_DATA)  " +
            "VALUES({1}, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String UPDATE_JOB_DETAIL = "UPDATE {0}JOB_DETAILS SET DESCRIPTION = ?, JOB_CLASS_NAME = ?, " +
            "IS_DURABLE = ?, IS_NONCONCURRENT = ?, IS_UPDATE_DATA = ?, REQUESTS_RECOVERY = ?, JOB_DATA = ?  " +
            "WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?";
    public static final String SELECT_TRIGGERS_FOR_JOB = "SELECT TRIGGER_NAME, TRIGGER_GROUP FROM {0}TRIGGERS WHERE " +
            "SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?";
    public static final String DELETE_JOB_DETAIL = "DELETE FROM {0}JOB_DETAILS WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?";
    public static final String SELECT_JOB_NONCONCURRENT = "SELECT IS_NONCONCURRENT FROM {0}JOB_DETAILS WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?";
    public static final String SELECT_JOB_EXISTENCE = "SELECT JOB_NAME FROM {0}JOB_DETAILS WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?";
    public static final String UPDATE_JOB_DATA = "UPDATE {0}JOB_DETAILS SET JOB_DATA = ?  WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?";
    public static final String SELECT_JOB_DETAIL = "SELECT * FROM {0}JOB_DETAILS WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?";
    public static final String SELECT_NUM_JOBS = "SELECT COUNT(JOB_NAME) FROM {0}JOB_DETAILS WHERE SCHED_NAME = {1}";
    public static final String SELECT_JOB_GROUPS = "SELECT DISTINCT(JOB_GROUP) FROM {0}JOB_DETAILS WHERE SCHED_NAME = {1}";
    public static final String SELECT_JOBS_IN_GROUP = "SELECT JOB_NAME, JOB_GROUP FROM {0}JOB_DETAILS WHERE SCHED_NAME = {1} AND JOB_GROUP = ?";
    public static final String SELECT_JOBS_IN_GROUP_LIKE = "SELECT JOB_NAME, JOB_GROUP FROM {0}JOB_DETAILS WHERE SCHED_NAME = {1} AND JOB_GROUP LIKE ?";
    public static final String INSERT_TRIGGER = "INSERT INTO {0}TRIGGERS (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP, " +
            "JOB_NAME, JOB_GROUP, DESCRIPTION, NEXT_FIRE_TIME, PREV_FIRE_TIME, TRIGGER_STATE, TRIGGER_TYPE, START_TIME, " +
            "END_TIME, CALENDAR_NAME, MISFIRE_INSTR, JOB_DATA, PRIORITY)  VALUES({1}, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String INSERT_BLOB_TRIGGER = "INSERT INTO {0}BLOB_TRIGGERS (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP, BLOB_DATA)  VALUES({1}, ?, ?, ?)";
    public static final String UPDATE_TRIGGER = "UPDATE {0}TRIGGERS SET JOB_NAME = ?, JOB_GROUP = ?, DESCRIPTION = ?, " +
            "NEXT_FIRE_TIME = ?, PREV_FIRE_TIME = ?, TRIGGER_STATE = ?, TRIGGER_TYPE = ?, START_TIME = ?, " +
            "END_TIME = ?, CALENDAR_NAME = ?, MISFIRE_INSTR = ?, PRIORITY = ?, JOB_DATA = ? WHERE SCHED_NAME = {1} AND " +
            "TRIGGER_NAME = ? AND TRIGGER_GROUP = ?";
    public static final String UPDATE_TRIGGER_SKIP_DATA = "UPDATE {0}TRIGGERS SET JOB_NAME = ?, JOB_GROUP = ?, DESCRIPTION = ?, " +
            "NEXT_FIRE_TIME = ?, PREV_FIRE_TIME = ?, TRIGGER_STATE = ?, TRIGGER_TYPE = ?, START_TIME = ?, END_TIME = ?, " +
            "CALENDAR_NAME = ?, MISFIRE_INSTR = ?, PRIORITY = ? WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?";
    public static final String UPDATE_BLOB_TRIGGER = "UPDATE {0}BLOB_TRIGGERS SET BLOB_DATA = ? WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?";
    public static final String SELECT_TRIGGER_EXISTENCE = "SELECT TRIGGER_NAME FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?";
    public static final String UPDATE_TRIGGER_STATE = "UPDATE {0}TRIGGERS SET TRIGGER_STATE = ? WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?";
    public static final String UPDATE_TRIGGER_STATE_FROM_STATES = "UPDATE {0}TRIGGERS SET TRIGGER_STATE = ? WHERE SCHED_NAME = {1} AND " +
            "TRIGGER_NAME = ? AND TRIGGER_GROUP = ? AND (TRIGGER_STATE = ? OR TRIGGER_STATE = ? OR TRIGGER_STATE = ?)";
    public static final String UPDATE_TRIGGER_GROUP_STATE_FROM_STATES = "UPDATE {0}TRIGGERS SET TRIGGER_STATE = ? WHERE " +
            "SCHED_NAME = {1} AND TRIGGER_GROUP LIKE ? AND (TRIGGER_STATE = ? OR TRIGGER_STATE = ? OR TRIGGER_STATE = ?)";
    public static final String UPDATE_TRIGGER_STATE_FROM_STATE = "UPDATE {0}TRIGGERS SET TRIGGER_STATE = ? WHERE SCHED_NAME = {1} " +
            "AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ? AND TRIGGER_STATE = ?";
    public static final String UPDATE_TRIGGER_GROUP_STATE_FROM_STATE = "UPDATE {0}TRIGGERS SET TRIGGER_STATE = ? WHERE SCHED_NAME = {1} " +
            "AND TRIGGER_GROUP LIKE ? AND TRIGGER_STATE = ?";
    public static final String UPDATE_JOB_TRIGGER_STATES = "UPDATE {0}TRIGGERS SET TRIGGER_STATE = ? WHERE " +
            "SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?";
    public static final String UPDATE_JOB_TRIGGER_STATES_FROM_OTHER_STATE = "UPDATE {0}TRIGGERS SET TRIGGER_STATE = ? WHERE SCHED_NAME = {1} " +
            "AND JOB_NAME = ? AND JOB_GROUP = ? AND TRIGGER_STATE = ?";
    public static final String DELETE_BLOB_TRIGGER = "DELETE FROM {0}BLOB_TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?";

    public static final String DELETE_TRIGGER = "DELETE FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?";
    public static final String SELECT_NUM_TRIGGERS_FOR_JOB = "SELECT COUNT(TRIGGER_NAME) FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?";
    public static final String SELECT_JOB_FOR_TRIGGER = "SELECT J.JOB_NAME, J.JOB_GROUP, J.IS_DURABLE, J.JOB_CLASS_NAME, " +
            "J.REQUESTS_RECOVERY FROM {0}TRIGGERS T, {0}JOB_DETAILS J WHERE T.SCHED_NAME = {1} AND J.SCHED_NAME = {1} AND " +
            "T.TRIGGER_NAME = ? AND T.TRIGGER_GROUP = ? AND T.JOB_NAME = J.JOB_NAME AND T.JOB_GROUP = J.JOB_GROUP";
    public static final String SELECT_TRIGGERS_FOR_CALENDAR = "SELECT TRIGGER_NAME, TRIGGER_GROUP FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND CALENDAR_NAME = ?";
    public static final String SELECT_TRIGGER = "SELECT * FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?";
    public static final String SELECT_BLOB_TRIGGER = "SELECT * FROM {0}BLOB_TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?";
    public static final String SELECT_TRIGGER_DATA = "SELECT JOB_DATA FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?";
    public static final String SELECT_TRIGGER_STATE = "SELECT TRIGGER_STATE FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?";
    public static final String SELECT_TRIGGER_STATUS = "SELECT TRIGGER_STATE, NEXT_FIRE_TIME, JOB_NAME, JOB_GROUP FROM {0}" +
            "TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?";
    public static final String SELECT_NUM_TRIGGERS = "SELECT COUNT(TRIGGER_NAME)  FROM {0}TRIGGERS WHERE SCHED_NAME = {1}";
    public static final String SELECT_TRIGGER_GROUPS = "SELECT DISTINCT(TRIGGER_GROUP) FROM {0}TRIGGERS WHERE SCHED_NAME = {1}";
    public static final String SELECT_TRIGGER_GROUPS_FILTERED = "SELECT DISTINCT(TRIGGER_GROUP) FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_GROUP LIKE ?";
    public static final String SELECT_TRIGGERS_IN_GROUP = "SELECT TRIGGER_NAME, TRIGGER_GROUP FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_GROUP = ?";
    public static final String INSERT_PAUSED_TRIGGER_GROUP = "INSERT INTO {0}PAUSED_TRIGGER_GRPS (SCHED_NAME, TRIGGER_GROUP) VALUES({1}, ?)";
    public static final String DELETE_PAUSED_TRIGGER_GROUP = "DELETE FROM {0}PAUSED_TRIGGER_GRPS WHERE SCHED_NAME = {1} AND TRIGGER_GROUP LIKE ?";
    public static final String DELETE_PAUSED_TRIGGER_GROUPS = "DELETE FROM {0}PAUSED_TRIGGER_GRPS WHERE SCHED_NAME = {1}";
    public static final String SELECT_PAUSED_TRIGGER_GROUP = "SELECT TRIGGER_GROUP FROM {0}PAUSED_TRIGGER_GRPS WHERE SCHED_NAME = {1} AND TRIGGER_GROUP = ?";
    public static final String SELECT_NUM_TRIGGERS_IN_GROUP = "SELECT COUNT(TRIGGER_NAME)  FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_GROUP = ?";
    public static final String INSERT_CALENDAR = "INSERT INTO {0}CALENDARS (SCHED_NAME, CALENDAR_NAME, CALENDAR)  VALUES({1}, ?, ?)";
    public static final String UPDATE_CALENDAR = "UPDATE {0}CALENDARS SET CALENDAR = ?  WHERE SCHED_NAME = {1} AND CALENDAR_NAME = ?";
    public static final String SELECT_CALENDAR_EXISTENCE = "SELECT CALENDAR_NAME FROM {0}CALENDARS WHERE SCHED_NAME = {1} AND CALENDAR_NAME = ?";
    public static final String SELECT_CALENDAR = "SELECT * FROM {0}CALENDARS WHERE SCHED_NAME = {1} AND CALENDAR_NAME = ?";
    public static final String SELECT_REFERENCED_CALENDAR = "SELECT CALENDAR_NAME FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND CALENDAR_NAME = ?";
    public static final String DELETE_CALENDAR = "DELETE FROM {0}CALENDARS WHERE SCHED_NAME = {1} AND CALENDAR_NAME = ?";
    public static final String SELECT_NUM_CALENDARS = "SELECT COUNT(CALENDAR_NAME)  FROM {0}CALENDARS WHERE SCHED_NAME = {1}";
    public static final String SELECT_CALENDARS = "SELECT CALENDAR_NAME FROM {0}CALENDARS WHERE SCHED_NAME = {1}";
    public static final String SELECT_TRIGGER_FOR_FIRE_TIME = "SELECT TRIGGER_NAME, TRIGGER_GROUP FROM {0}TRIGGERS WHERE " +
            "SCHED_NAME = {1} AND TRIGGER_STATE = ? AND NEXT_FIRE_TIME = ?";
    public static final String SELECT_NEXT_TRIGGER_TO_ACQUIRE = "SELECT TRIGGER_NAME, TRIGGER_GROUP, NEXT_FIRE_TIME, PRIORITY " +
            "FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_STATE = ? AND NEXT_FIRE_TIME <= ? AND (MISFIRE_INSTR = -1 OR " +
            "(MISFIRE_INSTR != -1 AND NEXT_FIRE_TIME >= ?)) ORDER BY NEXT_FIRE_TIME ASC, PRIORITY DESC";
    public static final String INSERT_FIRED_TRIGGER = "INSERT INTO {0}FIRED_TRIGGERS (SCHED_NAME, ENTRY_ID, TRIGGER_NAME, " +
            "TRIGGER_GROUP, INSTANCE_NAME, FIRED_TIME, SCHED_TIME, STATE, JOB_NAME, JOB_GROUP, IS_NONCONCURRENT, REQUESTS_RECOVERY, " +
            "PRIORITY) VALUES({1}, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String UPDATE_FIRED_TRIGGER = "UPDATE {0}FIRED_TRIGGERS SET INSTANCE_NAME = ?, FIRED_TIME = ?, " +
            "SCHED_TIME = ?, STATE = ?, JOB_NAME = ?, JOB_GROUP = ?, IS_NONCONCURRENT = ?, REQUESTS_RECOVERY = ? WHERE " +
            "SCHED_NAME = {1} AND ENTRY_ID = ?";
    public static final String SELECT_FIRED_TRIGGER = "SELECT * FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?";
    public static final String SELECT_FIRED_TRIGGER_GROUP = "SELECT * FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_GROUP = ?";
    public static final String SELECT_FIRED_TRIGGERS_OF_JOB = "SELECT * FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?";
    public static final String SELECT_FIRED_TRIGGERS_OF_JOB_GROUP = "SELECT * FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1} AND JOB_GROUP = ?";
    public static final String SELECT_INSTANCES_FIRED_TRIGGERS = "SELECT * FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1} AND INSTANCE_NAME = ?";
    public static final String SELECT_FIRED_TRIGGER_INSTANCE_NAMES = "SELECT DISTINCT INSTANCE_NAME FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1}";
    public static final String DELETE_FIRED_TRIGGER = "DELETE FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1} AND ENTRY_ID = ?";
    public static final String SELECT_JOB_EXECUTION_COUNT = "SELECT COUNT(TRIGGER_NAME) FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?";
    public static final String INSERT_SCHEDULER_STATE = "INSERT INTO {0}SCHEDULER_STATE (SCHED_NAME, INSTANCE_NAME, LAST_CHECKIN_TIME, CHECKIN_INTERVAL) VALUES({1}, ?, ?, ?)";
    public static final String DELETE_SCHEDULER_STATE = "DELETE FROM {0}SCHEDULER_STATE WHERE SCHED_NAME = {1} AND INSTANCE_NAME = ?";
    public static final String UPDATE_SCHEDULER_STATE = "UPDATE {0}SCHEDULER_STATE SET LAST_CHECKIN_TIME = ? WHERE SCHED_NAME = {1} AND INSTANCE_NAME = ?";
    public static final String SELECT_SCHEDULER_STATE = "SELECT * FROM {0}SCHEDULER_STATE WHERE SCHED_NAME = {1} AND INSTANCE_NAME = ?";
    public static final String SELECT_SCHEDULER_STATES = "SELECT * FROM {0}SCHEDULER_STATE WHERE SCHED_NAME = {1}";
    public static final String SELECT_PAUSED_TRIGGER_GROUPS = "SELECT TRIGGER_GROUP FROM {0}PAUSED_TRIGGER_GRPS WHERE SCHED_NAME = {1}";


    public PluginJDBCDelegate() {
        super();
    }

    @Override
    protected void addDefaultTriggerPersistenceDelegates() {
        addTriggerPersistenceDelegate(new PluginSimpleTriggerPersistenceDelegate());
        addTriggerPersistenceDelegate(new PluginCronTriggerPersistenceDelegate());
        addTriggerPersistenceDelegate(new PluginCalendarIntervalTriggerPersistenceDelegate());
        addTriggerPersistenceDelegate(new PluginDailyTimeIntervalTriggerPersistenceDelegate());
    }

    @Override
    public List<TriggerKey> selectMisfiredTriggers(Connection conn, long ts) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(SELECT_MISFIRED_TRIGGERS));
            ps.setBigDecimal(1, new BigDecimal(String.valueOf(ts)));
            rs = ps.executeQuery();

            LinkedList<TriggerKey> list = new LinkedList<TriggerKey>();
            while (rs.next()) {
                String triggerName = rs.getString(COL_TRIGGER_NAME);
                String groupName = rs.getString(COL_TRIGGER_GROUP);
                list.add(triggerKey(triggerName, groupName));
            }
            return list;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public List<TriggerKey> selectTriggersInState(Connection conn, String state) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(SELECT_TRIGGERS_IN_STATE));
            ps.setString(1, state);
            rs = ps.executeQuery();

            LinkedList<TriggerKey> list = new LinkedList<TriggerKey>();
            while (rs.next()) {
                list.add(triggerKey(rs.getString(1), rs.getString(2)));
            }

            return list;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public List<TriggerKey> selectMisfiredTriggersInState(Connection conn, String state, long ts) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(SELECT_MISFIRED_TRIGGERS_IN_STATE));
            ps.setBigDecimal(1, new BigDecimal(String.valueOf(ts)));
            ps.setString(2, state);
            rs = ps.executeQuery();

            LinkedList<TriggerKey> list = new LinkedList<TriggerKey>();
            while (rs.next()) {
                String triggerName = rs.getString(COL_TRIGGER_NAME);
                String groupName = rs.getString(COL_TRIGGER_GROUP);
                list.add(triggerKey(triggerName, groupName));
            }
            return list;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public boolean hasMisfiredTriggersInState(Connection conn, String state1, long ts, int count, List<TriggerKey> resultList) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(SELECT_HAS_MISFIRED_TRIGGERS_IN_STATE));
            ps.setBigDecimal(1, new BigDecimal(String.valueOf(ts)));
            ps.setString(2, state1);
            rs = ps.executeQuery();

            boolean hasReachedLimit = false;
            while (rs.next() && (hasReachedLimit == false)) {
                if (resultList.size() == count) {
                    hasReachedLimit = true;
                } else {
                    String triggerName = rs.getString(COL_TRIGGER_NAME);
                    String groupName = rs.getString(COL_TRIGGER_GROUP);
                    resultList.add(triggerKey(triggerName, groupName));
                }
            }

            return hasReachedLimit;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public int countMisfiredTriggersInState(Connection conn, String state1, long ts) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(COUNT_MISFIRED_TRIGGERS_IN_STATE));
            ps.setBigDecimal(1, new BigDecimal(String.valueOf(ts)));
            ps.setString(2, state1);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            throw new SQLException("No misfired trigger count returned.");
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public List<TriggerKey> selectMisfiredTriggersInGroupInState(Connection conn, String groupName, String state, long ts) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn
                    .prepareStatement(rtp(SELECT_MISFIRED_TRIGGERS_IN_GROUP_IN_STATE));
            ps.setBigDecimal(1, new BigDecimal(String.valueOf(ts)));
            ps.setString(2, groupName);
            ps.setString(3, state);
            rs = ps.executeQuery();

            LinkedList<TriggerKey> list = new LinkedList<TriggerKey>();
            while (rs.next()) {
                String triggerName = rs.getString(COL_TRIGGER_NAME);
                list.add(triggerKey(triggerName, groupName));
            }
            return list;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public List<OperableTrigger> selectTriggersForRecoveringJobs(Connection conn) throws SQLException, IOException, ClassNotFoundException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn
                    .prepareStatement(rtp(SELECT_INSTANCES_RECOVERABLE_FIRED_TRIGGERS));
            ps.setString(1, instanceId);
            setBoolean(ps, 2, true);
            rs = ps.executeQuery();

            long dumId = System.currentTimeMillis();
            LinkedList<OperableTrigger> list = new LinkedList<OperableTrigger>();
            while (rs.next()) {
                String jobName = rs.getString(COL_JOB_NAME);
                String jobGroup = rs.getString(COL_JOB_GROUP);
                String trigName = rs.getString(COL_TRIGGER_NAME);
                String trigGroup = rs.getString(COL_TRIGGER_GROUP);
                long firedTime = rs.getLong(COL_FIRED_TIME);
                long scheduledTime = rs.getLong(COL_SCHED_TIME);
                int priority = rs.getInt(COL_PRIORITY);
                @SuppressWarnings("deprecation")
                SimpleTriggerImpl rcvryTrig = new SimpleTriggerImpl("recover_"
                        + instanceId + "_" + String.valueOf(dumId++),
                        Scheduler.DEFAULT_RECOVERY_GROUP, new Date(scheduledTime));
                rcvryTrig.setJobName(jobName);
                rcvryTrig.setJobGroup(jobGroup);
                rcvryTrig.setPriority(priority);
                rcvryTrig.setMisfireInstruction(SimpleTrigger.MISFIRE_INSTRUCTION_IGNORE_MISFIRE_POLICY);

                JobDataMap jd = selectTriggerJobDataMap(conn, trigName, trigGroup);
                jd.put(Scheduler.FAILED_JOB_ORIGINAL_TRIGGER_NAME, trigName);
                jd.put(Scheduler.FAILED_JOB_ORIGINAL_TRIGGER_GROUP, trigGroup);
                jd.put(Scheduler.FAILED_JOB_ORIGINAL_TRIGGER_FIRETIME_IN_MILLISECONDS, String.valueOf(firedTime));
                jd.put(Scheduler.FAILED_JOB_ORIGINAL_TRIGGER_SCHEDULED_FIRETIME_IN_MILLISECONDS, String.valueOf(scheduledTime));
                rcvryTrig.setJobDataMap(jd);

                list.add(rcvryTrig);
            }
            return list;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public int deleteFiredTriggers(Connection conn) throws SQLException {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(rtp(DELETE_FIRED_TRIGGERS));

            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public int deleteFiredTriggers(Connection conn, String theInstanceId) throws SQLException {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(rtp(DELETE_INSTANCES_FIRED_TRIGGERS));
            ps.setString(1, theInstanceId);

            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public void clearData(Connection conn) throws SQLException {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(rtp(DELETE_ALL_SIMPLE_TRIGGERS));
            ps.executeUpdate();
            ps.close();
            ps = conn.prepareStatement(rtp(DELETE_ALL_SIMPROP_TRIGGERS));
            ps.executeUpdate();
            ps.close();
            ps = conn.prepareStatement(rtp(DELETE_ALL_CRON_TRIGGERS));
            ps.executeUpdate();
            ps.close();
            ps = conn.prepareStatement(rtp(DELETE_ALL_BLOB_TRIGGERS));
            ps.executeUpdate();
            ps.close();
            ps = conn.prepareStatement(rtp(DELETE_ALL_TRIGGERS));
            ps.executeUpdate();
            ps.close();
            ps = conn.prepareStatement(rtp(DELETE_ALL_JOB_DETAILS));
            ps.executeUpdate();
            ps.close();
            ps = conn.prepareStatement(rtp(DELETE_ALL_CALENDARS));
            ps.executeUpdate();
            ps.close();
            ps = conn.prepareStatement(rtp(DELETE_ALL_PAUSED_TRIGGER_GRPS));
            ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public int insertJobDetail(Connection conn, JobDetail job) throws IOException, SQLException {
        ByteArrayOutputStream baos = serializeJobData(job.getJobDataMap());

        PreparedStatement ps = null;

        int insertResult = 0;

        try {
            ps = conn.prepareStatement(rtp(INSERT_JOB_DETAIL));
            ps.setString(1, job.getKey().getName());
            ps.setString(2, job.getKey().getGroup());
            ps.setString(3, job.getDescription());
            ps.setString(4, job.getJobClass().getName());
            setBoolean(ps, 5, job.isDurable());
            setBoolean(ps, 6, job.isConcurrentExectionDisallowed());
            setBoolean(ps, 7, job.isPersistJobDataAfterExecution());
            setBoolean(ps, 8, job.requestsRecovery());
            setBytes(ps, 9, baos);

            insertResult = ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }

        return insertResult;
    }

    @Override
    public int updateJobDetail(Connection conn, JobDetail job) throws IOException, SQLException {
        ByteArrayOutputStream baos = serializeJobData(job.getJobDataMap());

        PreparedStatement ps = null;

        int insertResult = 0;

        try {
            ps = conn.prepareStatement(rtp(UPDATE_JOB_DETAIL));
            ps.setString(1, job.getDescription());
            ps.setString(2, job.getJobClass().getName());
            setBoolean(ps, 3, job.isDurable());
            setBoolean(ps, 4, job.isConcurrentExectionDisallowed());
            setBoolean(ps, 5, job.isPersistJobDataAfterExecution());
            setBoolean(ps, 6, job.requestsRecovery());
            setBytes(ps, 7, baos);
            ps.setString(8, job.getKey().getName());
            ps.setString(9, job.getKey().getGroup());

            insertResult = ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }

        return insertResult;
    }

    @Override
    public List<TriggerKey> selectTriggerKeysForJob(Connection conn, JobKey jobKey) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(SELECT_TRIGGERS_FOR_JOB));
            ps.setString(1, jobKey.getName());
            ps.setString(2, jobKey.getGroup());
            rs = ps.executeQuery();

            LinkedList<TriggerKey> list = new LinkedList<TriggerKey>();
            while (rs.next()) {
                String trigName = rs.getString(COL_TRIGGER_NAME);
                String trigGroup = rs.getString(COL_TRIGGER_GROUP);
                list.add(triggerKey(trigName, trigGroup));
            }
            return list;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public int deleteJobDetail(Connection conn, JobKey jobKey) throws SQLException {
            PreparedStatement ps = null;

            try {
                if (logger.isDebugEnabled()) {
                    logger.debug("Deleting job: " + jobKey);
                }
                ps = conn.prepareStatement(rtp(DELETE_JOB_DETAIL));
                ps.setString(1, jobKey.getName());
                ps.setString(2, jobKey.getGroup());
                return ps.executeUpdate();
            } finally {
                closeStatement(ps);
            }
    }

    @Override
    public boolean isJobNonConcurrent(Connection conn, JobKey jobKey) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(SELECT_JOB_NONCONCURRENT));
            ps.setString(1, jobKey.getName());
            ps.setString(2, jobKey.getGroup());
            rs = ps.executeQuery();
            if (!rs.next()) { return false; }
            return getBoolean(rs, COL_IS_NONCONCURRENT);
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public boolean jobExists(Connection conn, JobKey jobKey) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(SELECT_JOB_EXISTENCE));
            ps.setString(1, jobKey.getName());
            ps.setString(2, jobKey.getGroup());
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public int updateJobData(Connection conn, JobDetail job) throws IOException, SQLException {
        ByteArrayOutputStream baos = serializeJobData(job.getJobDataMap());

        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(rtp(UPDATE_JOB_DATA));
            setBytes(ps, 1, baos);
            ps.setString(2, job.getKey().getName());
            ps.setString(3, job.getKey().getGroup());

            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public JobDetail selectJobDetail(Connection conn, JobKey jobKey, ClassLoadHelper loadHelper) throws ClassNotFoundException, IOException, SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(SELECT_JOB_DETAIL));
            ps.setString(1, jobKey.getName());
            ps.setString(2, jobKey.getGroup());
            rs = ps.executeQuery();

            JobDetailImpl job = null;

            if (rs.next()) {
                job = new JobDetailImpl();

                job.setName(rs.getString(COL_JOB_NAME));
                job.setGroup(rs.getString(COL_JOB_GROUP));
                job.setDescription(rs.getString(COL_DESCRIPTION));
                job.setJobClass( loadHelper.loadClass(rs.getString(COL_JOB_CLASS), Job.class));
                job.setDurability(getBoolean(rs, COL_IS_DURABLE));
                job.setRequestsRecovery(getBoolean(rs, COL_REQUESTS_RECOVERY));

                Map<?, ?> map = null;
                if (canUseProperties()) {
                    map = getMapFromProperties(rs);
                } else {
                    map = (Map<?, ?>) getObjectFromBlob(rs, COL_JOB_DATAMAP);
                }

                if (null != map) {
                    job.setJobDataMap(new JobDataMap(map));
                }
            }

            return job;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    private Map<?, ?> getMapFromProperties(ResultSet rs)
            throws ClassNotFoundException, IOException, SQLException {
        Map<?, ?> map;
        InputStream is = (InputStream) getJobDataFromBlob(rs, COL_JOB_DATAMAP);
        if(is == null) {
            return null;
        }
        Properties properties = new Properties();
        if (is != null) {
            try {
                properties.load(is);
            } finally {
                is.close();
            }
        }
        map = convertFromProperty(properties);
        return map;
    }

    @Override
    public int selectNumJobs(Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            int count = 0;
            ps = conn.prepareStatement(rtp(SELECT_NUM_JOBS));
            rs = ps.executeQuery();

            if (rs.next()) {
                count = rs.getInt(1);
            }

            return count;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public List<String> selectJobGroups(Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(SELECT_JOB_GROUPS));
            rs = ps.executeQuery();

            LinkedList<String> list = new LinkedList<String>();
            while (rs.next()) {
                list.add(rs.getString(1));
            }

            return list;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public Set<JobKey> selectJobsInGroup(Connection conn, GroupMatcher<JobKey> matcher) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            if(isMatcherEquals(matcher)) {
                ps = conn.prepareStatement(rtp(SELECT_JOBS_IN_GROUP));
                ps.setString(1, toSqlEqualsClause(matcher));
            }
            else {
                ps = conn.prepareStatement(rtp(SELECT_JOBS_IN_GROUP_LIKE));
                ps.setString(1, toSqlLikeClause(matcher));
            }
            rs = ps.executeQuery();

            LinkedList<JobKey> list = new LinkedList<JobKey>();
            while (rs.next()) {
                list.add(jobKey(rs.getString(1), rs.getString(2)));
            }

            return new HashSet<JobKey>(list);
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public int insertTrigger(Connection conn, OperableTrigger trigger, String state, JobDetail jobDetail) throws SQLException, IOException {
        ByteArrayOutputStream baos = null;
        if(trigger.getJobDataMap().size() > 0) {
            baos = serializeJobData(trigger.getJobDataMap());
        }

        PreparedStatement ps = null;

        int insertResult = 0;

        try {
            ps = conn.prepareStatement(rtp(INSERT_TRIGGER));
            ps.setString(1, trigger.getKey().getName());
            ps.setString(2, trigger.getKey().getGroup());
            ps.setString(3, trigger.getJobKey().getName());
            ps.setString(4, trigger.getJobKey().getGroup());
            ps.setString(5, trigger.getDescription());
            if(trigger.getNextFireTime() != null)
                ps.setBigDecimal(6, new BigDecimal(String.valueOf(trigger
                        .getNextFireTime().getTime())));
            else
                ps.setBigDecimal(6, null);
            long prevFireTime = -1;
            if (trigger.getPreviousFireTime() != null) {
                prevFireTime = trigger.getPreviousFireTime().getTime();
            }
            ps.setBigDecimal(7, new BigDecimal(String.valueOf(prevFireTime)));
            ps.setString(8, state);

            TriggerPersistenceDelegate tDel = findTriggerPersistenceDelegate(trigger);

            String type = TTYPE_BLOB;
            if(tDel != null)
                type = tDel.getHandledTriggerTypeDiscriminator();
            ps.setString(9, type);

            ps.setBigDecimal(10, new BigDecimal(String.valueOf(trigger
                    .getStartTime().getTime())));
            long endTime = 0;
            if (trigger.getEndTime() != null) {
                endTime = trigger.getEndTime().getTime();
            }
            ps.setBigDecimal(11, new BigDecimal(String.valueOf(endTime)));
            ps.setString(12, trigger.getCalendarName());
            ps.setInt(13, trigger.getMisfireInstruction());
            setBytes(ps, 14, baos);
            ps.setInt(15, trigger.getPriority());

            insertResult = ps.executeUpdate();

            if(tDel == null)
                insertBlobTrigger(conn, trigger);
            else
                tDel.insertExtendedTriggerProperties(conn, trigger, state, jobDetail);

        } finally {
            closeStatement(ps);
        }

        return insertResult;
    }

    @Override
    public int insertBlobTrigger(Connection conn, OperableTrigger trigger) throws SQLException, IOException {
        PreparedStatement ps = null;
        ByteArrayOutputStream os = null;

        try {
            // update the blob
            os = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(trigger);
            oos.close();

            byte[] buf = os.toByteArray();
            ByteArrayInputStream is = new ByteArrayInputStream(buf);

            ps = conn.prepareStatement(rtp(INSERT_BLOB_TRIGGER));
            ps.setString(1, trigger.getKey().getName());
            ps.setString(2, trigger.getKey().getGroup());
            ps.setBinaryStream(3, is, buf.length);

            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public int updateTrigger(Connection conn, OperableTrigger trigger, String state, JobDetail jobDetail) throws SQLException, IOException {
        // save some clock cycles by unnecessarily writing job data blob ...
        boolean updateJobData = trigger.getJobDataMap().isDirty();
        ByteArrayOutputStream baos = null;
        if(updateJobData) {
            baos = serializeJobData(trigger.getJobDataMap());
        }

        PreparedStatement ps = null;

        int insertResult = 0;


        try {
            if(updateJobData) {
                ps = conn.prepareStatement(rtp(UPDATE_TRIGGER));
            } else {
                ps = conn.prepareStatement(rtp(UPDATE_TRIGGER_SKIP_DATA));
            }

            ps.setString(1, trigger.getJobKey().getName());
            ps.setString(2, trigger.getJobKey().getGroup());
            ps.setString(3, trigger.getDescription());
            long nextFireTime = -1;
            if (trigger.getNextFireTime() != null) {
                nextFireTime = trigger.getNextFireTime().getTime();
            }
            ps.setBigDecimal(4, new BigDecimal(String.valueOf(nextFireTime)));
            long prevFireTime = -1;
            if (trigger.getPreviousFireTime() != null) {
                prevFireTime = trigger.getPreviousFireTime().getTime();
            }
            ps.setBigDecimal(5, new BigDecimal(String.valueOf(prevFireTime)));
            ps.setString(6, state);

            TriggerPersistenceDelegate tDel = findTriggerPersistenceDelegate(trigger);

            String type = TTYPE_BLOB;
            if(tDel != null)
                type = tDel.getHandledTriggerTypeDiscriminator();

            ps.setString(7, type);

            ps.setBigDecimal(8, new BigDecimal(String.valueOf(trigger
                    .getStartTime().getTime())));
            long endTime = 0;
            if (trigger.getEndTime() != null) {
                endTime = trigger.getEndTime().getTime();
            }
            ps.setBigDecimal(9, new BigDecimal(String.valueOf(endTime)));
            ps.setString(10, trigger.getCalendarName());
            ps.setInt(11, trigger.getMisfireInstruction());
            ps.setInt(12, trigger.getPriority());

            if(updateJobData) {
                setBytes(ps, 13, baos);
                ps.setString(14, trigger.getKey().getName());
                ps.setString(15, trigger.getKey().getGroup());
            } else {
                ps.setString(13, trigger.getKey().getName());
                ps.setString(14, trigger.getKey().getGroup());
            }

            insertResult = ps.executeUpdate();

            if(tDel == null)
                updateBlobTrigger(conn, trigger);
            else
                tDel.updateExtendedTriggerProperties(conn, trigger, state, jobDetail);

        } finally {
            closeStatement(ps);
        }

        return insertResult;
    }

    @Override
    public int updateBlobTrigger(Connection conn, OperableTrigger trigger) throws SQLException, IOException {
        PreparedStatement ps = null;
        ByteArrayOutputStream os = null;

        try {
            // update the blob
            os = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(trigger);
            oos.close();

            byte[] buf = os.toByteArray();
            ByteArrayInputStream is = new ByteArrayInputStream(buf);

            ps = conn.prepareStatement(rtp(UPDATE_BLOB_TRIGGER));
            ps.setBinaryStream(1, is, buf.length);
            ps.setString(2, trigger.getKey().getName());
            ps.setString(3, trigger.getKey().getGroup());

            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
            if (os != null) {
                os.close();
            }
        }
    }

    @Override
    public boolean triggerExists(Connection conn, TriggerKey triggerKey) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(SELECT_TRIGGER_EXISTENCE));
            ps.setString(1, triggerKey.getName());
            ps.setString(2, triggerKey.getGroup());
            rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public int updateTriggerState(Connection conn, TriggerKey triggerKey, String state) throws SQLException {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(rtp(UPDATE_TRIGGER_STATE));
            ps.setString(1, state);
            ps.setString(2, triggerKey.getName());
            ps.setString(3, triggerKey.getGroup());
            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public int updateTriggerStateFromOtherStates(Connection conn, TriggerKey triggerKey, String newState, String oldState1, String oldState2, String oldState3) throws SQLException {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(rtp(UPDATE_TRIGGER_STATE_FROM_STATES));
            ps.setString(1, newState);
            ps.setString(2, triggerKey.getName());
            ps.setString(3, triggerKey.getGroup());
            ps.setString(4, oldState1);
            ps.setString(5, oldState2);
            ps.setString(6, oldState3);

            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }    }

    @Override
    public int updateTriggerGroupStateFromOtherStates(Connection conn, GroupMatcher<TriggerKey> matcher, String newState, String oldState1, String oldState2, String oldState3) throws SQLException {
        PreparedStatement ps = null;

        try {
            ps = conn
                    .prepareStatement(rtp(UPDATE_TRIGGER_GROUP_STATE_FROM_STATES));
            ps.setString(1, newState);
            ps.setString(2, toSqlLikeClause(matcher));
            ps.setString(3, oldState1);
            ps.setString(4, oldState2);
            ps.setString(5, oldState3);

            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public int updateTriggerStateFromOtherState(Connection conn, TriggerKey triggerKey, String newState, String oldState) throws SQLException {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(rtp(UPDATE_TRIGGER_STATE_FROM_STATE));
            ps.setString(1, newState);
            ps.setString(2, triggerKey.getName());
            ps.setString(3, triggerKey.getGroup());
            ps.setString(4, oldState);

            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public int updateTriggerGroupStateFromOtherState(Connection conn, GroupMatcher<TriggerKey> matcher, String newState, String oldState) throws SQLException {
        PreparedStatement ps = null;

        try {
            ps = conn
                    .prepareStatement(rtp(UPDATE_TRIGGER_GROUP_STATE_FROM_STATE));
            ps.setString(1, newState);
            ps.setString(2, toSqlLikeClause(matcher));
            ps.setString(3, oldState);

            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public int updateTriggerStatesForJob(Connection conn, JobKey jobKey, String state) throws SQLException {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(rtp(UPDATE_JOB_TRIGGER_STATES));
            ps.setString(1, state);
            ps.setString(2, jobKey.getName());
            ps.setString(3, jobKey.getGroup());

            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public int updateTriggerStatesForJobFromOtherState(Connection conn, JobKey jobKey, String state, String oldState) throws SQLException {
        PreparedStatement ps = null;

        try {
            ps = conn
                    .prepareStatement(rtp(UPDATE_JOB_TRIGGER_STATES_FROM_OTHER_STATE));
            ps.setString(1, state);
            ps.setString(2, jobKey.getName());
            ps.setString(3, jobKey.getGroup());
            ps.setString(4, oldState);

            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public int deleteBlobTrigger(Connection conn, TriggerKey triggerKey) throws SQLException {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(rtp(DELETE_BLOB_TRIGGER));
            ps.setString(1, triggerKey.getName());
            ps.setString(2, triggerKey.getGroup());

            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public int deleteTrigger(Connection conn, TriggerKey triggerKey) throws SQLException {
        PreparedStatement ps = null;

        deleteTriggerExtension(conn, triggerKey);

        try {
            ps = conn.prepareStatement(rtp(DELETE_TRIGGER));
            ps.setString(1, triggerKey.getName());
            ps.setString(2, triggerKey.getGroup());

            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public int selectNumTriggersForJob(Connection conn, JobKey jobKey) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(SELECT_NUM_TRIGGERS_FOR_JOB));
            ps.setString(1, jobKey.getName());
            ps.setString(2, jobKey.getGroup());
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            } else {
                return 0;
            }
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public JobDetail selectJobForTrigger(Connection conn, ClassLoadHelper loadHelper, TriggerKey triggerKey, boolean loadJobClass) throws ClassNotFoundException, SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(SELECT_JOB_FOR_TRIGGER));
            ps.setString(1, triggerKey.getName());
            ps.setString(2, triggerKey.getGroup());
            rs = ps.executeQuery();

            if (rs.next()) {
                JobDetailImpl job = new JobDetailImpl();
                job.setName(rs.getString(1));
                job.setGroup(rs.getString(2));
                job.setDurability(getBoolean(rs, 3));
                if (loadJobClass)
                    job.setJobClass(loadHelper.loadClass(rs.getString(4), Job.class));
                job.setRequestsRecovery(getBoolean(rs, 5));

                return job;
            } else {
                if (logger.isDebugEnabled()) {
                    logger.debug("No job for trigger '" + triggerKey + "'.");
                }
                return null;
            }
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public List<OperableTrigger> selectTriggersForJob(Connection conn, JobKey jobKey) throws SQLException, ClassNotFoundException, IOException, JobPersistenceException {
        LinkedList<OperableTrigger> trigList = new LinkedList<OperableTrigger>();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(SELECT_TRIGGERS_FOR_JOB));
            ps.setString(1, jobKey.getName());
            ps.setString(2, jobKey.getGroup());
            rs = ps.executeQuery();

            while (rs.next()) {
                OperableTrigger t = selectTrigger(conn, triggerKey(rs.getString(COL_TRIGGER_NAME), rs.getString(COL_TRIGGER_GROUP)));
                if(t != null) {
                    trigList.add(t);
                }
            }
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }

        return trigList;
    }

    @Override
    public List<OperableTrigger> selectTriggersForCalendar(Connection conn, String calName) throws SQLException, ClassNotFoundException, IOException, JobPersistenceException {
        LinkedList<OperableTrigger> trigList = new LinkedList<OperableTrigger>();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(SELECT_TRIGGERS_FOR_CALENDAR));
            ps.setString(1, calName);
            rs = ps.executeQuery();

            while (rs.next()) {
                trigList.add(selectTrigger(conn, triggerKey(rs.getString(COL_TRIGGER_NAME), rs.getString(COL_TRIGGER_GROUP))));
            }
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }

        return trigList;
    }

    @Override
    public OperableTrigger selectTrigger(Connection conn, TriggerKey triggerKey) throws SQLException, ClassNotFoundException, IOException, JobPersistenceException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            OperableTrigger trigger = null;

            ps = conn.prepareStatement(rtp(SELECT_TRIGGER));
            ps.setString(1, triggerKey.getName());
            ps.setString(2, triggerKey.getGroup());
            rs = ps.executeQuery();

            if (rs.next()) {
                String jobName = rs.getString(COL_JOB_NAME);
                String jobGroup = rs.getString(COL_JOB_GROUP);
                String description = rs.getString(COL_DESCRIPTION);
                long nextFireTime = rs.getLong(COL_NEXT_FIRE_TIME);
                long prevFireTime = rs.getLong(COL_PREV_FIRE_TIME);
                String triggerType = rs.getString(COL_TRIGGER_TYPE);
                long startTime = rs.getLong(COL_START_TIME);
                long endTime = rs.getLong(COL_END_TIME);
                String calendarName = rs.getString(COL_CALENDAR_NAME);
                int misFireInstr = rs.getInt(COL_MISFIRE_INSTRUCTION);
                int priority = rs.getInt(COL_PRIORITY);

                Map<?, ?> map = null;
                if (canUseProperties()) {
                    map = getMapFromProperties(rs);
                } else {
                    map = (Map<?, ?>) getObjectFromBlob(rs, COL_JOB_DATAMAP);
                }

                Date nft = null;
                if (nextFireTime > 0) {
                    nft = new Date(nextFireTime);
                }

                Date pft = null;
                if (prevFireTime > 0) {
                    pft = new Date(prevFireTime);
                }
                Date startTimeD = new Date(startTime);
                Date endTimeD = null;
                if (endTime > 0) {
                    endTimeD = new Date(endTime);
                }

                if (triggerType.equals(TTYPE_BLOB)) {
                    rs.close(); rs = null;
                    ps.close(); ps = null;

                    ps = conn.prepareStatement(rtp(SELECT_BLOB_TRIGGER));
                    ps.setString(1, triggerKey.getName());
                    ps.setString(2, triggerKey.getGroup());
                    rs = ps.executeQuery();

                    if (rs.next()) {
                        trigger = (OperableTrigger) getObjectFromBlob(rs, COL_BLOB);
                    }
                }
                else {
                    TriggerPersistenceDelegate tDel = findTriggerPersistenceDelegate(triggerType);

                    if(tDel == null)
                        throw new JobPersistenceException("No TriggerPersistenceDelegate for trigger discriminator type: " + triggerType);

                    TriggerPersistenceDelegate.TriggerPropertyBundle triggerProps = null;
                    try {
                        triggerProps = tDel.loadExtendedTriggerProperties(conn, triggerKey);
                    } catch (IllegalStateException isex) {
                        if (isTriggerStillPresent(ps)) {
                            throw isex;
                        } else {
                            // QTZ-386 Trigger has been deleted
                            return null;
                        }
                    }

                    TriggerBuilder<?> tb = newTrigger()
                            .withDescription(description)
                            .withPriority(priority)
                            .startAt(startTimeD)
                            .endAt(endTimeD)
                            .withIdentity(triggerKey)
                            .modifiedByCalendar(calendarName)
                            .withSchedule(triggerProps.getScheduleBuilder())
                            .forJob(jobKey(jobName, jobGroup));

                    if (null != map) {
                        tb.usingJobData(new JobDataMap(map));
                    }

                    trigger = (OperableTrigger) tb.build();

                    trigger.setMisfireInstruction(misFireInstr);
                    trigger.setNextFireTime(nft);
                    trigger.setPreviousFireTime(pft);

                    setTriggerStateProperties(trigger, triggerProps);
                }
            }

            return trigger;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    private boolean isTriggerStillPresent(PreparedStatement ps) throws SQLException {
        ResultSet rs = null;
        try {
            rs = ps.executeQuery();
            return rs.next();
        } finally {
            closeResultSet(rs);
        }
    }

    private void setTriggerStateProperties(OperableTrigger trigger, TriggerPersistenceDelegate.TriggerPropertyBundle props) throws JobPersistenceException {

        if(props.getStatePropertyNames() == null)
            return;

        Util.setBeanProps(trigger, props.getStatePropertyNames(), props.getStatePropertyValues());
    }

    @Override
    public JobDataMap selectTriggerJobDataMap(Connection conn, String triggerName, String groupName) throws SQLException, ClassNotFoundException, IOException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(SELECT_TRIGGER_DATA));
            ps.setString(1, triggerName);
            ps.setString(2, groupName);
            rs = ps.executeQuery();

            if (rs.next()) {

                Map<?, ?> map = null;
                if (canUseProperties()) {
                    map = getMapFromProperties(rs);
                } else {
                    map = (Map<?, ?>) getObjectFromBlob(rs, COL_JOB_DATAMAP);
                }

                rs.close();
                ps.close();

                if (null != map) {
                    return new JobDataMap(map);
                }
            }
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }

        return new JobDataMap();
    }

    @Override
    public String selectTriggerState(Connection conn, TriggerKey triggerKey) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String state = null;

            ps = conn.prepareStatement(rtp(SELECT_TRIGGER_STATE));
            ps.setString(1, triggerKey.getName());
            ps.setString(2, triggerKey.getGroup());
            rs = ps.executeQuery();

            if (rs.next()) {
                state = rs.getString(COL_TRIGGER_STATE);
            } else {
                state = STATE_DELETED;
            }

            return state.intern();
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public TriggerStatus selectTriggerStatus(Connection conn, TriggerKey triggerKey) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            TriggerStatus status = null;

            ps = conn.prepareStatement(rtp(SELECT_TRIGGER_STATUS));
            ps.setString(1, triggerKey.getName());
            ps.setString(2, triggerKey.getGroup());
            rs = ps.executeQuery();

            if (rs.next()) {
                String state = rs.getString(COL_TRIGGER_STATE);
                long nextFireTime = rs.getLong(COL_NEXT_FIRE_TIME);
                String jobName = rs.getString(COL_JOB_NAME);
                String jobGroup = rs.getString(COL_JOB_GROUP);

                Date nft = null;
                if (nextFireTime > 0) {
                    nft = new Date(nextFireTime);
                }

                status = new TriggerStatus(state, nft);
                status.setKey(triggerKey);
                status.setJobKey(jobKey(jobName, jobGroup));
            }

            return status;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public int selectNumTriggers(Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            int count = 0;
            ps = conn.prepareStatement(rtp(SELECT_NUM_TRIGGERS));
            rs = ps.executeQuery();

            if (rs.next()) {
                count = rs.getInt(1);
            }

            return count;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public List<String> selectTriggerGroups(Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(SELECT_TRIGGER_GROUPS));
            rs = ps.executeQuery();

            LinkedList<String> list = new LinkedList<String>();
            while (rs.next()) {
                list.add(rs.getString(1));
            }

            return list;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public List<String> selectTriggerGroups(Connection conn, GroupMatcher<TriggerKey> matcher) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(SELECT_TRIGGER_GROUPS_FILTERED));
            ps.setString(1, toSqlLikeClause(matcher));
            rs = ps.executeQuery();

            LinkedList<String> list = new LinkedList<String>();
            while (rs.next()) {
                list.add(rs.getString(1));
            }

            return list;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public Set<TriggerKey> selectTriggersInGroup(Connection conn, GroupMatcher<TriggerKey> matcher) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            if(isMatcherEquals(matcher)) {
                ps = conn.prepareStatement(rtp(SELECT_TRIGGERS_IN_GROUP));
                ps.setString(1, toSqlEqualsClause(matcher));
            }
            else {
                ps = conn.prepareStatement(rtp(SELECT_TRIGGERS_IN_GROUP_LIKE));
                ps.setString(1, toSqlLikeClause(matcher));
            }
            rs = ps.executeQuery();

            Set<TriggerKey> keys = new HashSet<TriggerKey>();
            while (rs.next()) {
                keys.add(triggerKey(rs.getString(1), rs.getString(2)));
            }

            return keys;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public int insertPausedTriggerGroup(Connection conn, String groupName) throws SQLException {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(rtp(INSERT_PAUSED_TRIGGER_GROUP));
            ps.setString(1, groupName);
            int rows = ps.executeUpdate();

            return rows;
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public int deletePausedTriggerGroup(Connection conn, String groupName) throws SQLException {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(rtp(DELETE_PAUSED_TRIGGER_GROUP));
            ps.setString(1, groupName);
            int rows = ps.executeUpdate();

            return rows;
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public int deletePausedTriggerGroup(Connection conn, GroupMatcher<TriggerKey> matcher) throws SQLException {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(rtp(DELETE_PAUSED_TRIGGER_GROUP));
            ps.setString(1, toSqlLikeClause(matcher));
            int rows = ps.executeUpdate();

            return rows;
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public int deleteAllPausedTriggerGroups(Connection conn) throws SQLException {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(rtp(DELETE_PAUSED_TRIGGER_GROUPS));
            int rows = ps.executeUpdate();

            return rows;
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public boolean isTriggerGroupPaused(Connection conn, String groupName) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(SELECT_PAUSED_TRIGGER_GROUP));
            ps.setString(1, groupName);
            rs = ps.executeQuery();

            return rs.next();
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public boolean isExistingTriggerGroup(Connection conn, String groupName) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(SELECT_NUM_TRIGGERS_IN_GROUP));
            ps.setString(1, groupName);
            rs = ps.executeQuery();

            if (!rs.next()) {
                return false;
            }

            return (rs.getInt(1) > 0);
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public int insertCalendar(Connection conn, String calendarName, Calendar calendar) throws IOException, SQLException {
        ByteArrayOutputStream baos = serializeObject(calendar);

        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(rtp(INSERT_CALENDAR));
            ps.setString(1, calendarName);
            setBytes(ps, 2, baos);

            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public int updateCalendar(Connection conn, String calendarName, Calendar calendar) throws IOException, SQLException {
        ByteArrayOutputStream baos = serializeObject(calendar);

        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(rtp(UPDATE_CALENDAR));
            setBytes(ps, 1, baos);
            ps.setString(2, calendarName);

            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public boolean calendarExists(Connection conn, String calendarName) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(SELECT_CALENDAR_EXISTENCE));
            ps.setString(1, calendarName);
            rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public Calendar selectCalendar(Connection conn, String calendarName) throws ClassNotFoundException, IOException, SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String selCal = rtp(SELECT_CALENDAR);
            ps = conn.prepareStatement(selCal);
            ps.setString(1, calendarName);
            rs = ps.executeQuery();

            Calendar cal = null;
            if (rs.next()) {
                cal = (Calendar) getObjectFromBlob(rs, COL_CALENDAR);
            }
            if (null == cal) {
                logger.warn("Couldn't find calendar with name '" + calendarName
                        + "'.");
            }
            return cal;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public boolean calendarIsReferenced(Connection conn, String calendarName) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(rtp(SELECT_REFERENCED_CALENDAR));
            ps.setString(1, calendarName);
            rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public int deleteCalendar(Connection conn, String calendarName) throws SQLException {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(rtp(DELETE_CALENDAR));
            ps.setString(1, calendarName);

            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public int selectNumCalendars(Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            int count = 0;
            ps = conn.prepareStatement(rtp(SELECT_NUM_CALENDARS));

            rs = ps.executeQuery();

            if (rs.next()) {
                count = rs.getInt(1);
            }

            return count;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public List<String> selectCalendars(Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(SELECT_CALENDARS));
            rs = ps.executeQuery();

            LinkedList<String> list = new LinkedList<String>();
            while (rs.next()) {
                list.add(rs.getString(1));
            }

            return list;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public TriggerKey selectTriggerForFireTime(Connection conn, long fireTime) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(rtp(SELECT_TRIGGER_FOR_FIRE_TIME));
            ps.setString(1, STATE_WAITING);
            ps.setBigDecimal(2, new BigDecimal(String.valueOf(fireTime)));
            rs = ps.executeQuery();

            if (rs.next()) {
                return new TriggerKey(rs.getString(COL_TRIGGER_NAME), rs
                        .getString(COL_TRIGGER_GROUP));
            } else {
                return null;
            }
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public List<TriggerKey> selectTriggerToAcquire(Connection conn, long noLaterThan, long noEarlierThan, int maxCount) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<TriggerKey> nextTriggers = new LinkedList<TriggerKey>();
        try {
            ps = conn.prepareStatement(rtp(SELECT_NEXT_TRIGGER_TO_ACQUIRE));

            // Set max rows to retrieve
            if (maxCount < 1)
                maxCount = 1; // we want at least one trigger back.
            ps.setMaxRows(maxCount);

            // Try to give jdbc driver a hint to hopefully not pull over more than the few rows we actually need.
            // Note: in some jdbc drivers, such as MySQL, you must set maxRows before fetchSize, or you get exception!
            ps.setFetchSize(maxCount);

            ps.setString(1, STATE_WAITING);
            ps.setBigDecimal(2, new BigDecimal(String.valueOf(noLaterThan)));
            ps.setBigDecimal(3, new BigDecimal(String.valueOf(noEarlierThan)));
            rs = ps.executeQuery();

            while (rs.next() && nextTriggers.size() < maxCount) {
                nextTriggers.add(triggerKey(
                        rs.getString(COL_TRIGGER_NAME),
                        rs.getString(COL_TRIGGER_GROUP)));
            }

            return nextTriggers;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public int insertFiredTrigger(Connection conn, OperableTrigger trigger, String state, JobDetail job) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(rtp(INSERT_FIRED_TRIGGER));
            ps.setString(1, trigger.getFireInstanceId());
            ps.setString(2, trigger.getKey().getName());
            ps.setString(3, trigger.getKey().getGroup());
            ps.setString(4, instanceId);
            ps.setBigDecimal(5, new BigDecimal(String.valueOf(System.currentTimeMillis())));
            ps.setBigDecimal(6, new BigDecimal(String.valueOf(trigger.getNextFireTime().getTime())));
            ps.setString(7, state);
            if (job != null) {
                ps.setString(8, trigger.getJobKey().getName());
                ps.setString(9, trigger.getJobKey().getGroup());
                setBoolean(ps, 10, job.isConcurrentExectionDisallowed());
                setBoolean(ps, 11, job.requestsRecovery());
            } else {
                ps.setString(8, null);
                ps.setString(9, null);
                setBoolean(ps, 10, false);
                setBoolean(ps, 11, false);
            }
            ps.setInt(12, trigger.getPriority());

            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public int updateFiredTrigger(Connection conn, OperableTrigger trigger, String state, JobDetail job) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(rtp(UPDATE_FIRED_TRIGGER));

            ps.setString(1, instanceId);

            ps.setBigDecimal(2, new BigDecimal(String.valueOf(System.currentTimeMillis())));
            ps.setBigDecimal(3, new BigDecimal(String.valueOf(trigger.getNextFireTime().getTime())));
            ps.setString(4, state);

            if (job != null) {
                ps.setString(5, trigger.getJobKey().getName());
                ps.setString(6, trigger.getJobKey().getGroup());
                setBoolean(ps, 7, job.isConcurrentExectionDisallowed());
                setBoolean(ps, 8, job.requestsRecovery());
            } else {
                ps.setString(5, null);
                ps.setString(6, null);
                setBoolean(ps, 7, false);
                setBoolean(ps, 8, false);
            }

            ps.setString(9, trigger.getFireInstanceId());


            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public List<FiredTriggerRecord> selectFiredTriggerRecords(Connection conn, String triggerName, String groupName) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            List<FiredTriggerRecord> lst = new LinkedList<FiredTriggerRecord>();

            if (triggerName != null) {
                ps = conn.prepareStatement(rtp(SELECT_FIRED_TRIGGER));
                ps.setString(1, triggerName);
                ps.setString(2, groupName);
            } else {
                ps = conn.prepareStatement(rtp(SELECT_FIRED_TRIGGER_GROUP));
                ps.setString(1, groupName);
            }
            rs = ps.executeQuery();

            while (rs.next()) {
                FiredTriggerRecord rec = new FiredTriggerRecord();

                rec.setFireInstanceId(rs.getString(COL_ENTRY_ID));
                rec.setFireInstanceState(rs.getString(COL_ENTRY_STATE));
                rec.setFireTimestamp(rs.getLong(COL_FIRED_TIME));
                rec.setScheduleTimestamp(rs.getLong(COL_SCHED_TIME));
                rec.setPriority(rs.getInt(COL_PRIORITY));
                rec.setSchedulerInstanceId(rs.getString(COL_INSTANCE_NAME));
                rec.setTriggerKey(triggerKey(rs.getString(COL_TRIGGER_NAME), rs
                        .getString(COL_TRIGGER_GROUP)));
                if (!rec.getFireInstanceState().equals(STATE_ACQUIRED)) {
                    rec.setJobDisallowsConcurrentExecution(getBoolean(rs, COL_IS_NONCONCURRENT));
                    rec.setJobRequestsRecovery(rs
                            .getBoolean(COL_REQUESTS_RECOVERY));
                    rec.setJobKey(jobKey(rs.getString(COL_JOB_NAME), rs
                            .getString(COL_JOB_GROUP)));
                }
                lst.add(rec);
            }

            return lst;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public List<FiredTriggerRecord> selectFiredTriggerRecordsByJob(Connection conn, String jobName, String groupName) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            List<FiredTriggerRecord> lst = new LinkedList<FiredTriggerRecord>();

            if (jobName != null) {
                ps = conn.prepareStatement(rtp(SELECT_FIRED_TRIGGERS_OF_JOB));
                ps.setString(1, jobName);
                ps.setString(2, groupName);
            } else {
                ps = conn
                        .prepareStatement(rtp(SELECT_FIRED_TRIGGERS_OF_JOB_GROUP));
                ps.setString(1, groupName);
            }
            rs = ps.executeQuery();

            while (rs.next()) {
                FiredTriggerRecord rec = new FiredTriggerRecord();

                rec.setFireInstanceId(rs.getString(COL_ENTRY_ID));
                rec.setFireInstanceState(rs.getString(COL_ENTRY_STATE));
                rec.setFireTimestamp(rs.getLong(COL_FIRED_TIME));
                rec.setScheduleTimestamp(rs.getLong(COL_SCHED_TIME));
                rec.setPriority(rs.getInt(COL_PRIORITY));
                rec.setSchedulerInstanceId(rs.getString(COL_INSTANCE_NAME));
                rec.setTriggerKey(triggerKey(rs.getString(COL_TRIGGER_NAME), rs
                        .getString(COL_TRIGGER_GROUP)));
                if (!rec.getFireInstanceState().equals(STATE_ACQUIRED)) {
                    rec.setJobDisallowsConcurrentExecution(getBoolean(rs, COL_IS_NONCONCURRENT));
                    rec.setJobRequestsRecovery(rs
                            .getBoolean(COL_REQUESTS_RECOVERY));
                    rec.setJobKey(jobKey(rs.getString(COL_JOB_NAME), rs
                            .getString(COL_JOB_GROUP)));
                }
                lst.add(rec);
            }

            return lst;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public List<FiredTriggerRecord> selectInstancesFiredTriggerRecords(Connection conn, String instanceName) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            List<FiredTriggerRecord> lst = new LinkedList<FiredTriggerRecord>();

            ps = conn.prepareStatement(rtp(SELECT_INSTANCES_FIRED_TRIGGERS));
            ps.setString(1, instanceName);
            rs = ps.executeQuery();

            while (rs.next()) {
                FiredTriggerRecord rec = new FiredTriggerRecord();

                rec.setFireInstanceId(rs.getString(COL_ENTRY_ID));
                rec.setFireInstanceState(rs.getString(COL_ENTRY_STATE));
                rec.setFireTimestamp(rs.getLong(COL_FIRED_TIME));
                rec.setScheduleTimestamp(rs.getLong(COL_SCHED_TIME));
                rec.setSchedulerInstanceId(rs.getString(COL_INSTANCE_NAME));
                rec.setTriggerKey(triggerKey(rs.getString(COL_TRIGGER_NAME), rs
                        .getString(COL_TRIGGER_GROUP)));
                if (!rec.getFireInstanceState().equals(STATE_ACQUIRED)) {
                    rec.setJobDisallowsConcurrentExecution(getBoolean(rs, COL_IS_NONCONCURRENT));
                    rec.setJobRequestsRecovery(rs
                            .getBoolean(COL_REQUESTS_RECOVERY));
                    rec.setJobKey(jobKey(rs.getString(COL_JOB_NAME), rs
                            .getString(COL_JOB_GROUP)));
                }
                rec.setPriority(rs.getInt(COL_PRIORITY));
                lst.add(rec);
            }

            return lst;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public Set<String> selectFiredTriggerInstanceNames(Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Set<String> instanceNames = new HashSet<String>();

            ps = conn.prepareStatement(rtp(SELECT_FIRED_TRIGGER_INSTANCE_NAMES));
            rs = ps.executeQuery();

            while (rs.next()) {
                instanceNames.add(rs.getString(COL_INSTANCE_NAME));
            }

            return instanceNames;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public int deleteFiredTrigger(Connection conn, String entryId) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(rtp(DELETE_FIRED_TRIGGER));
            ps.setString(1, entryId);

            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public int selectJobExecutionCount(Connection conn, JobKey jobKey) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(rtp(SELECT_JOB_EXECUTION_COUNT));
            ps.setString(1, jobKey.getName());
            ps.setString(2, jobKey.getGroup());

            rs = ps.executeQuery();

            return (rs.next()) ? rs.getInt(1) : 0;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public int insertSchedulerState(Connection conn, String theInstanceId, long checkInTime, long interval) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(rtp(INSERT_SCHEDULER_STATE));
            ps.setString(1, theInstanceId);
            ps.setLong(2, checkInTime);
            ps.setLong(3, interval);

            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public int deleteSchedulerState(Connection conn, String theInstanceId) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(rtp(DELETE_SCHEDULER_STATE));
            ps.setString(1, theInstanceId);

            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public int updateSchedulerState(Connection conn, String theInstanceId, long checkInTime) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(rtp(UPDATE_SCHEDULER_STATE));
            ps.setLong(1, checkInTime);
            ps.setString(2, theInstanceId);

            return ps.executeUpdate();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public List<SchedulerStateRecord> selectSchedulerStateRecords(Connection conn, String theInstanceId) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            List<SchedulerStateRecord> lst = new LinkedList<SchedulerStateRecord>();

            if (theInstanceId != null) {
                ps = conn.prepareStatement(rtp(SELECT_SCHEDULER_STATE));
                ps.setString(1, theInstanceId);
            } else {
                ps = conn.prepareStatement(rtp(SELECT_SCHEDULER_STATES));
            }
            rs = ps.executeQuery();

            while (rs.next()) {
                SchedulerStateRecord rec = new SchedulerStateRecord();

                rec.setSchedulerInstanceId(rs.getString(COL_INSTANCE_NAME));
                rec.setCheckinTimestamp(rs.getLong(COL_LAST_CHECKIN_TIME));
                rec.setCheckinInterval(rs.getLong(COL_CHECKIN_INTERVAL));

                lst.add(rec);
            }

            return lst;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    public Set<String> selectPausedTriggerGroups(Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        HashSet<String> set = new HashSet<String>();
        try {
            ps = conn.prepareStatement(rtp(SELECT_PAUSED_TRIGGER_GROUPS));
            rs = ps.executeQuery();

            while (rs.next()) {
                String groupName = rs.getString(COL_TRIGGER_GROUP);
                set.add(groupName);
            }
            return set;
        } finally {
            closeResultSet(rs);
            closeStatement(ps);
        }
    }

    @Override
    protected void setBytes(PreparedStatement ps, int index, ByteArrayOutputStream baos) throws SQLException {
        byte[] data = (baos == null) ? null : baos.toByteArray();
        try {
            // 默认使用setBytes方法，可能有序驱动不支持这个方法，则再次尝试使用setObject(index, data, Types.BLOB);
            ps.setBytes(index, data);
        } catch (SQLException e) {
            // 如果上面的默认方法出错则使用这个方法尝试
            ps.setObject(index, data, Types.BLOB);
        }
    }

//    /**
//     * Sets the designated parameter to the given Java <code>boolean</code> value.
//     * This translates the boolean to 1/0 for true/false.
//     */
//    @Override
//    protected void setBoolean(PreparedStatement ps, int index, boolean val) throws SQLException {
//        ps.setString(index, ((val) ? "1" : "0"));
//    }
}
