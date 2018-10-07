package anirudh.svct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class about_ir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_ir);
        WebView webView=(WebView)findViewById(R.id.about_ir_web);
        webView.loadUrl("file:///android_asset/about_ir.html");

    }
}
