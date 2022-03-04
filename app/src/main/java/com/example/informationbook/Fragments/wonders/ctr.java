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

public class ctr extends Fragment {
    //this is for each time the fragment is called and then design of this fragment is visible
    public static ctr newInstance(){

        return new ctr();
    }
    private ImageView imageViewctr;
    private ProgressBar progressBarctr;

    //here using the inflater object we will define our desgin in our fragment class
    //this represent the activity to which we will bind our fragment

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.ctr,container,false);
        imageViewctr=view.findViewById(R.id.imageViewctr);
        progressBarctr=view.findViewById(R.id.progressBarctr);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/e/e7/Aerial_view_of_the_Statue_of_Christ_the_Redeemer.jpg")
                .into(imageViewctr, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarctr.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarctr.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}