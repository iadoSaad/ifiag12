package com.example.ifiag12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    public void add(View v){
        EditText t1=findViewById(R.id.x);
        EditText t2=findViewById(R.id.y);
        String som ; int x,y;
        try {
            x=Integer.parseInt(t1.getText().toString());
            y=Integer.parseInt(t2.getText().toString());
            som=x+y+"";
        }catch(NumberFormatException ex){
            som="invalid input";
        }

        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Resulat seance 2");
        intent.putExtra(Intent.EXTRA_TEXT,"Le resultat est : "+ som);
        startActivity(intent);

    }
}
