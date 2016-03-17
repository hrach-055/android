package com.example.hrach.myapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Item [] mas={new Item("Image1",R.drawable.nature1),
                     new Item("Image2",R.drawable.nature2),
                     new Item("Image3",R.drawable.nature3),
                     new Item("Image4",R.drawable.nature4),
                     new Item("Image5",R.drawable.nature3),


        };
        GridView gridView=(GridView) findViewById(R.id.my_grid);
        gridView.setAdapter(new ImageAdapter(this,mas));

    }
}
class ImageAdapter extends BaseAdapter{

    private List<Item> my_list;
    private LayoutInflater layoutInflater;

    ImageAdapter(Context context, Item[] mas)
    {
        my_list=new ArrayList<>();
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
        return my_list.get(position).getDrawableId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        ImageView picture;
        TextView name;
        if(v == null)
        {
            v = layoutInflater.inflate(R.layout.my_gridview,parent, false);
            v.setTag(R.id.picture, v.findViewById(R.id.picture));
            v.setTag(R.id.text, v.findViewById(R.id.text));

        }

        picture = (ImageView) v.getTag(R.id.picture);
        name = (TextView)v.getTag(R.id.text);
        Item item = (Item) getItem(position);
        picture.setImageResource(item.getDrawableId());
        name.setText(item.getName());



        return v;
    }


}
class  Item
{
    private String name;
    private int drawableId;
    Item(String name,int drawableId)
    {
        this.name=name;
        this.drawableId=drawableId;
    }
    public int getDrawableId()
    {
        return drawableId;
    }
    public  String getName()
    {
        return name;
    }


}
