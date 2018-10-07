package anirudh.svct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class mous extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mous);
        WebView webView=(WebView)findViewById(R.id.mous_web);
        webView.loadUrl("file:///android_asset/mous.html");
    }
}
