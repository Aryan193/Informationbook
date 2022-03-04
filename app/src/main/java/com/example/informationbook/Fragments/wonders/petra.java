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

public class petra extends Fragment {
    //this is for each time the fragment is called and then design of this fragment is visible
    public static petra newInstance(){

        return new petra();
    }
    private ImageView imageViewPetra;
    private ProgressBar progressBarPetra;

    //here using the inflater object we will define our desgin in our fragment class
    //this represent the activity to which we will bind our fragment

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.petra,container,false);
        imageViewPetra=view.findViewById(R.id.imageViewPetra);
        progressBarPetra=view.findViewById(R.id.progressBarPetra);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/Treasury_petra_crop.jpeg/800px-Treasury_petra_crop.jpeg")
                .into(imageViewPetra, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarPetra.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarPetra.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}