package com.dogfood.aa20240808.timing.delegate;

import org.quartz.JobDetail;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.SimpleTrigger;
import org.quartz.TriggerKey;
import org.quartz.impl.jdbcjobstore.SimpleTriggerPersistenceDelegate;
import org.quartz.impl.jdbcjobstore.Util;
import org.quartz.spi.OperableTrigger;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PluginSimpleTriggerPersistenceDelegate extends SimpleTriggerPersistenceDelegate {
    public static final String DELETE_SIMPLE_TRIGGER = "DELETE FROM {0}SIMPLE_TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?";
    public static final String INSERT_SIMPLE_TRIGGER = "INSERT INTO {0}SIMPLE_TRIGGERS (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP, REPEAT_COUNT, REPEAT_INTERVAL, TIMES_TRIGGERED)  VALUES({1}, ?, ?, ?, ?, ?)";
    public static final String SELECT_SIMPLE_TRIGGER = "SELECT * FROM {0}SIMPLE_TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?";
    public static final String UPDATE_SIMPLE_TRIGGER = "UPDATE {0}SIMPLE_TRIGGERS SET REPEAT_COUNT = ?, REPEAT_INTERVAL = ?, TIMES_TRIGGERED = ? WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?\n";

    @Override
    public int deleteExtendedTriggerProperties(Connection conn, TriggerKey triggerKey) throws SQLException {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(Util.rtp(DELETE_SIMPLE_TRIGGER, tablePrefix, schedNameLiteral));
            ps.setString(1, triggerKey.getName());
            ps.setString(2, triggerKey.getGroup());

            return ps.executeUpdate();
        } finally {
            Util.closeStatement(ps);
        }
    }

    @Override
    public int insertExtendedTriggerProperties(Connection conn, OperableTrigger trigger, String state, JobDetail jobDetail) throws SQLException, IOException {
        SimpleTrigger simpleTrigger = (SimpleTrigger)trigger;

        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(Util.rtp(INSERT_SIMPLE_TRIGGER, tablePrefix, schedNameLiteral));
            ps.setString(1, trigger.getKey().getName());
            ps.setString(2, trigger.getKey().getGroup());
            ps.setInt(3, simpleTrigger.getRepeatCount());
            ps.setBigDecimal(4, new BigDecimal(String.valueOf(simpleTrigger.getRepeatInterval())));
            ps.setInt(5, simpleTrigger.getTimesTriggered());

            return ps.executeUpdate();
        } finally {
            Util.closeStatement(ps);
        }
    }

    @Override
    public TriggerPropertyBundle loadExtendedTriggerProperties(Connection conn, TriggerKey triggerKey) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(Util.rtp(SELECT_SIMPLE_TRIGGER, tablePrefix, schedNameLiteral));
            ps.setString(1, triggerKey.getName());
            ps.setString(2, triggerKey.getGroup());
            rs = ps.executeQuery();

            if (rs.next()) {
                int repeatCount = rs.getInt(COL_REPEAT_COUNT);
                long repeatInterval = rs.getLong(COL_REPEAT_INTERVAL);
                int timesTriggered = rs.getInt(COL_TIMES_TRIGGERED);

                SimpleScheduleBuilder sb = SimpleScheduleBuilder.simpleSchedule()
                        .withRepeatCount(repeatCount)
                        .withIntervalInMilliseconds(repeatInterval);

                String[] statePropertyNames = { "timesTriggered" };
                Object[] statePropertyValues = { timesTriggered };

                return new TriggerPropertyBundle(sb, statePropertyNames, statePropertyValues);
            }

            throw new IllegalStateException("No record found for selection of Trigger with key: '" + triggerKey + "' and statement: " + Util.rtp(SELECT_SIMPLE_TRIGGER, tablePrefix, schedNameLiteral));
        } finally {
            Util.closeResultSet(rs);
            Util.closeStatement(ps);
        }
    }

    @Override
    public int updateExtendedTriggerProperties(Connection conn, OperableTrigger trigger, String state, JobDetail jobDetail) throws SQLException, IOException {
        SimpleTrigger simpleTrigger = (SimpleTrigger)trigger;

        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(Util.rtp(UPDATE_SIMPLE_TRIGGER, tablePrefix, schedNameLiteral));

            ps.setInt(1, simpleTrigger.getRepeatCount());
            ps.setBigDecimal(2, new BigDecimal(String.valueOf(simpleTrigger.getRepeatInterval())));
            ps.setInt(3, simpleTrigger.getTimesTriggered());
            ps.setString(4, simpleTrigger.getKey().getName());
            ps.setString(5, simpleTrigger.getKey().getGroup());

            return ps.executeUpdate();
        } finally {
            Util.closeStatement(ps);
        }
    }
}
