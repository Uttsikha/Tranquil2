package com.example.tranquil.activity.Management;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.tranquil.R;

public class Music extends AppCompatActivity {
    MediaPlayer ring1;
    MediaPlayer ring2;
    MediaPlayer ring3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
         ring1= MediaPlayer.create(Music.this,R.raw.ring1);
         ring2= MediaPlayer.create(Music.this,R.raw.ring2);
         ring3= MediaPlayer.create(Music.this,R.raw.ring3);

    }
    public void play1(View v){
        ring1.start();
    }

    public void pause1(View v) {
        ring1.pause();
    }

    public void stop1(View v) {
        ring1.stop();
        ring1=MediaPlayer.create(this, R.raw.ring1);
    }

    public void play2(View v) {
        ring2.start();
    }
    public void pause2(View v) {
        ring2.pause();
    }
    public void stop2(View v) {
        ring2.stop();
        ring2=MediaPlayer.create(this, R.raw.ring2);

    }

    public void play3(View v) {
        ring3.start();
    }
    public void pause3(View v) {
        ring3.pause();
    }
    public void stop3(View v) {
        ring3.stop();
        ring3=MediaPlayer.create(this, R.raw.ring3);

    }
}
