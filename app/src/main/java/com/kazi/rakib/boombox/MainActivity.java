package com.kazi.rakib.boombox;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize mediaPlayer with a song
        mediaPlayer = MediaPlayer.create(this, R.raw.song01);

        Button playButton = (Button) findViewById(R.id.play_button);

        playButton.setOnClickListener(new View.OnClickListener(){
            // onClick

            @Override
            public void onClick(View v) {
                // do something, play button is clicked
                mediaPlayer.start();
            }
        });

        Button pauseButton = (Button) findViewById(R.id.pause_button);

        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // pause button is clicked
                mediaPlayer.pause();
            }
        });

        Button resetButton = (Button) findViewById(R.id.reset_button);

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // start the song over
                mediaPlayer.reset();
            }
        });

    }   // end of onCreate();



}