package com.example.medocpro2app.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.medocpro2app.R;

import java.util.ArrayList;

public class GridCatAdapter extends BaseAdapter {

    Context context;
    ArrayList<CategoryModel> arrCat;
    LayoutInflater inflater;

    GridCatAdapter(Context context, ArrayList<CategoryModel> arrCat){
        this.context = context;
        this.arrCat = arrCat;
        inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return arrCat.size();
    }

    @Override
    public Object getItem(int position) {
        return arrCat.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.category, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = convertView.findViewById(R.id.categoryImg);
            viewHolder.textView = convertView.findViewById(R.id.categoryTxt);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        CategoryModel categoryModel = arrCat.get(position);
        viewHolder.imageView.setImageResource(categoryModel.catImg);
        viewHolder.textView.setText(categoryModel.catTxt);

        return convertView;
    }

    static class ViewHolder {
        ImageView imageView;
        TextView textView;
    }
}
