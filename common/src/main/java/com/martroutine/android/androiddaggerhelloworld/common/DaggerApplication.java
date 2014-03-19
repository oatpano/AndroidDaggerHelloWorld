package com.martroutine.android.androiddaggerhelloworld.common;

import android.app.Application;

import java.util.ArrayList;
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

        List<Object> modules = new ArrayList<Object>();
        modules.add(sharedAppModule);
        //modules.add(new UserAccountModule());
        //modules.add(new ThreadingModule());
        modules.addAll(getAppModules());

        mObjectGraph = ObjectGraph.create(modules.toArray());

        mObjectGraph.inject(this);
    }

    protected abstract List<Object> getAppModules();

    public void inject(Object object) {
        mObjectGraph.inject(object);
    }

    public ObjectGraph getObjectGraph() {
        return mObjectGraph;
    }
}
