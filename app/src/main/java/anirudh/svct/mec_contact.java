package anirudh.svct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

public class mec_contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mec_contact);
        WebView webView=(WebView)findViewById(R.id.mec_contact_web);
        webView.loadUrl("file:///android_asset/mec_contact.html");
    }
}
