package com.example.informationbook.Fragments.countries;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.informationbook.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class indiafragment extends Fragment {
  //this is for each time the fragment is called and then design of this fragment is visible
    public static indiafragment newInstance(){
        return new indiafragment();
    }
    private ImageView imageViewIndia;
    private ProgressBar progressBarIndia;

    //here using the inflater object we will define our desgin in our fragment class
    //this represent the activity to which we will bind our fragment

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.indiafragment,container,false);
        imageViewIndia=view.findViewById(R.id.imageViewIndia);
        progressBarIndia=view.findViewById(R.id.progressBarIndia);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/en/thumb/4/41/Flag_of_India.svg/1280px-Flag_of_India.svg.png")
        .into(imageViewIndia, new Callback() {
            @Override
            public void onSuccess() {
                progressBarIndia.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                progressBarIndia.setVisibility(View.INVISIBLE);
            }
        });

        return view;
    }
}
