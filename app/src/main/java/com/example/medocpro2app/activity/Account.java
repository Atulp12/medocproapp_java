package com.example.medocpro2app.activity;

import static android.app.Activity.RESULT_OK;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.medocpro2app.R;

public class Account extends Fragment {


    ImageView profileImg,imagePick;
    private ActivityResultLauncher<Intent> launcher;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_account, container, false);

        profileImg = view.findViewById(R.id.profileImg);
        imagePick = view.findViewById(R.id.imagePick);


        imagePick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iGallery = new Intent(Intent.ACTION_PICK);
                iGallery.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                launcher.launch(iGallery);
            }
        });

        launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),result ->{
            if (result.getResultCode() == RESULT_OK && result.getData() != null) {
                Uri myUri = result.getData().getData();
                profileImg.setImageURI(myUri);
            }
        });

        return view;

    }

}