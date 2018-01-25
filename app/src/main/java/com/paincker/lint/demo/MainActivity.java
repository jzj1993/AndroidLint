package com.paincker.lint.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "toast", Toast.LENGTH_SHORT);

        callNewApi();

        Log.d("tag", "msg");

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).run();
    }

    private void callNewApi() {
        new View(this).setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {

            }
        });
    }
}
