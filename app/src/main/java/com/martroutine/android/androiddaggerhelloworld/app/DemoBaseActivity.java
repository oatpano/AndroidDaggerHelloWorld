package com.martroutine.android.androiddaggerhelloworld.app;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by MARTROUTINE on 3/15/14.
 */
public class DemoBaseActivity extends Activity{
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Perform injection so that when this call returns all dependencies will be available for use.
        ((DemoApplication) getApplication()).inject(this);
    }
}
