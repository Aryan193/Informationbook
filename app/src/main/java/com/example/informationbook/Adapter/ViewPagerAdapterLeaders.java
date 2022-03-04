package com.example.informationbook.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.informationbook.Fragments.leaders.mahatmagandhi;
import com.example.informationbook.Fragments.leaders.nelsonmandela;
import com.example.informationbook.Fragments.leaders.winstonchurchill;

public class ViewPagerAdapterLeaders extends FragmentStateAdapter {
    public ViewPagerAdapterLeaders(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch(position){
            case 0:
                fragment= mahatmagandhi.newInstance();
                break;
            case 1:
                fragment= nelsonmandela.newInstance();
                break;
            case 2:
                fragment= winstonchurchill.newInstance();
                break;
            default:
                return null;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
