package com.example.ifiag12;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<Person> myData;

  public   MyAdapter(){
        myData=new ArrayList<>();
        for(int i=0;i<100;i++){
            myData.add(new Person(i,"nom"+i));
        }

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v= LayoutInflater.from(parent.getContext()).
                    inflate(R.layout.person_item,parent,false);
            return new  MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.idView.setText(myData.get(position).id+"");
            holder.nomVuew.setText(myData.get(position).Nom);

    }

    @Override
    public int getItemCount() {
        return  myData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView idView;
        public TextView nomVuew;
        public ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.idView = itemView.findViewById(R.id.idPerson);
            this.nomVuew = itemView.findViewById(R.id.nom);
            this.imageView = null;
        }
    }

    public static class Person{
        public int id;
        public String Nom;
        public  String urlImage;

        public Person(int id, String nom) {
            this.id = id;
            Nom = nom;
        }

        public Person(int id, String nom, String urlImage) {
            this.id = id;
            Nom = nom;
            this.urlImage = urlImage;
        }
    }
}
