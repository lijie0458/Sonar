package com.dogfood.aa20240808.service.dto.filter;

import java.math.BigDecimal;

public class BigDecimalFilter extends RangeFilter<BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * <p>Constructor for BigDecimalFilter.</p>
     */
    public BigDecimalFilter() {
    }

    /**
     * <p>Constructor for BigDecimalFilter.</p>
     *
     * @param filter a BigDecimalFilter object.
     */
    public BigDecimalFilter(final BigDecimalFilter filter) {
        super(filter);
    }

    /**
     * <p>copy.</p>
     *
     * @return a BigDecimalFilter object.
     */
    @Override
    public BigDecimalFilter copy() {
        return new BigDecimalFilter(this);
    }

}
