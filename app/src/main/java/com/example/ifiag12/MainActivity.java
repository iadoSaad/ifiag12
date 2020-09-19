package com.example.ifiag12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View v){
        Intent intent=new Intent(this,CalculatorActivity.class);
        startActivity(intent);

    }

    public void toRecyclerView(View v){
        Intent intent=new Intent(this,ListAcitivity.class);
        startActivity(intent);
    }
}
