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

public class russia extends Fragment {
    //this is for each time the fragment is called and then design of this fragment is visible
    public static russia newInstance(){
        return new russia();
    }
    private ImageView imageViewRussia;
    private ProgressBar progressBarRussia;

    //here using the inflater object we will define our desgin in our fragment class
    //this represent the activity to which we will bind our fragment

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.russia,container,false);
        imageViewRussia=view.findViewById(R.id.imageViewRussia);
        progressBarRussia=view.findViewById(R.id.progressBarRussia);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1280px-Flag_of_Russia.svg.png")
                .into(imageViewRussia, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarRussia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarRussia.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}


