package com.example.zhanghuixian.mytinyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.zhanghuixian.mytinyapp.R.id.button1;
import static com.example.zhanghuixian.mytinyapp.R.id.edittext2;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.edittext1);
        et2 = (EditText) findViewById(R.id.edittext2);
        b1 = (Button) findViewById(R.id.button1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                int n1 =  Integer.parseInt(et1.getText().toString());
                int n2 = Integer.parseInt(et2.getText().toString());

                int sum = n1 + n2;
                String s = String.valueOf(sum);

                i.putExtra("sum",s);
                startActivity(i);

            }
        });

    }
}
