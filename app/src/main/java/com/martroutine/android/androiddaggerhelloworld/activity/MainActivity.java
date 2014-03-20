package com.martroutine.android.androiddaggerhelloworld.activity;

import android.location.LocationManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.martroutine.android.androiddaggerhelloworld.app.R;
import com.martroutine.android.androiddaggerhelloworld.event.HelloWorldEvent;
import com.martroutine.android.androiddaggerhelloworld.util.DateUtil;
import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;

import javax.inject.Inject;


public class MainActivity extends BaseDaggerActivity {
    @Inject
    LocationManager locationManager;

    @Inject
    DateUtil dateUtil;

    @Inject
    Bus bus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.datetime);
        textView.setText(dateUtil.toString());
        bus.post(new HelloWorldEvent("This is from Bus."));
    }

    @Override
    protected void onDestroy() {
        bus.unregister(this);
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Subscribe
    public void waitForEvent(HelloWorldEvent event) {
        TextView textView = (TextView) findViewById(R.id.busTextView);
        textView.setText(event.getMessage());
    }
}
