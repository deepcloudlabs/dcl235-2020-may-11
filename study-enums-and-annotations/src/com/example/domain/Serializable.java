package com.example.domain;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented // javadoc
@Inherited // Inheritance
public @interface Serializable {
    int value() default 10; // primitive (double,int), Wrapper(Double,Integer)
                  // primitive array (double[],int[]), Wrapper(Double[],Integer[])
                  // Enum, Enum[]
                  // Annotation, Annotation[]
                  // String
}
