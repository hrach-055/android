package com.example.hrach.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

public class Fourth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        Item [] mas={new Item("Image1",R.drawable.nature1),
                new Item("Image2",R.drawable.nature2),
                new Item("Image3",R.drawable.nature3),
                new Item("Image4",R.drawable.nature4),
                new Item("Image5",R.drawable.nature3),


        };
        ListView im_list=(ListView) findViewById(R.id.im_list);
       im_list.setAdapter(new ImageAdapter(this, mas));
    }
}

