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

public class ci extends Fragment {
    //this is for each time the fragment is called and then design of this fragment is visible
    public static ci newInstance(){

        return new ci();
    }
    private ImageView imageViewCi;
    private ProgressBar progressBarCi;

    //here using the inflater object we will define our desgin in our fragment class
    //this represent the activity to which we will bind our fragment

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.ci,container,false);
        imageViewCi=view.findViewById(R.id.imageViewCi);
        progressBarCi=view.findViewById(R.id.progressBarCi);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Chichen_Itza_3.jpg/1920px-Chichen_Itza_3.jpg")
                .into(imageViewCi, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarCi.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarCi.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}