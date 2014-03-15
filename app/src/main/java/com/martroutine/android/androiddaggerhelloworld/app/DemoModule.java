package com.martroutine.android.androiddaggerhelloworld.app;

/**
 * Created by MARTROUTINE on 3/15/14.
 */

import dagger.Module;
import dagger.Provides;

@Module(
        injects = MainActivity.class,
        complete = false
)
public class DemoModule {
    @Provides
    DateUtil getDateUtil() {
        return new DateUtil();
    }
}
