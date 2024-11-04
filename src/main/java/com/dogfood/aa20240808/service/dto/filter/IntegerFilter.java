package com.dogfood.aa20240808.service.dto.filter;

public class IntegerFilter extends RangeFilter<Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * <p>Constructor for IntegerFilter.</p>
     */
    public IntegerFilter() {
    }

    /**
     * <p>Constructor for IntegerFilter.</p>
     *
     * @param filter a IntegerFilter object.
     */
    public IntegerFilter(final IntegerFilter filter) {
        super(filter);
    }

    /**
     * <p>copy.</p>
     *
     * @return a IntegerFilter object.
     */
    @Override
    public IntegerFilter copy() {
        return new IntegerFilter(this);
    }

}
