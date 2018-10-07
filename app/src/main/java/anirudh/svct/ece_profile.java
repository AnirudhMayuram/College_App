package anirudh.svct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ece_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece_profile);
        WebView webView=(WebView)findViewById(R.id.ece_profile_web);
        webView.loadUrl("file:///android_asset/ece_profile.html");
    }
}
