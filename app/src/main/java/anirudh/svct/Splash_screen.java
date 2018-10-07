package anirudh.svct;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Splash_screen extends AppCompatActivity {
    private static int SPLASH_SCREEN=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_screen.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        },SPLASH_SCREEN);
        ballRotate();


    }
    void ballRotate() {
        findViewById(R.id.ball_rotate).setVisibility(View.VISIBLE);

    }

}
