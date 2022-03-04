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

public class brazil extends Fragment {
    //this is for each time the fragment is called and then design of this fragment is visible
    public static brazil newInstance(){
        return new brazil();
    }
    private ImageView imageViewBrazil;
    private ProgressBar progressBarBrazil;

    //here using the inflater object we will define our desgin in our fragment class
    //this represent the activity to which we will bind our fragment

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.brazil,container,false);
        imageViewBrazil=view.findViewById(R.id.imageViewBrazil);
        progressBarBrazil=view.findViewById(R.id.progressBarBrazil);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/en/thumb/0/05/Flag_of_Brazil.svg/1280px-Flag_of_Brazil.svg.png")
                .into(imageViewBrazil, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarBrazil.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarBrazil.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}

