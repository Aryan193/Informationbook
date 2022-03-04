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

public class china extends Fragment {
    //this is for each time the fragment is called and then design of this fragment is visible
    public static china newInstance(){
        return new china();
    }
    private ImageView imageViewChina;
    private ProgressBar progressBarChina;

    //here using the inflater object we will define our desgin in our fragment class
    //this represent the activity to which we will bind our fragment

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.china,container,false);
        imageViewChina=view.findViewById(R.id.imageViewChina);
        progressBarChina=view.findViewById(R.id.progressBarChina);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_the_People%27s_Republic_of_China.svg/1280px-Flag_of_the_People%27s_Republic_of_China.svg.png")
                .into(imageViewChina, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarChina.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarChina.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}


