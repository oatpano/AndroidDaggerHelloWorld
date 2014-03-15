package com.martroutine.android.androiddaggerhelloworld.app;

import android.location.LocationManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class MainActivity extends DemoBaseActivity {

    @InjectView(R.id.editText_to)
    EditText editText_to;

    @InjectView(R.id.result)
    TextView result;

    @InjectView(R.id.datetime)
    TextView datetime;

    @Inject
    LocationManager locationManager;

    @Inject
    DateUtil dateUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        datetime.setText(dateUtil.toString());
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

    @OnClick(R.id.submit_button)
    public void submit(){
        result.setText("Hello World to = " + editText_to.getText().toString());
    }

}
