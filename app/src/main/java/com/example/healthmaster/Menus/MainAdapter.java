package com.example.healthmaster.Menus;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.healthmaster.R;

public class MainAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private String[] fit_list;
    private int[] fit_img;

    public MainAdapter(Context c,String[] fit_list,int[] fit_img){
        context=c;
        this.fit_list=fit_list;
        this.fit_img=fit_img;
    }

    @Override
    public int getCount() {
        return fit_list.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.row_item, null);

        }
//for show item in single activity & grid view when i click grid view products it shows food name
        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView textView = convertView.findViewById(R.id.textView);

        imageView.setImageResource(fit_img[position]);
        textView.setText(fit_list[position]);
        return convertView;
    }


}
