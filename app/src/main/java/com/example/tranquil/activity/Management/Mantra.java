package com.example.tranquil.activity.Management;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.tranquil.R;

public class Mantra extends AppCompatActivity {
    MediaPlayer ring11;
    MediaPlayer ring12;
    MediaPlayer ring13;
    MediaPlayer ring14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mantra);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        ring11= MediaPlayer.create(Mantra.this,R.raw.m1);
        ring12= MediaPlayer.create(Mantra.this,R.raw.m2);
        ring13= MediaPlayer.create(Mantra.this,R.raw.m3);
        ring14= MediaPlayer.create(Mantra.this,R.raw.m4);
    }
    public void play11(View v){
        ring11.start();
    }

    public void pause11(View v) {
        ring11.pause();
    }

    public void stop11(View v) {
        ring11.stop();
        ring11=MediaPlayer.create(this, R.raw.m1);
    }

    public void play12(View v) {
        ring12.start();
    }
    public void pause12(View v) {
        ring12.pause();
    }
    public void stop12(View v) {
        ring12.stop();
        ring12=MediaPlayer.create(this, R.raw.m2);

    }

    public void play13(View v) {
        ring13.start();
    }
    public void pause13(View v) {
        ring13.pause();
    }
    public void stop13(View v) {
        ring13.stop();
        ring13=MediaPlayer.create(this, R.raw.m3);

    }
    public void play14(View v) {
        ring14.start();
    }
    public void pause14(View v) {
        ring14.pause();
    }
    public void stop14(View v) {
        ring14.stop();
        ring14=MediaPlayer.create(this, R.raw.m4);

    }
}
