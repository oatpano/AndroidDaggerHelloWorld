package com.martroutine.android.androiddaggerhelloworld.activity;

import com.martroutine.android.androiddaggerhelloworld.app.AndroidDaggerScopeModule;

import dagger.Module;

@Module(
        complete = false,
        library = true,
        addsTo = AndroidDaggerScopeModule.class,
        injects = {
        }
)
public class UtilScopeModule {


}
