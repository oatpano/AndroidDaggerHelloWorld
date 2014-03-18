package com.martroutine.android.androiddaggerhelloworld.common;

import android.app.Application;

import java.util.List;

import dagger.ObjectGraph;

/**
 * Created by MARTROUTINE on 3/18/14.
 */
public abstract class DaggerApplication extends Application {
    private ObjectGraph mObjectGraph;

    @Override
    public void onCreate() {
        super.onCreate();
        AndroidAppModule sharedAppModule = new AndroidAppModule();

        // bootstrap. So that it allows no-arg constructor in AndroidAppModule
        sharedAppModule.sApplicationContext = this.getApplicationContext();
    }

    protected abstract List<Object> getAppModules();

    public void inject(Object object) {
        mObjectGraph.inject(object);
    }

    public ObjectGraph getObjectGraph() {
        return mObjectGraph;
    }
}
