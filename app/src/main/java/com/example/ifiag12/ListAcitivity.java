package com.example.ifiag12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ListAcitivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_acitivity);

       adapter=new MyAdapter();
        recyclerView=findViewById(R.id.idRecyclerView);
        layoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
