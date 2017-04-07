package com.i5d5.basemodule.DI.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * class_name: ApplicationContext
 * package_name: com.i5d5.basemodule.DI.Qualifier
 * acthor: lucheng
 * application限定符，可以用来标识是application 还是activity
 * time: 2017/3/29 10:19
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationContext {
}
