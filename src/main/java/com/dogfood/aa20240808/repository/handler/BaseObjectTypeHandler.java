package com.dogfood.aa20240808.repository.handler;

import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.List;
import java.util.Map;

/**
 * @author sys
 * @Desc: implement custom object type converter
 */

public abstract class BaseObjectTypeHandler<T> extends BaseTypeHandler<T> {

    private static Logger LOGGER = LoggerFactory.getLogger(BaseObjectTypeHandler.class);

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, T t, JdbcType jdbcType) throws SQLException {
        String content = Objects.isNull(t) ? null : JacksonUtils.toJson(t);
        ps.setString(i, content);
    }

    @Override
    public T getNullableResult(ResultSet rs, String s) throws SQLException {
        return getObjectByJsonString(rs.getString(s));
    }

    @Override
    public T getNullableResult(ResultSet rs, int i) throws SQLException {
        return getObjectByJsonString(rs.getString(i));
    }

    @Override
    public T getNullableResult(CallableStatement cs, int i) throws SQLException {
        return getObjectByJsonString(cs.getString(i));
    }

    private T getObjectByJsonString(String content) {

        if (StringUtils.isBlank(content)) {
            return null;
        }

        try {
            return JacksonUtils.fromJson(content, getTypeReference());
        } catch (Exception e) {
            LOGGER.info("an exception occurred during deserialization for object type : {}", e.toString());
            throw new HttpCodeException(500, e.getMessage());
        }
    }

    abstract TypeReference<T> getTypeReference();
}
