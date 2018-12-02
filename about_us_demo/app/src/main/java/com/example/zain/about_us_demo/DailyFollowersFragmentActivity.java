package com.example.zain.about_us_demo;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.shinelw.library.ColorArcProgressBar;

public class DailyFollowersFragmentActivity extends AppCompatActivity {
    RelativeLayout btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_followers_fragment);

        btn=findViewById(R.id.rel_btn_started);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(DailyFollowersFragmentActivity.this,DailyFollowersActivity.class);
                startActivity(it);
            }
        });
        ColorArcProgressBar progressBar;
        progressBar=findViewById(R.id.bar1);
        progressBar.setCurrentValues(150);
    }
}
