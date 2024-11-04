package com.dogfood.aa20240808.repository.handler;

import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.poi.ss.formula.functions.T;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author sys
 * @Desc: implement custom map type converter
 */
@MappedJdbcTypes(JdbcType.VARCHAR)
@MappedTypes({Map.class})
public abstract class BaseMapTypeHandler extends BaseTypeHandler<Map<T, T>> {

    private static Logger LOGGER = LoggerFactory.getLogger(BaseMapTypeHandler.class);

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Map<T, T> parameter, JdbcType jdbcType) throws SQLException {
        String content = CollectionUtils.isEmpty(parameter) ? null : JacksonUtils.toJson(parameter);
        ps.setString(i, content);
    }

    @Override
    public Map<T, T> getNullableResult(ResultSet rs, String s) throws SQLException {
        return getMapByJsonString(rs.getString(s));
    }

    @Override
    public Map<T, T> getNullableResult(ResultSet rs, int i) throws SQLException {
        return getMapByJsonString(rs.getString(i));
    }

    @Override
    public Map<T, T> getNullableResult(CallableStatement cs, int i) throws SQLException {
        return getMapByJsonString(cs.getString(i));
    }

    private Map<T, T> getMapByJsonString(String content) {
        if (StringUtils.isBlank(content)) {
            return Collections.emptyMap();
        }

        try {
            return JacksonUtils.fromJson(content, getTypeReference());
        } catch (Exception e) {
            LOGGER.info("an exception occurred during deserialization for map type : {}", e.toString());
            throw new HttpCodeException(500, e.getMessage());
        }
    }

    abstract TypeReference<Map<T, T>> getTypeReference();

}
