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

public class gwofchina extends Fragment {
    //this is for each time the fragment is called and then design of this fragment is visible
    public static gwofchina newInstance(){

        return new gwofchina();
    }
    private ImageView imageViewGwofChina;
    private ProgressBar progressBarGwofChina;

    //here using the inflater object we will define our desgin in our fragment class
    //this represent the activity to which we will bind our fragment

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.gwofchina,container,false);
        imageViewGwofChina=view.findViewById(R.id.imageViewGwofChina);
        progressBarGwofChina=view.findViewById(R.id.progressBarGwofChina);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/The_Great_Wall_of_China_at_Jinshanling-edit.jpg/1280px-The_Great_Wall_of_China_at_Jinshanling-edit.jpg")
                .into(imageViewGwofChina, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarGwofChina.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarGwofChina.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}