package com.example.zain.about_us_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class login_sign_screen extends AppCompatActivity {
    RelativeLayout rel_root;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sign_screen);
        rel_root=findViewById(R.id.rel_root);
        rel_root.getBackground().setAlpha(50);
    }
}
