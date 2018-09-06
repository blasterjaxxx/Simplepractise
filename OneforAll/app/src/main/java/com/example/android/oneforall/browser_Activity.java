package com.example.android.oneforall;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class browser_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browser_activity);

        Button btnSearch = findViewById(R.id.btnsearch);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail = ((EditText)findViewById(R.id.email)).getText().toString();
                String site = "https://"+mail;
                WebView myWebView = findViewById(R.id.webview);
                myWebView.loadUrl(site);
            }
        });
    }
}
