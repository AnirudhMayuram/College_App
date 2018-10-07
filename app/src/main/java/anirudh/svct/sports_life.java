package anirudh.svct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class sports_life extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_life);
        WebView webView=(WebView)findViewById(R.id.sports_web);
        webView.loadUrl("file:///android_asset/sports.html");
    }
}
