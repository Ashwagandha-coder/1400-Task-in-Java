package com.Arifmetics;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FirstAnnotation {

    String value() default "a";

    int param() default 123456;

    int[] mass() default {2,6,7};

}
