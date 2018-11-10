package com.example.zain.about_us_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class EditAddressActivity extends AppCompatActivity {
    EditText edt_name,edt_phone,edt_address,edt_city,edt_state,edt_country;
    RelativeLayout btn_save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_address);

        edt_name=findViewById(R.id.edt_name);
        edt_phone=findViewById(R.id.edt_phone);
        edt_address=findViewById(R.id.edt_address);
        edt_city=findViewById(R.id.edt_city);
        edt_state=findViewById(R.id.edt_state);
        edt_country=findViewById(R.id.edt_country);
        btn_save=findViewById(R.id.rel_btn_save);

//        getting data from previous activity

        edt_name.setText(getIntent().getStringExtra("namestring"));
        edt_phone.setText(getIntent().getStringExtra("phonestring"));
        edt_address.setText(getIntent().getStringExtra("addressstring"));
        edt_city.setText(getIntent().getStringExtra("citystring"));
        edt_state.setText(getIntent().getStringExtra("statestring"));
        edt_country.setText(getIntent().getStringExtra("countrystring"));

//        writing data to other activity

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(EditAddressActivity.this,ShippingActivity.class);
                startActivity(it);
            }
        });

    }
}
