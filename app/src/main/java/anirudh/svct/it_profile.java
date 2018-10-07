package anirudh.svct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class it_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_profile);
        WebView webView=(WebView)findViewById(R.id.it_profile_web);
        webView.loadUrl("file:///android_asset/it_profile.html");
    }
}
