package com.martroutine.android.androiddaggerhelloworld.activity;

import android.app.Activity;
import android.content.Context;

import com.martroutine.android.androiddaggerhelloworld.app.AndroidDaggerScopeModule;
import com.martroutine.android.androiddaggerhelloworld.common.ForActivity;
import com.martroutine.android.androiddaggerhelloworld.util.DateUtil;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        complete = true,
        library = true,
        addsTo = AndroidDaggerScopeModule.class,
        injects = {
                MainActivity.class
        }
)
public class ActivityScopeModule {

    private final BaseDaggerActivity mActivity;

    public ActivityScopeModule(BaseDaggerActivity activity) {
        mActivity = activity;
    }

    @Provides
    @Singleton
    @ForActivity
    Context providesActivityContext() {
        return mActivity;
    }

    @Provides
    @Singleton
    Activity providesActivity() {
        return mActivity;
    }

    @Provides
    @Singleton
    DateUtil providesDateUtil() {
        return new DateUtil();
    }
}
