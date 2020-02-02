package com.example.map_display;

import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;

import android.os.Bundle;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        String url = "https:xyz.here.com/viewer/?project_id=e724b07b-1bc9-49d8-afb0-4e282d62749d";
        WebView web = (WebView) findViewById(R.id.webView);
        web.getSettings().setJavaScriptEnabled(true);

        web.loadUrl(url);

    }
}
