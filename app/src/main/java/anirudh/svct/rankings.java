package anirudh.svct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class rankings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rankings);
        WebView webView=(WebView)findViewById(R.id.rankings_web);
        webView.loadUrl("file:///android_asset/rankings.html");
    }
}
