package com.citizencenter.glideandadapterview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
//import com.squareup.picasso.Picasso;

public class SimpleImageListAdapter extends ArrayAdapter
{
    private String[] imageUrls;

    public SimpleImageListAdapter(Context context, String[] imageUrls) {
        super(context, R.layout.listview_item_image, imageUrls);

        this.imageUrls = imageUrls;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (null == convertView) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listview_item_image, parent, false);
        }

        Glide.with(getContext())
                .load(imageUrls[position])
                .into((ImageView) convertView.findViewById(R.id.imageView));


        //Picasso.get().load(imageUrls[position]).into((ImageView)convertView);


        return convertView;
    }
}