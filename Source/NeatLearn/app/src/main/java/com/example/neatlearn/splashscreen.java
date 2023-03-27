package com.example.neatlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splashscreen extends AppCompatActivity {

    private static final int DELAY_TIME = 4000;

    Animation topanim,bottomanim;
    ImageView shapeimage,learningimage,logoimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        topanim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomanim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        shapeimage = findViewById(R.id.imgshape);
        learningimage = findViewById(R.id.imageLearn);
        logoimage = findViewById(R.id.imgapplogo);

        shapeimage.setAnimation(topanim);
        learningimage.setAnimation(topanim);
        logoimage.setAnimation(bottomanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(), studentLogin.class);
                startActivity(i);
                finish();
            }
        },DELAY_TIME);
    }
}