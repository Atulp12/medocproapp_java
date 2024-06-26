package com.example.medocpro2app.activity;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.medocpro2app.R;

public class ViewPageAdapter extends PagerAdapter {

    Context context;

    int images[] = {

            R.drawable.on1,
            R.drawable.on2,
            R.drawable.on3

    };

    int headings[] = {

            R.string.heading1,
            R.string.heading1,
            R.string.heading1
    };

    int description[] = {

            R.string.desc,
            R.string.desc,
            R.string.desc

    };

    public ViewPageAdapter(Context context){

        this.context = context;

    }

    @Override
    public int getCount() {
        return  headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (LinearLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slider,container,false);

        ImageView slidetitleimage = (ImageView) view.findViewById(R.id.onboardImg);
        TextView slideHeading = (TextView) view.findViewById(R.id.onboardTitle);
        TextView slideDesciption = (TextView) view.findViewById(R.id.onboardDesc);

        slidetitleimage.setImageResource(images[position]);
        slideHeading.setText(headings[position]);
        slideDesciption.setText(description[position]);

        container.addView(view);

        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((LinearLayout)object);

    }
}
