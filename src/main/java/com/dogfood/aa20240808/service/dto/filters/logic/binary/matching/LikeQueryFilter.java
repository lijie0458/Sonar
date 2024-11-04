package com.dogfood.aa20240808.service.dto.filters.logic.binary.matching;

import com.dogfood.aa20240808.config.Constants;
import com.dogfood.aa20240808.domain.enumeration.ErrorCodeEnum;
import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.service.dto.filters.logic.binary.BinaryExpressionFilter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;

/**
 * @Author: sys
 */
public class LikeQueryFilter extends BinaryExpressionFilter {

    public LikeQueryFilter() {
        this.operator = "like";
    }

    @Override
    public String sql(String dbType) {
        dbType = StringUtils.defaultString(dbType, "");
        String likeString = "";
        switch (dbType) {
            case "mysql":
                likeString = StringUtils.replace("concat('%', concat(%s, '%'))", "%s", right.sql(dbType));
                return String.format(" (%s LIKE %s) ", left.sql(dbType), likeString);
            default:
                throw new HttpCodeException(HttpStatus.METHOD_NOT_ALLOWED.value(), ErrorCodeEnum.DB_TYPE_NOT_SUPPORT.code);
        }
    }
}
