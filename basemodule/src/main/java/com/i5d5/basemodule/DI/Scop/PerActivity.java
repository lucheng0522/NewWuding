package com.i5d5.basemodule.DI.Scop;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * class_name: PerActivity
 * package_name: com.i5d5.basemodule.DI.Scop
 * acthor: lucheng
 * 每个模块下的baseComponent使用的限定符，应为dagger2中具有依赖关系的component禁止使用相同作用域
 * time: 2017/3/30 11:59
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
