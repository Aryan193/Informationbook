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

public class australia extends Fragment {
    //this is for each time the fragment is called and then design of this fragment is visible
    public static australia newInstance(){
        return new australia();
    }
    private ImageView imageViewAustralia;
    private ProgressBar progressBarAustralia;

    //here using the inflater object we will define our desgin in our fragment class
    //this represent the activity to which we will bind our fragment

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){

        View view=inflater.inflate(R.layout.australia,container,false);
        imageViewAustralia=view.findViewById(R.id.imageViewAustralia);
        progressBarAustralia=view.findViewById(R.id.progressBarAustralia);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Flag_of_Australia_%28converted%29.svg/1920px-Flag_of_Australia_%28converted%29.svg.png")
                .into(imageViewAustralia, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarAustralia.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarAustralia.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}