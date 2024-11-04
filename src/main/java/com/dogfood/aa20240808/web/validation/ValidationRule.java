package com.dogfood.aa20240808.web.validation;

/**
 * @author sys
 */
public @interface ValidationRule {
    String value();
    String targetName();
    String targetFunction() default "";
    String argvs() default "";
    String errorMsg() default "";
}
