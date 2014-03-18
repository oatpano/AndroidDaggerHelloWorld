package com.martroutine.android.androiddaggerhelloworld.common;

import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by MARTROUTINE on 3/18/14.
 */
@Qualifier
@Retention(RUNTIME)
public @interface ForActivity {
}
