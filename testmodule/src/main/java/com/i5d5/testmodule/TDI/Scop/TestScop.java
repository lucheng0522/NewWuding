package com.i5d5.testmodule.TDI.Scop;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * class_name: TestScop
 * package_name: com.i5d5.testmodule.TDI.Scop
 * acthor: lucheng
 * 子模块作用域
 * time: 2017/3/30 11:35
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface TestScop {
}
