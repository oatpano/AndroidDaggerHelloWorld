package com.martroutine.android.androiddaggerhelloworld.app;

import com.martroutine.android.androiddaggerhelloworld.common.AndroidAppModule;

import dagger.Module;

/**
 * Created by MARTROUTINE on 3/18/14.
 */
@Module(
        complete = true,    // Here it enables object graph validation
        library = true,
        addsTo = AndroidAppModule.class,
        injects = {
                AndroidDaggerApplication.class
        }
)
public class AndroidDaggerScopeModule {

}
