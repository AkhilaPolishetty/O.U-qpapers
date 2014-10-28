package com.ouqpapers.welcome.ouqpapers.app;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class Menu extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.branch_name);
        final MediaPlayer buttonSound=MediaPlayer.create(Menu.this, R.raw.button_sound);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent i = new Intent(Menu.this, It_list.class);
                startActivity(i);
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent j = new Intent(Menu.this, Cse_list.class);
                startActivity(j);
            }

        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent k = new Intent(Menu.this, Eee_list.class);
                startActivity(k);
            }

        });

       button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent l = new Intent(Menu.this, Mech_list.class);
                startActivity(l);
            }

        });

    }
}

