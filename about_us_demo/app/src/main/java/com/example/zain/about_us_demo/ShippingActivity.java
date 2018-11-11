package com.example.zain.about_us_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ShippingActivity extends AppCompatActivity {

    RelativeLayout rel_edit_btn;
    TextView tv_name,tv_phone,tv_address,tv_city,tv_state,tv_country;
    int x=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipping);

        tv_name=findViewById(R.id.tv_edt_name);
        tv_phone=findViewById(R.id.tv_edt_phone);
        tv_address=findViewById(R.id.tv_edt_address);
        tv_city=findViewById(R.id.tv_edt_city);
        tv_state=findViewById(R.id.tv_edt_state);
        tv_country=findViewById(R.id.tv_edt_country);

<<<<<<< HEAD
        if(x==1) {

            final String name = tv_name.getText().toString();
            final String phone = tv_phone.getText().toString();
            final String address = tv_address.getText().toString();
            final String city = tv_city.getText().toString();
            final String state = tv_state.getText().toString();
            final String country = tv_country.getText().toString();


            rel_edit_btn = findViewById(R.id.rel_btn_edit);
            rel_edit_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent it = new Intent(ShippingActivity.this, EditAddressActivity.class);
                    it.putExtra("namestring", name);
                    it.putExtra("phonestring", phone);
                    it.putExtra("addressstring", address);
                    it.putExtra("citystring", city);
                    it.putExtra("statestring", state);
                    it.putExtra("countrystring", country);
                    x++;
                    startActivity(it);
                }
            });
        }
=======
        final String name = tv_name.getText().toString();
        final String phone = tv_phone.getText().toString();
        final String address = tv_address.getText().toString();
        final String city = tv_city.getText().toString();
        final String state = tv_state.getText().toString();
        final String country = tv_country.getText().toString();


        rel_edit_btn=findViewById(R.id.rel_btn_edit);
        rel_edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(ShippingActivity.this,EditAddressActivity.class);
                it.putExtra("namestring",name);
                it.putExtra("phonestring",phone);
                it.putExtra("addressstring",address);
                it.putExtra("citystring",city);
                it.putExtra("statestring",state);
                it.putExtra("countrystring",country);
                startActivity(it);
            }
        });

>>>>>>> 1c04becc1456cd0ffa68244af71123c4de0cacb2
    }
}
