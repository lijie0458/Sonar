package com.dogfood.aa20240808.repository.handler;

import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
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
 * @Desc: implement custom list type converter
 */
@MappedJdbcTypes(JdbcType.VARCHAR)
@MappedTypes({List.class})
public abstract class BaseListTypeHandler<T> extends BaseTypeHandler<List<T>> {

    private static Logger LOGGER = LoggerFactory.getLogger(BaseListTypeHandler.class);

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, List<T> parameter, JdbcType jdbcType) throws SQLException {
        String content = CollectionUtils.isEmpty(parameter) ? null : JacksonUtils.toJson(parameter);
        ps.setString(i, content);
    }

    @Override
    public List<T> getNullableResult(ResultSet rs, String s) throws SQLException {
        return this.getListByJsonString(rs.getString(s));
    }

    @Override
    public List<T> getNullableResult(ResultSet rs, int i) throws SQLException {
        return this.getListByJsonString(rs.getString(i));
    }

    @Override
    public List<T> getNullableResult(CallableStatement cs, int i) throws SQLException {
        return this.getListByJsonString(cs.getString(i));
    }

    private List<T> getListByJsonString(String content) {
        if (StringUtils.isBlank(content)) {
            return Collections.emptyList();
        }

        try {
            return JacksonUtils.fromJson(content, getTypeReference());
        } catch (Exception e) {
            LOGGER.info("an exception occurred during deserialization for list type : {}", e.toString());
            throw new HttpCodeException(500, e.getMessage());
        }
    }

    abstract TypeReference<List<T>> getTypeReference();
}
