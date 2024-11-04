package com.dogfood.aa20240808.functional.wrapper;

import com.dogfood.aa20240808.functional.MatchExpression;

/**
 * 各表达式的封装类
 */
public class ExpressionWrapper {
    /**
     * matchExpression的封装方法
     * @param param
     * @param matchExpression
     * @return
     * @param <Param>
     * @param <Result>
     */
    public static <Param, Result> Result matchExpression(Param param, MatchExpression<Param, Result> matchExpression) {
        return matchExpression.match(param);
    }
}
