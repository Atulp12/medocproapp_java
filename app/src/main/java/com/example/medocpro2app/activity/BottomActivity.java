package com.example.medocpro2app.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.medocpro2app.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class BottomActivity extends AppCompatActivity {
    private Fragment selectedFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);

        BottomNavigationView navigation = findViewById(R.id.bottom_navigation);
        navigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.home) {
                    selectedFragment = new Home_nav();
                } else if (id== R.id.explore) {
                    selectedFragment = new Explore();
                }
                else if (id== R.id.wishlist) {
                    selectedFragment = new Wishlist();
                }
                else if (id== R.id.cart) {
                    selectedFragment = new Cart();
                }
                else{
                    selectedFragment = new Account();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                return true;
            }

        });


        // Set initial fragment on app launch
        navigation.setSelectedItemId(R.id.home);


    }

}