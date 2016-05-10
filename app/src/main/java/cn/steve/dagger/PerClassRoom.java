package cn.steve.dagger;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 自定义的scope
 *
 * Created by yantinggeng on 2016/5/9.
 */
@Scope
@Retention(RUNTIME)
public @interface PerClassRoom {

}
