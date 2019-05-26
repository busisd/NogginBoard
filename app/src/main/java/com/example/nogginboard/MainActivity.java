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

    private ImageView mainImage;

    private MediaPlayer playerArkDie;
    private MediaPlayer playerEsto;
    private MediaPlayer playerEtimos;
    private MediaPlayer playerIsvoli;
    private MediaPlayer playerKalos;
    private MediaPlayer playerLeje;
    private MediaPlayer playerMalista;
    private MediaPlayer playerNe;
    private MediaPlayer playerProceshe;
    private MediaPlayer playerProstagma;
    private MediaPlayer playerVulome;

    public static final int NUM_PAGES = 2;
    private ViewPager mPager;
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpGnomeMediaPlayers();
        setUpAomMediaPlayers();

        mPager = findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(pagerAdapter);
    }

    private void setUpGnomeMediaPlayers(){
        playerFastest = MediaPlayer.create(getApplicationContext(), R.raw.gnomefastest);
        playerLaugh = MediaPlayer.create(getApplicationContext(), R.raw.gnomelaugh);
        playerHello = MediaPlayer.create(getApplicationContext(), R.raw.gnomehello);
        playerGnelf = MediaPlayer.create(getApplicationContext(), R.raw.gnomegnelf);
        playerGnoblin = MediaPlayer.create(getApplicationContext(), R.raw.gnomegnoblin);
        playerGnome = MediaPlayer.create(getApplicationContext(), R.raw.gnomegnome);
        playerYouveBeen = MediaPlayer.create(getApplicationContext(), R.raw.gnomeyouvebeen);
        playerGnomed = MediaPlayer.create(getApplicationContext(), R.raw.gnomegnomed);

        playerFastest.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mainImage.setImageResource(R.drawable.gnomeface);
            }
        });
    }

    private void setUpAomMediaPlayers(){
        playerArkDie = MediaPlayer.create(getApplicationContext(), R.raw.die);
        playerEsto = MediaPlayer.create(getApplicationContext(), R.raw.esto);
        playerEtimos = MediaPlayer.create(getApplicationContext(), R.raw.etimos);
        playerIsvoli = MediaPlayer.create(getApplicationContext(), R.raw.isvoli);
        playerKalos = MediaPlayer.create(getApplicationContext(), R.raw.kalos);
        playerLeje = MediaPlayer.create(getApplicationContext(), R.raw.leje);
        playerMalista = MediaPlayer.create(getApplicationContext(), R.raw.malista);
        playerNe = MediaPlayer.create(getApplicationContext(), R.raw.ne);
        playerProceshe = MediaPlayer.create(getApplicationContext(), R.raw.proceshe);
        playerProstagma = MediaPlayer.create(getApplicationContext(), R.raw.prostagma);
        playerVulome = MediaPlayer.create(getApplicationContext(), R.raw.vulome);
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
            if (position==0) {
                return new GnomeFragment();
            } else {
                return new AomFragment();
            }
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }

    public void playSoundFastest(View view){
        playerFastest.start();

        if (mainImage == null) {
            mainImage = findViewById(R.id.gnomeImage);
        }
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

    public void playSoundArkDie(View view){
        playerArkDie.start();
    }

    public void playSoundEsto(View view){
        playerEsto.start();
    }

    public void playSoundEtimos(View view){
        playerEtimos.start();
    }

    public void playSoundIsvoli(View view){
        playerIsvoli.start();
    }

    public void playSoundKalos(View view){
        playerKalos.start();
    }

    public void playSoundLeje(View view){
        playerLeje.start();
    }

    public void playSoundMalista(View view){
        playerMalista.start();
    }

    public void playSoundNe(View view){
        playerNe.start();
    }

    public void playSoundProceshe(View view){
        playerProceshe.start();
    }

    public void playSoundProstagma(View view){
        playerProstagma.start();
    }

    public void playSoundVulome(View view){
        playerVulome.start();
    }

}
