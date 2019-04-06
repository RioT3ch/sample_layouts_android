package com.example.zain.about_us_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class loading_animation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_animation);
        Thread td=new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch (Exception ex)
                {
                    ex.printStackTrace();
                }finally {
                    Intent it=new Intent(loading_animation.this,Form.class);
                    startActivity(it);
                }
            }
        };td.start();
    }
}
