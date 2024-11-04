package com.dogfood.aa20240808.service.dto.filters.logic.binary.logicCalculate;

import com.dogfood.aa20240808.service.dto.filters.logic.binary.BinaryExpressionFilter;

/**
 * @Author: sys
 */
public class OrQueryFilter extends BinaryExpressionFilter {

    public OrQueryFilter() {
        this.operator = "||";
    }

    @Override
    public String sql(String dbType) {
        return String.format(" (%s OR %s) ", left.sql(dbType), right.sql(dbType));
    }
}
