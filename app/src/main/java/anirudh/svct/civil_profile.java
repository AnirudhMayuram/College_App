package anirudh.svct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class civil_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_profile);
        WebView webView=(WebView)findViewById(R.id.civil_profile_web);
        webView.loadUrl("file:///android_asset/civil_profile.html");
    }
}
