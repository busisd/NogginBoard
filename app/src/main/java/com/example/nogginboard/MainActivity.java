package com.example.nogginboard;

import android.media.MediaPlayer;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends FragmentActivity {
    private MediaPlayer playerFastest;
    private MediaPlayer playerLaugh;
    private MediaPlayer playerHello;
    private MediaPlayer playerGnelf;
    private MediaPlayer playerGnoblin;
    private MediaPlayer playerGnome;
    private MediaPlayer playerYouveBeen;
    private MediaPlayer playerGnomed;

    ImageView mainImage;

    public static final int NUM_PAGES = 3;
    private ViewPager mPager;
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpMediaPlayers();

        mPager = findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(pagerAdapter);
    }

    private void setUpMediaPlayers(){
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

    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {
            super.onBackPressed();
        } else {
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return new GnomeFragment();
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
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
