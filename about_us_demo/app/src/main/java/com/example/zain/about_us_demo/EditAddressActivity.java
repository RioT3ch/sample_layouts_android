package com.example.zain.about_us_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class EditAddressActivity extends AppCompatActivity {
    EditText edt_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_address);

        edt_name=findViewById(R.id.edt_name);

        edt_name.setText(getIntent().getStringExtra("namestring"));
    }
}
