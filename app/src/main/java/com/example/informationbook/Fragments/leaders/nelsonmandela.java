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

public class nelsonmandela extends Fragment {
    //this is for each time the fragment is called and then design of this fragment is visible
    public static nelsonmandela newInstance(){
        return new nelsonmandela();
    }
    private ImageView imageViewNelson;
    private ProgressBar progressBarNelson;

    //here using the inflater object we will define our desgin in our fragment class
    //this represent the activity to which we will bind our fragment

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.nelsonmandela,container,false);
        imageViewNelson=view.findViewById(R.id.imageViewNelson);
        progressBarNelson=view.findViewById(R.id.progressBarNelson);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/0/02/Nelson_Mandela_1994.jpg/800px-Nelson_Mandela_1994.jpg")
                .into(imageViewNelson, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarNelson.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarNelson.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}