package com.dogfood.aa20240808.service.dto.filters.atomic;

import com.dogfood.aa20240808.config.Constants;
import com.dogfood.aa20240808.domain.enumeration.ErrorCodeEnum;
import com.dogfood.aa20240808.domain.enumeration.BaseEnum;
import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.util.JacksonUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: sys
 */
public class IdentifierQueryFilter extends AbstractQueryFilter {

    private String name;
    private Object value;

    private List<Object> identifyValues = new ArrayList<>();

    private String preparedSql;

    public IdentifierQueryFilter() {
        this.concept = "Identifier";
    }

    public IdentifierQueryFilter(String name, Object value) {
        this();
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
    public List<Object> getIdentifyValues() {
        return identifyValues;
    }

    public void setIdentifyValues(List<Object> identifyValues) {
        this.identifyValues = identifyValues;
    }

    @Override
    public String sql(String dbType) {
        if (!StringUtils.isEmpty(preparedSql)) {
            // 处理过就不需要再处理了
            return preparedSql;
        }

        if (null == value) {
            identifyValues.add(NULL_STRING);
            preparedSql = QUESTION_MARK;
        } else if (value instanceof String) {
            identifyValues.add(value);
            preparedSql = QUESTION_MARK;
        } else if (value instanceof BaseEnum) {
            identifyValues.add(((BaseEnum)value).getCode());
            preparedSql = QUESTION_MARK;
        } else if (value instanceof List) {
            // ["a", "b"] --> ('a', 'b')
            List<?> values = ((List<?>) value);
            if (!CollectionUtils.isEmpty(values)) {
                StringBuilder placeholder = new StringBuilder();
                String split = "";
                for (Object o : values) {
                    placeholder.append(split);
                    placeholder.append(QUESTION_MARK);
                    split = SPLIT_COMMA;
                    identifyValues.add(o);
                }
                // 变量可能是个list，条件需要拆分成 (?,?,?)形式
                preparedSql = LEFT_PARENTHESES + placeholder + RIGHT_PARENTHESES;
            } else {
                identifyValues.add(NULL_STRING);
                preparedSql = QUESTION_MARK;
            }
        } else if (value instanceof Boolean || value instanceof Temporal) {
            identifyValues.add(value);
            preparedSql = QUESTION_MARK;
        } else {
            identifyValues.add(JacksonUtils.toJson(value));
            preparedSql = QUESTION_MARK;
        }

        return preparedSql;
    }
}

