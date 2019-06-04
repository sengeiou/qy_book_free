package com.wy.adbook.di.scope;

import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;

import javax.inject.Scope;
import java.lang.annotation.Documented;

@Scope
@Documented
@Retention(AnnotationRetention.RUNTIME)
/**
 * 提供  for 收藏
 */
public @interface FavoriteScope {}