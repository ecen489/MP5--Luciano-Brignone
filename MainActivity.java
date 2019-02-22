package com.example.assignment5;

import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {


    MediaPlayer mp1;
    MediaPlayer mp2;
    MediaPlayer mp3;

    Button play;
    Button stop;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        play = (Button) findViewById(R.id.startbutton);
        stop = (Button) findViewById(R.id.stopbutton);

        mp1 = MediaPlayer.create(this,R.raw.x);
        mp2 = MediaPlayer.create(this,R.raw.seek);
        mp3 = MediaPlayer.create(this,R.raw.under);
    }

    public void radioclick(View view){

        ImageView image = (ImageView) findViewById(R.id.myimg);
        // the X ambassadors
        if(view.getId() == R.id.XButton){
            mp1 = MediaPlayer.create(this,R.raw.x);
            image.setImageResource(R.drawable.pic1);
            mp1.start();
            mp2.pause();
            mp3.pause();

            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp1.start();
                }
            });
            stop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp1.pause();
                }
            });
        }
        // Metallica
        if(view.getId() == R.id.MButton){
            mp2 = MediaPlayer.create(this,R.raw.seek);
            image.setImageResource(R.drawable.pic2);
            mp1.pause();
            mp2.start();
            mp3.pause();

            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp2.start();
                }
            });
            stop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp2.pause();
                }
            });
        } // under the bridge
        if(view.getId() == R.id.RButton){
            image.setImageResource(R.drawable.pic3);
            mp3 = MediaPlayer.create(this,R.raw.under);
            mp1.pause();
            mp2.pause();
            mp3.start();

            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp3.start();
                }
            });
            stop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp3.pause();
                }
            });
        }
    }

}
