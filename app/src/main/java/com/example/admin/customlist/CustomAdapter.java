package com.example.admin.customlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] arr;
    int[] images;
    String[] arr1;

    public CustomAdapter(Context context, String[] arr,int[] images,String[]arr1)

    {
        this.context=context;
        this.arr=arr;
        this.images=images;
        this.arr1=arr1;

    }

    @Override
    public int getCount() {
        return arr.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {
        View customView;
        view= LayoutInflater.from(context).inflate(R.layout.activity_custom_list,viewGroup,false);
        TextView name=view.findViewById(R.id.name);
        TextView txt2=view.findViewById(R.id.txt2);
        ImageView image=view.findViewById(R.id.image);
        image.setImageResource(images[pos]);
        name.setText(arr[pos]);
        txt2.setText(arr1[pos]);
        customView=view;
        return customView;

    }
}
