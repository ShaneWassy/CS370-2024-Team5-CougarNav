package com.csusm.navigation.cougarnav;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load the MapFragment by default
        if (savedInstanceState == null) {
            loadFragment(new MapFragment());
        }

        // Handle navigation in the BottomNavigationView
        BottomNavigationView navigation = findViewById(R.id.bottom_nav);
        navigation.setOnItemSelectedListener(item -> {
            Fragment selectedFragment;
            switch (item.getItemId()) {
                case R.id.navigation_map:
                    selectedFragment = new MapFragment();
                    break;
                case R.id.navigation_resources:
                    selectedFragment = new ResourcesFragment();
                    break;
                default:
                    selectedFragment = new MapFragment();
                    break;
            }
            loadFragment(selectedFragment);
            return true;
        });
    }

    // Helper method to load a fragment
    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}
