package com.example.informationbook.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.informationbook.Adapter.AdapterClass;
import com.example.informationbook.ModelClass;
import com.example.informationbook.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<ModelClass> arraylist;
    private AdapterClass adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView=findViewById(R.id.recyclerview);

        //for how the data will be displayed(orientation)
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        arraylist=new ArrayList<>();
        ModelClass modelClass1=new ModelClass("countries","Top 7 Countries (Area)");
        ModelClass modelClass2=new ModelClass("leaders","Top 3 Leaders");
        ModelClass modelClass3=new ModelClass("wonders","Wonders");
        ModelClass modelClass4=new ModelClass("coming","Coming Soon");
        ModelClass modelClass5=new ModelClass("coming2","Coming Soon");

        //now in order to show the data to the user we need to create a adapter class
        // if we will add the objects one by one into the adapter class that will make difficult
        // so make an array and add all the objects in it and transfer the array to the adapter


        arraylist.add(modelClass1);
        arraylist.add(modelClass2);
        arraylist.add(modelClass3);
        arraylist.add(modelClass4);
        arraylist.add(modelClass5);

        //for sending the arraylist to adapter class create a adapter class
        adapter=new AdapterClass(arraylist,this );

        //for setting the adapter object to recyclerView
        recyclerView.setAdapter(adapter);






    }
}