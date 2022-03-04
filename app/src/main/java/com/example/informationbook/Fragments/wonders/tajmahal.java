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

public class tajmahal extends Fragment {
    //this is for each time the fragment is called and then design of this fragment is visible
    public static tajmahal newInstance(){
        return new tajmahal();
    }
    private ImageView imageViewTajmahal;
    private ProgressBar progressBarTajmahal;

    //here using the inflater object we will define our desgin in our fragment class
    //this represent the activity to which we will bind our fragment

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.tajmahal,container,false);
        imageViewTajmahal=view.findViewById(R.id.imageViewTajmahal);
        progressBarTajmahal=view.findViewById(R.id.progressBarTajmahal);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/6/67/Taj_Mahal_in_India_-_Kristian_Bertel.jpg/1280px-Taj_Mahal_in_India_-_Kristian_Bertel.jpg")
                .into(imageViewTajmahal, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarTajmahal.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarTajmahal.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}