package com.example.medocpro2app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.medocpro2app.R;

public class SignupActivity extends AppCompatActivity {

    TextView loginTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        loginTxt = findViewById(R.id.loginTxt);

        loginTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNext = new Intent(SignupActivity.this, MainActivity.class);
                startActivity(iNext);
            }
        });
    }
}