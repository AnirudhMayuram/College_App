package anirudh.svct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class consultant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultant);
        WebView webView=(WebView)findViewById(R.id.consultant_web);
        webView.loadUrl("file:///android_asset/consultant.html");
    }
}
