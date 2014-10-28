package com.ouqpapers.welcome.ouqpapers.app;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;


public class MainActivity extends Activity {

   MediaPlayer logoMusic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);
        logoMusic= MediaPlayer.create(MainActivity.this,R.raw.welcome);
        logoMusic.start();
        Thread logoTimer = new Thread() {
            public void run() {
                try {
                    sleep(2500);
                    Intent menuIntent = new Intent(MainActivity.this, Menu.class);
                    startActivity(menuIntent);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    finish();
                }
            }

         };
        logoTimer.start();

}

protected void onPause()
        {
        super.onPause();
        logoMusic.release();
        }
        }