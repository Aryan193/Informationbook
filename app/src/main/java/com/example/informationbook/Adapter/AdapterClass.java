package com.example.informationbook.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.informationbook.Activities.CountriesActivity;
import com.example.informationbook.Activities.LeadersActivity;
import com.example.informationbook.Activities.WondersActivity;
import com.example.informationbook.Activities.coming;
import com.example.informationbook.Activities.coming2;
import com.example.informationbook.ModelClass;
import com.example.informationbook.R;

import java.util.ArrayList;
//note-first create the last class

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.CardViewHolder> {

    private ArrayList<ModelClass> modelList;
    private Context context;

    public AdapterClass(ArrayList<ModelClass> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }


    //this method will be called as soon as the below CardViewHolder class is called
    //this method we will define the card design that we have made
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //first create an view object from the viewclass that i will transfer the card design to.
        //layoutInflater method will link the design that we created to the view
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        return new CardViewHolder(view);
    }

    // in this method we specify that what should be done when the design we created is connected to Recycler View
    // in simple way we will display the data on the screen and recyclibility
    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        ModelClass modelClass=modelList.get(position);
        //we can,t directly access the imageview and textview so here we will use holder object
        holder.textViewSplash.setText(modelClass.getCategoryName());
        holder.imageViewSplash.setImageResource(context.getResources()
                .getIdentifier(modelClass.getImageName(),"drawable",context.getPackageName()));
        //for cardView ClickListener
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(holder.getAdapterPosition()==0){
                    Intent intent=new Intent(context, CountriesActivity.class);
                    context.startActivity(intent);
                }
                if(holder.getAdapterPosition()==1){
                    Intent intent=new Intent(context, LeadersActivity.class);
                    context.startActivity(intent);
                }
                if(holder.getAdapterPosition()==2){
                    Intent intent=new Intent(context, WondersActivity.class);
                    context.startActivity(intent);
                }
                if(holder.getAdapterPosition()==3){
                    Intent intent=new Intent(context, coming.class);
                    context.startActivity(intent);
                }
                if(holder.getAdapterPosition()==4){
                    Intent intent=new Intent(context, coming2.class);
                    context.startActivity(intent);
                }
            }
        });
        /**why i am using holder.getAdapterPosition instead of only position
         * Note that unlike ListView, RecyclerView will not call this method again if the position
         * of the item changes in the data set unless the item itself is invalidated or the new position cannot be determined.
         * For this reason, you should only use the position parameter while acquiring the related data item inside this method
         * and should not keep a copy of it. If you need the position of an item later on (e.g. in a click listener),
         * use getAdapterPosition() which will have the updated adapter position
         * */
    }
    //in this method we will specify the amount of data we were going to display in recycler view
    @Override
    public int getItemCount() {

        return modelList.size();//here we write  the size of the array
    }

    //now we will create another class inside this class which will represent the card design

    public class CardViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewSplash;
        private TextView textViewSplash;
        private CardView cardView;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewSplash=itemView.findViewById(R.id.imageViewSplash);
            textViewSplash=itemView.findViewById(R.id.textViewSplash);
            cardView=itemView.findViewById(R.id.cardView);
        }
    }
}
