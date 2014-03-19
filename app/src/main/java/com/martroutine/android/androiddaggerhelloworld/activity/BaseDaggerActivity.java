package com.martroutine.android.androiddaggerhelloworld.activity;

import com.martroutine.android.androiddaggerhelloworld.common.BaseActivity;

/**
 * Created by MARTROUTINE on 3/18/14.
 */
public abstract class BaseDaggerActivity extends BaseActivity {
    @Override
    protected Object[] geActivitytModules() {
        return new Object[] {
                new ActivityScopeModule(this),
                new UtilScopeModule(),
                // new AnotherCoolActivityScopedModule(),
        };
    }
}
