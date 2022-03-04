package com.example.informationbook.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.informationbook.Adapter.ViewPagerAdapterCountries;
import com.example.informationbook.Adapter.ViewPagerAdapterLeaders;
import com.example.informationbook.Adapter.ViewPagerAdapterWonders;
import com.example.informationbook.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class WondersActivity extends AppCompatActivity {
    private TabLayout tabLayoutWonders;
    private ViewPager2 viewPagerWonders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wonders);
        getSupportActionBar().hide();

        tabLayoutWonders = findViewById(R.id.tabLayoutWonders);
        viewPagerWonders = findViewById(R.id.viewPagerWonders);

        //creating the object for using the ViewPagerAdapter Class that we have created for displaying the item
        ViewPagerAdapterWonders adapter = new ViewPagerAdapterWonders(getSupportFragmentManager(), getLifecycle());
        viewPagerWonders.setAdapter(adapter);

        //it is for creating a bind between tabLayout and ViewPager
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutWonders, viewPagerWonders,
                true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("Tajmahal");
                        break;
                    case 1:
                        tab.setText("Great Wall Of China");
                        break;
                    case 2:
                        tab.setText("Petra");
                        break;
                    case 3:
                        tab.setText("Colosseum");
                        break;
                    case 4:
                        tab.setText("Chichen Itza");
                        break;
                    case 5:
                        tab.setText("Machu Pichu");
                        break;
                    case 6:
                        tab.setText("Christ the Redeemer");
                        break;


                }
            }
        });
        tabLayoutMediator.attach();//this will attach tabLayout and viewPager

    }
}