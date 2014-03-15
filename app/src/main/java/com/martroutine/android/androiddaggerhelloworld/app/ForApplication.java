package com.martroutine.android.androiddaggerhelloworld.app;

/**
 * Created by MARTROUTINE on 3/15/14.
 */
import java.lang.annotation.Retention;
import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier @Retention(RUNTIME)
public @interface ForApplication {
}
