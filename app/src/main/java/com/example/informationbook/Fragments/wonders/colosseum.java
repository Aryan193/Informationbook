package com.example.informationbook.Fragments.wonders;

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

public class colosseum extends Fragment {
    //this is for each time the fragment is called and then design of this fragment is visible
    public static colosseum newInstance(){

        return new colosseum();
    }
    private ImageView imageViewColosseum;
    private ProgressBar progressBarColosseum;

    //here using the inflater object we will define our desgin in our fragment class
    //this represent the activity to which we will bind our fragment

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.colosseum,container,false);
        imageViewColosseum=view.findViewById(R.id.imageViewColosseum);
        progressBarColosseum=view.findViewById(R.id.progressBarColosseum);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Colosseo_2020.jpg/1280px-Colosseo_2020.jpg")
                .into(imageViewColosseum, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarColosseum.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarColosseum.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}