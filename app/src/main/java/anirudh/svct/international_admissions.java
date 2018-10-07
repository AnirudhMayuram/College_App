package anirudh.svct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class international_admissions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_international_admissions);
        WebView webView=(WebView)findViewById(R.id.international_admissions_web);
        webView.loadUrl("file:///android_asset/international_admissions.html");
    }
}
