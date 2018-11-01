package com.example.javedak09.myangular;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        WebView client = new WebView(this);
        client.loadUrl("file:///android_asset/www/login.html");
        client.getSettings().setJavaScriptEnabled(true);
        setContentView(client);
    }
}