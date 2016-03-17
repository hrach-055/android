package com.example.hrach.myapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class First extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        ListView my_list = (ListView) findViewById(R.id.mylist);
        String [] mas ={"Hrach","Anna","Gago","Vardan", "Sergey","Arsen"};
        my_list.setAdapter(new MyAdapter(this,mas));

    }
}
class MyAdapter extends BaseAdapter {

        private List<String> my_list;
        private LayoutInflater layoutInflater;

        MyAdapter(Context context, String[] mas)
        {
            my_list=new ArrayList<String>();
            for(int i=0;i<mas.length;i++)
            {
                my_list.add(mas[i]);
            }
            layoutInflater=LayoutInflater.from(context);
        }
        public  int getCount()
        {
            return my_list.size();
        }

        @Override
        public Object getItem(int position) {
            return my_list.get(position);
        }

        @Override
        public long getItemId(int position) {
            return  position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v = convertView;
            TextView name;
            if(v == null)
            {
                v = layoutInflater.inflate(R.layout.my_list,parent, false);
                v.setTag(R.id.txt, v.findViewById(R.id.txt));

            }
            String s=(String) getItem(position);
            name = (TextView)v.getTag(R.id.txt);
            name.setText(s);
            return v;
        }


    }
class Item1{
    String name;
    int  txtid;
    Item1(String name,int txtid)
    {
        this.name=name;
        this.txtid=txtid;
    }
}

