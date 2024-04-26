package com.example.medocpro2app.activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.medocpro2app.R;

import java.util.ArrayList;


public class Home_nav extends Fragment{


    RecyclerView recyclerView;
    GridView gridView;
    ArrayList<CartModel> arrItems = new ArrayList<>();
    ArrayList<CategoryModel> arrCat = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_nav, container, false);

        recyclerView = view.findViewById(R.id.recycleItemCard);



        arrItems.add(new CartModel(R.drawable.item,"Oral Irrigator Electirc","$103.00"));
        arrItems.add(new CartModel(R.drawable.item,"Oral Irrigator Electirc","$103.00"));
        arrItems.add(new CartModel(R.drawable.item,"Oral Irrigator Electirc","$103.00"));
        arrItems.add(new CartModel(R.drawable.item,"Oral Irrigator Electirc","$103.00"));
        arrItems.add(new CartModel(R.drawable.item,"Oral Irrigator Electirc","$103.00"));
        arrItems.add(new CartModel(R.drawable.item,"Oral Irrigator Electirc","$103.00"));
        arrItems.add(new CartModel(R.drawable.item,"Oral Irrigator Electirc","$103.00"));

        RecycleItemAdapter recycleItemAdapter = new RecycleItemAdapter(getContext(),arrItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,true));
        recyclerView.setAdapter(recycleItemAdapter);



        ImageSlider imageSlider =view.findViewById(R.id.imageSlider);
        ArrayList<SlideModel> arrImages = new ArrayList<>();

        arrImages.add(new SlideModel("https://www.odtap.com/wp-content/uploads/2021/04/e-pharmacy-business-model.png", ScaleTypes.FIT));
        arrImages.add(new SlideModel("https://media.post.rvohealth.io/wp-content/uploads/sites/2/2020/02/GRT-pills-1296x728-header.jpg", ScaleTypes.FIT));
        arrImages.add(new SlideModel("https://www.odtap.com/wp-content/uploads/2021/04/e-pharmacy-business-model.png", ScaleTypes.FIT));
        arrImages.add(new SlideModel("https://media.post.rvohealth.io/wp-content/uploads/sites/2/2020/02/GRT-pills-1296x728-header.jpg", ScaleTypes.FIT));
        arrImages.add(new SlideModel("https://www.odtap.com/wp-content/uploads/2021/04/e-pharmacy-business-model.png", ScaleTypes.FIT));

        imageSlider.setImageList(arrImages,ScaleTypes.FIT);

        gridView = view.findViewById(R.id.gridView);

        arrCat.add(new CategoryModel(R.drawable.category1,"Handwash"));
        arrCat.add(new CategoryModel(R.drawable.category1,"Covid Essentials"));
        arrCat.add(new CategoryModel(R.drawable.category1,"Covid Essentials"));
        arrCat.add(new CategoryModel(R.drawable.category1,"Handwash"));


        GridCatAdapter gridCatAdapter = new GridCatAdapter(getContext(),arrCat);

        gridView.setAdapter(gridCatAdapter);
        return view;
    }

}