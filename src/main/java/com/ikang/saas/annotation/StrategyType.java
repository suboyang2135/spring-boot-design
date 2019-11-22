package com.ikang.saas.annotation;

import java.lang.annotation.*;

/**
 * @author xuyang
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface StrategyType {

    int value() default 0;
}
