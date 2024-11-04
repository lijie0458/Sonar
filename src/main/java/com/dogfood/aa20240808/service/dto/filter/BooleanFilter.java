package com.dogfood.aa20240808.service.dto.filter;

public class BooleanFilter extends Filter<Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * <p>Constructor for BooleanFilter.</p>
     */
    public BooleanFilter() {
    }

    /**
     * <p>Constructor for BooleanFilter.</p>
     *
     * @param filter a BooleanFilter object.
     */
    public BooleanFilter(final BooleanFilter filter) {
        super(filter);
    }

    /** {@inheritDoc} */
    @Override
    public BooleanFilter copy() {
        return new BooleanFilter(this);
    }

}
