package com.example.medocpro2app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medocpro2app.R;

public class MainActivity extends AppCompatActivity {
    Button btn;
    AppCompatEditText emailText,passwordText;
    TextView signupTxt;
    ImageView medocLogo;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailText = findViewById(R.id.emailId);
        passwordText = findViewById(R.id.password);
        btn = findViewById(R.id.btnLogin);
        signupTxt = findViewById(R.id.signupTxt);
        final Animation animation = AnimationUtils.loadAnimation(this,R.anim.bounce);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailText.getText().toString();
                String password = passwordText.getText().toString();
                btn.startAnimation(animation);
                btn.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(email.equals("Atul") && password.equals("123")){
                            Intent iNext = new Intent(MainActivity.this, BottomActivity.class);
                            startActivity(iNext);
                        }
                        else{
                            Toast.makeText(MainActivity.this,"Invalid email or password",Toast.LENGTH_SHORT).show();
                        }
                    }
                },1000);

            }
        });

        signupTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNext = new Intent(MainActivity.this, SignupActivity.class);
                startActivity(iNext);
            }
        });


    }
}