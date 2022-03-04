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

public class canada extends Fragment {
    //this is for each time the fragment is called and then design of this fragment is visible
    public static canada newInstance(){
        return new canada();
    }
    private ImageView imageViewCanada;
    private ProgressBar progressBarCanada;

    //here using the inflater object we will define our desgin in our fragment class
    //this represent the activity to which we will bind our fragment

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.canada,container,false);
        imageViewCanada=view.findViewById(R.id.imageViewCanada);
        progressBarCanada=view.findViewById(R.id.progressBarCanada);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/1920px-Flag_of_Canada_%28Pantone%29.svg.png")
                .into(imageViewCanada, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarCanada.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarCanada.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}


