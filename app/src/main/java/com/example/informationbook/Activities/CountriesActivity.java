package com.example.informationbook.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.informationbook.Adapter.ViewPagerAdapterCountries;
import com.example.informationbook.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class CountriesActivity extends AppCompatActivity {
    private TabLayout tabLayoutCountries;
    private ViewPager2 viewPagerCountries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);
        getSupportActionBar().hide();

        tabLayoutCountries = findViewById(R.id.tabLayoutCountries);
        viewPagerCountries = findViewById(R.id.viewPagerCountries);

        //creating the object for using the ViewPagerAdapter Class that we have created for displaying the item
        ViewPagerAdapterCountries adapter = new ViewPagerAdapterCountries(getSupportFragmentManager(), getLifecycle());
        viewPagerCountries.setAdapter(adapter);

        //it is for creating a bind between tabLayout and ViewPager
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutCountries, viewPagerCountries,
                true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("Russia");
                        break;
                    case 1:
                        tab.setText("Canada");
                        break;
                    case 2:
                        tab.setText("China");
                        break;
                    case 3:
                        tab.setText("United States");
                        break;
                    case 4:
                        tab.setText("Brazil");
                        break;
                    case 5:
                        tab.setText("Australia");
                        break;
                    case 6:
                        tab.setText("India");
                        break;


                }
            }
        });
        tabLayoutMediator.attach();//this will attach tabLayout and viewPager

    }
}