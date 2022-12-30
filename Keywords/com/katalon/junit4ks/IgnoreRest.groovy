package com.katalon.junit4ks

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target([ ElementType.METHOD ])
public @interface IgnoreRest {}