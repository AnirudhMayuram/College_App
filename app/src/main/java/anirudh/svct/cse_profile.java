package anirudh.svct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class cse_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_profile);
        WebView webView=(WebView)findViewById(R.id.cse_profile_web);
        webView.loadUrl("file:///android_asset/cse_profile.html");
    }
}
