package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView wView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        goster();
    }
    private void tanimla(){
        wView=findViewById(R.id.webView);
    }
    private void goster(){
        wView.getSettings().setJavaScriptEnabled(true);  // sitedeki javascript kodlarının çalışmasına izin verme
        wView.loadUrl("https://www.google.com.tr");
    }

    private void gosterHtml(){
        String htmlKod = "<html><head><title>Web Site Ornegi</title></head><body><h1>Html ornegi</h1></body></html>";
        wView.loadData(htmlKod,"text/html","UTF-8");
    }
}