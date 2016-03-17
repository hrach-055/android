package com.example.hrach.myapp;

import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

public class Fifth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        int[] mas={R.drawable.nature2,R.drawable.nature3,
                   R.drawable.nature3,R.drawable.nature4,
                   R.drawable.nature1,R.drawable.nature2,
                   R.drawable.nature3,R.drawable.nature4};
        LinearLayout layout=(LinearLayout)findViewById(R.id.mylinear);
        for (int i = 0; i <=mas.length-1; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setId(i);
            imageView.setPadding(0,0,10,0);
            imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(),mas[i]));
            layout.addView(imageView);
        }

    }
}
