package com.dogfood.aa20240808.functional;

/**
 * matchExpression函数接口声明
 * @param <Param>
 * @param <Result>
 */
@FunctionalInterface
public interface MatchExpression<Param, Result> {
    Result match(Param param);
}
