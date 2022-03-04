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

public class unitedstates extends Fragment {
    //this is for each time the fragment is called and then design of this fragment is visible
    public static unitedstates newInstance(){
        return new unitedstates();
    }
    private ImageView imageViewUnitedStates;
    private ProgressBar progressBarUnitedStates;

    //here using the inflater object we will define our desgin in our fragment class
    //this represent the activity to which we will bind our fragment

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.unitedstates,container,false);
        imageViewUnitedStates=view.findViewById(R.id.imageViewUnitedStates);
        progressBarUnitedStates=view.findViewById(R.id.progressBarUnitedStates);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/1920px-Flag_of_the_United_States.svg.png")
                .into(imageViewUnitedStates, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarUnitedStates.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarUnitedStates.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}