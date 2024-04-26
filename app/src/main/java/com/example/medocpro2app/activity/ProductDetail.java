package com.example.medocpro2app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.medocpro2app.R;

import java.util.ArrayList;

public class ProductDetail extends AppCompatActivity {

    ImageView backArrow;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        backArrow = findViewById(R.id.backArrow);

        ImageSlider imageSlider =findViewById(R.id.prodImgSlider);
        ArrayList<SlideModel> arrProdImages = new ArrayList<>();

        arrProdImages.add(new SlideModel(R.drawable.item,ScaleTypes.CENTER_INSIDE));
        arrProdImages.add(new SlideModel(R.drawable.item,ScaleTypes.CENTER_INSIDE));
        arrProdImages.add(new SlideModel(R.drawable.item,ScaleTypes.CENTER_INSIDE));
        arrProdImages.add(new SlideModel(R.drawable.item,ScaleTypes.CENTER_INSIDE));


        imageSlider.setImageList(arrProdImages,ScaleTypes.CENTER_INSIDE);

        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNext = new Intent(ProductDetail.this, BottomActivity.class);
                startActivity(iNext);
            }
        });
    }
}