package com.dogfood.aa20240808.service.dto.filters.logic.binary.compare;

import com.dogfood.aa20240808.service.dto.filters.logic.binary.BinaryExpressionFilter;

/**
 * @Author: sys
 */
public class LtQueryFilter extends BinaryExpressionFilter {

    public LtQueryFilter() {
        this.operator = "<";
    }

    @Override
    public String sql(String dbType) {
        return String.format(" (%s < %s) ", left.sql(dbType), right.sql(dbType));
    }
}
