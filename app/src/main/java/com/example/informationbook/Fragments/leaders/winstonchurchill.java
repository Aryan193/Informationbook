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

public class winstonchurchill extends Fragment {
    //this is for each time the fragment is called and then design of this fragment is visible
    public static winstonchurchill newInstance(){
        return new winstonchurchill();
    }
    private ImageView imageViewWinston;
    private ProgressBar progressBarWinston;

    //here using the inflater object we will define our desgin in our fragment class
    //this represent the activity to which we will bind our fragment

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.winstonchurchill,container,false);
        imageViewWinston=view.findViewById(R.id.imageViewWinston);
        progressBarWinston=view.findViewById(R.id.progressBarWinston);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Sir_Winston_Churchill_-_19086236948.jpg/800px-Sir_Winston_Churchill_-_19086236948.jpg")
                .into(imageViewWinston, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarWinston.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarWinston.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}