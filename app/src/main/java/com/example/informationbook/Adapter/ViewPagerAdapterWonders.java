package com.example.informationbook.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.informationbook.Fragments.wonders.ci;
import com.example.informationbook.Fragments.wonders.colosseum;
import com.example.informationbook.Fragments.wonders.ctr;
import com.example.informationbook.Fragments.wonders.gwofchina;
import com.example.informationbook.Fragments.wonders.machupichu;
import com.example.informationbook.Fragments.wonders.petra;
import com.example.informationbook.Fragments.wonders.tajmahal;

public class ViewPagerAdapterWonders extends FragmentStateAdapter {
    public ViewPagerAdapterWonders(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch(position){

            case 0:
                fragment= tajmahal.newInstance();
                break;
            case 1:
                fragment= gwofchina.newInstance();
                break;
            case 2:
                fragment= petra.newInstance();
                break;
            case 3:
                fragment= colosseum.newInstance();
                break;
            case 4:
                fragment= ci.newInstance();
                break;
            case 5:
                fragment= machupichu.newInstance();
                break;
            case 6:
                fragment= ctr.newInstance();
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
