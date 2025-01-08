package com.example.horrorapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ScareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scare);

        ImageView scareImage = findViewById(R.id.scareImage);
        MediaPlayer scareSound = MediaPlayer.create(this, R.raw.jump_scare);
        scareSound.start();

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(ScareActivity.this, GameOverActivity.class);
            startActivity(intent);
            finish();
        }, 3000);
    }
}
