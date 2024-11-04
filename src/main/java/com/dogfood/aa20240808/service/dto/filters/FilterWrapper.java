package com.dogfood.aa20240808.service.dto.filters;

/**
 * @author sys
 */
public class FilterWrapper {

    AbstractQueryFilter returnExpression;

    public AbstractQueryFilter getReturnExpression() {
        return returnExpression;
    }

    public void setReturnExpression(AbstractQueryFilter returnExpression) {
        this.returnExpression = returnExpression;
    }
}
