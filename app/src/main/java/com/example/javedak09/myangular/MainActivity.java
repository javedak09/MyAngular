package com.example.javedak09.myangular;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView client = (WebView) findViewById(R.id.WebView);

        /*WebSettings webSettings = client.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setSupportZoom(true);
        webSettings.setDefaultTextEncodingName("utf-8");*/


        client.getSettings().setDomStorageEnabled(true);
        client.getSettings().setJavaScriptEnabled(true);

        client.addJavascriptInterface(new MyJavascriptInterface(this), "JSScript");
        client.loadUrl("file:///android_asset/www/login.html");
    }

    public class MyJavascriptInterface {

        Context context;

        public MyJavascriptInterface(Context context) {
            this.context = context;
        }

        @android.webkit.JavascriptInterface
        public void getStringFromJS(String txtVal) {
            Toast.makeText(context, "Value From JS : " + txtVal, Toast.LENGTH_LONG).show();
        }

        @JavascriptInterface
        public void showToast(String toast) {
            Toast.makeText(context, toast, Toast.LENGTH_SHORT).show();
        }

    }
}