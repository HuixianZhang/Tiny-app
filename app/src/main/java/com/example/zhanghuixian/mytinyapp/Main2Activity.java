package com.example.zhanghuixian.mytinyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tv1;
    String s;
    ImageView im1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = (TextView) findViewById(R.id.textview1);
        im1= (ImageView) findViewById(R.id.image1);

        Intent i=getIntent();
        Bundle b=i.getExtras();
        s=b.getString("sum");

        tv1.setText("SUM: " + s);

        im1.setImageResource(R.drawable.add);
    }
}
