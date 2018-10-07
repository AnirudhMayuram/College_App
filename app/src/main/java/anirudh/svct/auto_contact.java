package anirudh.svct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

public class auto_contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_contact);
        WebView webView=(WebView)findViewById(R.id.aut_contact_web);
        webView.loadUrl("file:///android_asset/aut_contact.html");


    }
}
