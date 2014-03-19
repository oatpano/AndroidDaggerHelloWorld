package com.martroutine.android.androiddaggerhelloworld.app;

import com.martroutine.android.androiddaggerhelloworld.common.DaggerApplication;

import java.util.Collections;
import java.util.List;

/**
 * Created by MARTROUTINE on 3/18/14.
 */
public class AndroidDaggerApplication extends DaggerApplication{
    @Override
    protected List<Object> getAppModules() {
        return Collections.<Object>singletonList(new AndroidDaggerScopeModule());
    }
}
