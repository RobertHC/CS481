package com.example.rjuan.assignment4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridViewAdapter extends BaseAdapter {
    private Context context;

    public GridViewAdapter(Context context) {
        this.context = context;
    }
    private int[] icons = {
            R.drawable.front,
            R.drawable.housefour, R.drawable.housefive,
            R.drawable.housethree, R.drawable.housetwo
    };

    @Override
    public int getCount() {
        return icons.length;
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
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(400, 400));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(50,50, 50, 50);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(icons[position]);
        return imageView;
    }
}