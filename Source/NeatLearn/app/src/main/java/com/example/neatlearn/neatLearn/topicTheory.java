package com.example.neatlearn.neatLearn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.TextView;

import com.example.neatlearn.R;

public class topicTheory extends AppCompatActivity {

    WebView Wview;
    String topic="NA";
    String path="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_theory);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent i=getIntent();
        String topic_id=i.getStringExtra("topic_id");
        String topic_name=i.getStringExtra("topic_name");

        getSupportActionBar().setTitle(topic_name);

        String url=getStringResourceByName(topic_id);

        Wview = (WebView) findViewById(R.id.topicWebView);

        Wview.getSettings().setJavaScriptEnabled(true);
        Wview.loadUrl(url);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    private String getStringResourceByName(String aString){
        String packagename=getPackageName();
        int resId = getResources().getIdentifier(aString,"string",packagename);
        return getString(resId);
    }
}