package com.group1.androidjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.group1.androidjava.R;

import java.util.List;

public class MyAdapter extends ArrayAdapter {
    List<String> listTitle;
    List<Integer> imageList;
    Context context;

    public MyAdapter(@NonNull Context context, List<String> title, List<Integer> image) {
        super(context, R.layout.items, title);

        this.listTitle = title;
        this.imageList = image;
        this.context = context;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.items, parent,false);
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textView = view.findViewById(R.id.textView);

        textView.setText(listTitle.get(position));
        imageView.setImageResource(imageList.get(position));

        return view;

    }
}