package com.martroutine.android.androiddaggerhelloworld.app;

import org.joda.time.DateTime;

import dagger.Module;

/**
 * Created by MARTROUTINE on 3/15/14.
 */

@Module(
        library = true
)
public class DateUtil {

    private DateTime dateTime;

    public DateUtil() {
        dateTime = new DateTime();
    }

    @Override
    public String toString() {
        return "DateUtil{" +
                dateTime.toString() +
                '}';
    }
}
