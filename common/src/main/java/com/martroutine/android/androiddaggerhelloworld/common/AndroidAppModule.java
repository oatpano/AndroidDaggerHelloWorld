package com.martroutine.android.androiddaggerhelloworld.common;

import android.content.Context;
import android.location.LocationManager;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import static android.content.Context.LOCATION_SERVICE;

/**
 * Created by MARTROUTINE on 3/18/14.
 */

@Module(
        complete = false,
        library = true,
        injects = {
        }
)
public class AndroidAppModule {
    static Context sApplicationContext = null;

    @Provides
    @Singleton
    @ForApplication
    Context provideApplicationContext() {
        return sApplicationContext;
    }

    @Provides
    @Singleton
    LocationManager provideLocationManager() {
        return (LocationManager) sApplicationContext.getSystemService(LOCATION_SERVICE);
    }

    @Provides
    @Singleton
    Bus provideBus(){
        return  new Bus(ThreadEnforcer.ANY);
    }
}
