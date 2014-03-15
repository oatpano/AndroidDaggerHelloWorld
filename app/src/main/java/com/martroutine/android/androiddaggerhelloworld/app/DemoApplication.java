package com.martroutine.android.androiddaggerhelloworld.app;

import android.app.Application;

import java.util.Arrays;
import java.util.List;

import dagger.ObjectGraph;

public class DemoApplication extends Application {

    private ObjectGraph graph;

    @Override
    public void onCreate() {
        super.onCreate();
        graph = ObjectGraph.create(getModules().toArray());
    }

    protected List<Object> getModules() {
        return Arrays.asList(
                new AndroidModule(this),
                new DemoModule(),
                new DateUtil()
        );
    }

    public void inject(Object object) {
        graph.inject(object);
    }
}
