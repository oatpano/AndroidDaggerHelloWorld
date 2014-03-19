package com.martroutine.android.androiddaggerhelloworld.util;

import org.joda.time.DateTime;

/**
 * Created by MARTROUTINE on 3/19/14.
 */
public class DateUtil {
    private DateTime dateTime;

    public DateUtil() {
        dateTime = new DateTime();
    }

    @Override
    public String toString() {
        return "DateUtil{" +
                "dateTime= " + dateTime +
                '}';
    }
}
