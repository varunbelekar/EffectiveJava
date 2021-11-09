package com.varun.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Todo {
    enum Status{STARTED, NOT_STARTED}
    enum Priority{LOW, MEDIUM, HIGH}
    String author();

    Status status();

    Priority priority();
}
