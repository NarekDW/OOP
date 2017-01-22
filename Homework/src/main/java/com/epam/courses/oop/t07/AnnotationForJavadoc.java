package com.epam.courses.oop.t07;

import java.lang.annotation.*;

/**
 * Created by Narek on 21.01.2017.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface AnnotationForJavadoc {
    String author();
    String date();
    String lastModified();
    String lastModifiedBy();
    int currentVersion() default 1;
}
