package com.example.healthmaster.Menu_Weightloss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.healthmaster.R;

public class Weightloss extends AppCompatActivity {
    ImageView beginner, midl,prol;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weightloss);
        beginner = findViewById(R.id.imageView3);
        midl = findViewById(R.id.imageView4);
        prol=findViewById(R.id.imageView5);



    }

    public void beginlv(View view) {
        Intent intent = new Intent(Weightloss.this,WL_Beginner_Level.class);
        startActivity(intent);
    }

    public void midlv(View view) {
        Intent intent = new Intent(Weightloss.this,WL_Mid_Level.class);
        startActivity(intent);
    }

    public void prolv(View view) {
        Intent intent = new Intent(Weightloss.this,WL_Pro_Level.class);
        startActivity(intent);
    }
}