package com.example.nogginboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer playerFastest;
    private MediaPlayer playerLaugh;
    private MediaPlayer playerHello;
    private MediaPlayer playerGnelf;
    private MediaPlayer playerGnoblin;
    private MediaPlayer playerGnome;
    private MediaPlayer playerYouveBeen;
    private MediaPlayer playerGnomed;

    ImageView mainImage;
        // testing commit things
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerFastest = MediaPlayer.create(getApplicationContext(), R.raw.gnomefastest);
        playerLaugh = MediaPlayer.create(getApplicationContext(), R.raw.gnomelaugh);
        playerHello = MediaPlayer.create(getApplicationContext(), R.raw.gnomehello);
        playerGnelf = MediaPlayer.create(getApplicationContext(), R.raw.gnomegnelf);
        playerGnoblin = MediaPlayer.create(getApplicationContext(), R.raw.gnomegnoblin);
        playerGnome = MediaPlayer.create(getApplicationContext(), R.raw.gnomegnome);
        playerYouveBeen = MediaPlayer.create(getApplicationContext(), R.raw.gnomeyouvebeen);
        playerGnomed = MediaPlayer.create(getApplicationContext(), R.raw.gnomegnomed);

        mainImage = findViewById(R.id.gnomeImage);

        playerFastest.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mainImage.setImageResource(R.drawable.gnomeface);
            }
        });
    }

    public void playSoundFastest(View view){
        playerFastest.start();
        mainImage.setImageResource(R.drawable.gnomeface2);
    }

    public void playSoundLaugh(View view){
        playerLaugh.start();
    }

    public void playSoundHello(View view){
        playerHello.start();
    }

    public void playSoundGnelf(View view){
        playerGnelf.start();
    }

    public void playSoundGnoblin(View view){
        playerGnoblin.start();
    }

    public void playSoundGnome(View view){
        playerGnome.start();
    }

    public void playSoundYouveBeen(View view){
        playerYouveBeen.start();
    }

    public void playSoundGnomed(View view){
        playerGnomed.start();
    }

}
