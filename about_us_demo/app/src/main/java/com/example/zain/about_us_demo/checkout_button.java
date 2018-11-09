package com.example.zain.about_us_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class checkout_button extends AppCompatActivity {
    Button btn_increment,btn_decrement;
    TextView tv_quantity,tv_total_price;
    int counter =1;
    int price=1599;
    float total=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout_button);

        btn_increment=findViewById(R.id.btn_increment);
        btn_decrement=findViewById(R.id.btn_decrement);
        tv_total_price=findViewById(R.id.tv_price_number);
        tv_quantity=findViewById(R.id.tv_quantity);

        btn_increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                tv_quantity.setText("Rs. 1599 x "+counter);
                total=counter*price;
                tv_total_price.setText("Rs. "+total);
            }
        });

        btn_decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter>1) {
                    counter--;
                    tv_quantity.setText("Rs. 1599 x " + counter);
                    total = total - price;
                    tv_total_price.setText("Rs. "+total);
                }
            }
        });
    }
}
