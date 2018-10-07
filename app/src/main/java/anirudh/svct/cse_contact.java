package anirudh.svct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

public class cse_contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_contact);
        WebView webView=(WebView)findViewById(R.id.cse_contact_web);
        webView.loadUrl("file:///android_asset/cse_contact.html");

    }
}
