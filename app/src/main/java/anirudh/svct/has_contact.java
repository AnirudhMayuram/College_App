package anirudh.svct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

public class has_contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_has_contact);
        WebView webView=(WebView)findViewById(R.id.has_contact_web);
        webView.loadUrl("file:///android_asset/has_contact.html");
    }
}
