package com.martroutine.android.androiddaggerhelloworld.activity;

import com.martroutine.android.androiddaggerhelloworld.app.AndroidDaggerScopeModule;
import com.martroutine.android.androiddaggerhelloworld.util.DateUtil;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        complete = false,
        library = true,
        addsTo = AndroidDaggerScopeModule.class,
        injects = {
        }
)
public class UtilScopeModule {


}
