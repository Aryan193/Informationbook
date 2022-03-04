package com.example.informationbook.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.informationbook.Adapter.ViewPagerAdapterCountries;
import com.example.informationbook.Adapter.ViewPagerAdapterLeaders;
import com.example.informationbook.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class LeadersActivity extends AppCompatActivity {
    private TabLayout tabLayoutLeaders;
    private ViewPager2 viewPagerLeaders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaders);
        getSupportActionBar().hide();

        tabLayoutLeaders = findViewById(R.id.tabLayoutLeaders);
        viewPagerLeaders = findViewById(R.id.viewPagerLeaders);

        //creating the object for using the ViewPagerAdapter Class that we have created for displaying the item
        ViewPagerAdapterLeaders adapter = new ViewPagerAdapterLeaders(getSupportFragmentManager(), getLifecycle());
        viewPagerLeaders.setAdapter(adapter);

        //it is for creating a bind between tabLayout and ViewPager
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutLeaders, viewPagerLeaders,
                true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("Mahatma Gandhi");
                        break;
                    case 1:
                        tab.setText("Nelson Mandela");
                        break;
                    case 2:
                        tab.setText("winston Churchill");
                        break;



                }
            }
        });
        tabLayoutMediator.attach();//this will attach tabLayout and viewPager

    }
}