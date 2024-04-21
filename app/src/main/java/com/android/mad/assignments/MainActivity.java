package com.android.mad.assignments;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    ImageView imageView;
    Button btnBlink, btnRotate, btnFade, btnMove, btnSlide, btnZoom, btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageview);
        btnBlink = findViewById(R.id.btnBlink);
        btnRotate = findViewById(R.id.btnRotate);
        btnFade = findViewById(R.id.btnFade);
        btnMove = findViewById(R.id.btnMove);
        btnSlide = findViewById(R.id.btnSlide);
        btnZoom = findViewById(R.id.btnZoom);
        btnStop = findViewById(R.id.btnStop);

        btnBlink.setOnClickListener(v -> {
            // To add blink animation
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_animation);
            imageView.startAnimation(animation);
        });

        btnRotate.setOnClickListener(v -> {
            // To add rotate animation
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_animation);
            imageView.startAnimation(animation);
        });

        btnFade.setOnClickListener(v -> {
            // To add fade animation
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_animation);
            imageView.startAnimation(animation);
        });

        btnMove.setOnClickListener(v -> {
            // To add move animation
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_animation);
            imageView.startAnimation(animation);
        });

        btnSlide.setOnClickListener(v -> {
            // To add slide animation
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_animation);
            imageView.startAnimation(animation);
        });

        btnZoom.setOnClickListener(v -> {
            // To add zoom animation
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_animation);
            imageView.startAnimation(animation);
        });

        btnStop.setOnClickListener(v -> {
            // To stop the animation going on imageview
            imageView.clearAnimation();
        });
    }
}
