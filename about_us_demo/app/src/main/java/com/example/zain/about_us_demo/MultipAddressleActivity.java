package com.example.zain.about_us_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

public class MultipAddressleActivity extends AppCompatActivity {
    RadioButton rd_btn1,rd_btn2,rd_btn3,rd_btn4,rd_btn5;
    RelativeLayout rel_1,rel_expansion_1;
    boolean x=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multip_addressle);

//        rd_btn1=findViewById(R.id.rb_1);
//        rd_btn2=findViewById(R.id.rb_2);
//        rd_btn3=findViewById(R.id.rb_3);
//        rd_btn4=findViewById(R.id.rb_4);
//        rd_btn5=findViewById(R.id.rb_5);

          rel_1=findViewById(R.id.rel_cell_1);
          rel_expansion_1=findViewById(R.id.rel_btns);
          rel_expansion_1.setVisibility(View.GONE);
          rel_1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  if (x==true)
                  {
                      rel_expansion_1.setVisibility(View.GONE);
                      x=false;
                  }
                  else
                  {
                      rel_expansion_1.setVisibility(View.VISIBLE);
                      x=true;
                  }
              }
          });


//        this is how radio buttons work when they are in different layouts
//        rd_btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                rd_btn1.setChecked(true);
//                rd_btn2.setChecked(false);
//                rd_btn3.setChecked(false);
//                rd_btn4.setChecked(false);
//                rd_btn5.setChecked(false);
//            }
//        });
//        rd_btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                rd_btn2.setChecked(true);
//                rd_btn1.setChecked(false);
//                rd_btn3.setChecked(false);
//                rd_btn4.setChecked(false);
//                rd_btn5.setChecked(false);
//            }
//        });
//        rd_btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                rd_btn3.setChecked(true);
//                rd_btn2.setChecked(false);
//                rd_btn1.setChecked(false);
//                rd_btn4.setChecked(false);
//                rd_btn5.setChecked(false);
//            }
//        });
//        rd_btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                rd_btn4.setChecked(true);
//                rd_btn2.setChecked(false);
//                rd_btn3.setChecked(false);
//                rd_btn1.setChecked(false);
//                rd_btn5.setChecked(false);
//            }
//        });
//        rd_btn5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                rd_btn5.setChecked(true);
//                rd_btn2.setChecked(false);
//                rd_btn3.setChecked(false);
//                rd_btn4.setChecked(false);
//                rd_btn1.setChecked(false);
//            }
//        });
    }
}
