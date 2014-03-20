package com.martroutine.android.androiddaggerhelloworld.event;

/**
 * Created by MARTROUTINE on 3/20/14.
 */
public class HelloWorldEvent {
    private String message;

    public HelloWorldEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
