package com.example.zain.about_us_demo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import java.net.URI;

public class VideoDemoActivity extends AppCompatActivity {
    Boolean touch=true;
    Button btn_play;
    VideoView vv_demovideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_demo);
        btn_play=findViewById(R.id.play_btn);
        vv_demovideo = findViewById(R.id.vv_demovideo);


        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video_demo);
        vv_demovideo.setVideoURI(uri);

        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(touch==true) {
                    touch = false;
                    vv_demovideo.start();
                }else {
                    touch = true;
                    vv_demovideo.pause();
                }
            }
        });

        }
}
