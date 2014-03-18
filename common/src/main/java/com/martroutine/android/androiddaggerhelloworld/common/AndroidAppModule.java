package com.martroutine.android.androiddaggerhelloworld.common;

import android.content.Context;
import android.location.LocationManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import static android.content.Context.LOCATION_SERVICE;

/**
 * Created by MARTROUTINE on 3/18/14.
 */

@Module(
        library = true
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
}
