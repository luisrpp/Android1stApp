package com.android1stapp.app;

import android.app.Activity;
import android.os.Bundle;

public class Android1stAppActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}