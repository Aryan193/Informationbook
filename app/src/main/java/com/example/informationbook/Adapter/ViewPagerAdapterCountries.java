package com.example.informationbook.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.informationbook.Fragments.countries.australia;
import com.example.informationbook.Fragments.countries.brazil;
import com.example.informationbook.Fragments.countries.canada;
import com.example.informationbook.Fragments.countries.china;
import com.example.informationbook.Fragments.countries.indiafragment;
import com.example.informationbook.Fragments.countries.russia;
import com.example.informationbook.Fragments.countries.unitedstates;

public class ViewPagerAdapterCountries extends FragmentStateAdapter {
    public ViewPagerAdapterCountries(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        //specifying the order of the Fragment
        switch(position){

            case 0:
                fragment= russia.newInstance();
                break;
            case 1:
                fragment= canada.newInstance();
                break;
            case 2:
                fragment= china.newInstance();
                break;
            case 3:
                fragment= unitedstates.newInstance();
                break;
            case 4:
                fragment= brazil.newInstance();
                break;
            case 5:
                fragment= australia.newInstance();
                break;
            case 6:
                fragment= indiafragment.newInstance();
                break;
            default:
                return null;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 7;
    }
}
