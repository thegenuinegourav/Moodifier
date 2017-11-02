package com.microsoft.projectoxford.emotionsample;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Animation bounceAnim = AnimationUtils
                .loadAnimation(getApplicationContext(), R.anim.splash_logo);
        findViewById(R.id.imgLogo).setAnimation(bounceAnim);

        bounceAnim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animationsFinished();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    boolean isAnimationFinished = false;

    public void animationsFinished() {
        isAnimationFinished = true;
        startActivity(new Intent(SplashActivity.this,MainActivity.class));
        finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

}