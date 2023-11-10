package com.rsmdeveloper.mydailyroutine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.sarnava.textwriter.TextWriter;


/**
 * Created by RSM Developer on 07-09-2023.
 * Follow Facebook : https://www.facebook.com/RsmDeveloper
 * Subscribe YouTube : https://www.youtube.com/@RsmDeveloper
 * Visit Website : https://rsmdeveloper.blogspot.com/
 * Developed Your Creativity With RSM Developer
 **/

public class SplashActivity extends AppCompatActivity {

    //Text animation ==========================================
    ImageView logo;

    Animation zoom_in;
    //Text animation ==========================================

    //Text animation ==========================================
    TextWriter textWriter;

    //Text animation ==========================================


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//Logo animation==========================================
        logo = findViewById(R.id.logo);

        zoom_in = AnimationUtils.loadAnimation(this,R.anim.zoom_in);
        logo.setAnimation(zoom_in);


//Text animation ==========================================
        textWriter = findViewById(R.id.textWriter);

        textWriter
                .setWidth(12)
                .setDelay(80)
                .setColor(Color.WHITE)
                .setConfig(TextWriter.Configuration.INTERMEDIATE)
                .setSizeFactor(20f)
                .setLetterSpacing(15f)
                .setText("MY DAILY ROUTINE")
                .setListener(new TextWriter.Listener() {
                    @Override
                    public void WritingFinished() {

                        //do stuff after animation is finished

                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        }, 1000);

                        //do stuff after animation is finished

                    }
                })
                .startAnimation();

//Text animation end ===============================================

    }
}