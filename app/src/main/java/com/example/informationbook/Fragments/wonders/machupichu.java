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

public class machupichu extends Fragment {
    //this is for each time the fragment is called and then design of this fragment is visible
    public static machupichu newInstance(){

        return new machupichu();
    }
    private ImageView imageViewMachuPichu;
    private ProgressBar progressBarMachuPichu;

    //here using the inflater object we will define our desgin in our fragment class
    //this represent the activity to which we will bind our fragment

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.machupichu,container,false);
        imageViewMachuPichu=view.findViewById(R.id.imageViewMachuPichu);
        progressBarMachuPichu=view.findViewById(R.id.progressBarMachuPichu);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Machu_Picchu%2C_Peru.jpg/1280px-Machu_Picchu%2C_Peru.jpg")
                .into(imageViewMachuPichu, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarMachuPichu.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarMachuPichu.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}