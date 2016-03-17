package com.example.hrach.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1=(Button) findViewById(R.id.btn1);
        Button bt2=(Button) findViewById(R.id.btn2);
        Button bt3=(Button) findViewById(R.id.btn3);
        Button bt4=(Button) findViewById(R.id.btn4);
        Button bt5=(Button) findViewById(R.id.btn5);
        final Intent intent1 = new Intent(this,First.class);
        final Intent intent2 = new Intent(this,Second.class);
        final Intent intent3 = new Intent(this,Third.class);
        final Intent intent4 = new Intent(this,Fourth.class);
        final Intent intent5 = new Intent(this,Fifth.class);
        View.OnClickListener onclick=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (v.getId())
                {
                    case R.id.btn1:
                        startActivity(intent1);
                        break;
                    case R.id.btn2:
                        startActivity(intent2);
                        break;
                    case R.id.btn3:
                        startActivity(intent3);
                        break;
                    case R.id.btn4:
                        startActivity(intent4);
                        break;
                    case R.id.btn5:
                        startActivity(intent5);
                        break;
                    default:
                        break;


                }
            }
        };
        bt1.setOnClickListener(onclick);
        bt2.setOnClickListener(onclick);
        bt3.setOnClickListener(onclick);
        bt4.setOnClickListener(onclick);
        bt5.setOnClickListener(onclick);
    }
}
