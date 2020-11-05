package com.example.poemplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgPoem;
    TextView txtName,txtDescription;
    Button btnPlay,btnPause,btnStop;

    boolean isPlaying=false;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgPoem=findViewById(R.id.img_poem);
        txtName=findViewById(R.id.txt_name);
        txtDescription=findViewById(R.id.txt_description);
        btnPlay=findViewById(R.id.btn_play);
        btnPause=findViewById(R.id.btn_pause);
        btnStop=findViewById(R.id.btn_stop);





        /* receive data */

        String getRecipe=getIntent().getExtras().getString("poem");

        if(getRecipe.equals("twinkle"))
        {
            imgPoem.setImageResource(R.drawable.twinkle);
            txtName.setText("Twinkle Twinkle");
            txtDescription.setText(R.string.poem1);
            player=MediaPlayer.create(DetailsActivity.this,R.raw.twinkle);

            btnPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (isPlaying==false) {
                        player.start();
                        isPlaying = true;
                    }
                }
            });

            btnPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (isPlaying==true) {
                        player.pause();
                        isPlaying = false;
                    }
                }
            });

            btnStop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (isPlaying==true) {
                        player.stop();
                        isPlaying = false;

                        try {
                            player.prepare();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });

        }

        else if(getRecipe.equals("rainbow"))
        {
            imgPoem.setImageResource(R.drawable.rainbow);
            txtName.setText("Rainbow");
            txtDescription.setText(R.string.poem2);
            player=MediaPlayer.create(DetailsActivity.this,R.raw.rainbow);

            btnPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (isPlaying==false) {
                        player.start();
                        isPlaying = true;
                    }
                }
            });

            btnPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (isPlaying==true) {
                        player.pause();
                        isPlaying = false;
                    }
                }
            });

            btnStop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (isPlaying==true) {
                        player.stop();
                        isPlaying = false;

                        try {
                            player.prepare();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });

        }

        else if(getRecipe.equals("early"))
        {
            imgPoem.setImageResource(R.drawable.early);
            txtName.setText("Early to Bed");
            txtDescription.setText(R.string.poem3);
            player=MediaPlayer.create(DetailsActivity.this,R.raw.early);

            btnPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (isPlaying==false) {
                        player.start();
                        isPlaying = true;
                    }
                }
            });

            btnPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (isPlaying==true) {
                        player.pause();
                        isPlaying = false;
                    }
                }
            });

            btnStop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (isPlaying==true) {
                        player.stop();
                        isPlaying = false;

                        try {
                            player.prepare();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });

        }

    }
}