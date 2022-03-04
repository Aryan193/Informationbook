package com.example.informationbook.Fragments.leaders;

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

public class mahatmagandhi extends Fragment {
    //this is for each time the fragment is called and then design of this fragment is visible
    public static mahatmagandhi newInstance(){
        return new mahatmagandhi();
    }
    private ImageView imageViewMahatma;
    private ProgressBar progressBarMahatma;

    //here using the inflater object we will define our desgin in our fragment class
    //this represent the activity to which we will bind our fragment

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.mahatmagandhi,container,false);
        imageViewMahatma=view.findViewById(R.id.imageViewMahatma);
        progressBarMahatma=view.findViewById(R.id.progressBarMahatma);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7a/Mahatma-Gandhi%2C_studio%2C_1931.jpg/800px-Mahatma-Gandhi%2C_studio%2C_1931.jpg")
                .into(imageViewMahatma, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarMahatma.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMahatma.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}