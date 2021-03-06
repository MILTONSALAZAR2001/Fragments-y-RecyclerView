package com.example.infogram.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.infogram.R;
import com.example.infogram.model.Image;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewHolder> {
     private ArrayList<Image> images;
     private int resources;
     private Activity activity;
     public CardViewAdapter(ArrayList<Image>images,int resources,Activity activity){
         this.images=images;
         this.resources=resources;
         this.activity=activity;

     }



    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View view = LayoutInflater.from(parent.getContext()).inflate(resources,parent,false);

        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Image image = images.get(position);
        holder.usernameCardView.setText(image.getUsername());
        holder.cantidadDiasCardView.setText(image.getCantidadDias());
        holder.cantidadMeGustaCardView.setText(image.getCantidadMeGusta());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class  CardViewHolder extends RecyclerView.ViewHolder{
         private ImageView imageCardView;
         private TextView usernameCardView;
         private TextView cantidadDiasCardView;
         private TextView cantidadMeGustaCardView;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imageCardView = itemView.findViewById(R.id.imageCardView);
            usernameCardView=itemView.findViewById(R.id.usernameCardView);
            cantidadDiasCardView=itemView.findViewById(R.id.cantidadDiasCardView);
            cantidadMeGustaCardView=itemView.findViewById(R.id.cantidadMeGustaCardView);
        }
    }
}
