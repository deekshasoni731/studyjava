package com.example.siddiqui.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ThiskeywordInJava extends AppCompatActivity {
    WebView mybrowser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thiskeyword_in_java);
        mybrowser=(WebView)findViewById(R.id.mybrowser);
        // ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1);

        mybrowser.loadUrl("file:///android_asset/Articles4.html");
    }
}
