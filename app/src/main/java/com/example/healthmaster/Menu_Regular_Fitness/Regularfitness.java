package com.example.healthmaster.Menu_Regular_Fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.healthmaster.Menu_Weightloss.WL_Beginner_Level;
import com.example.healthmaster.Menu_Weightloss.WL_Mid_Level;
import com.example.healthmaster.Menu_Weightloss.WL_Pro_Level;
import com.example.healthmaster.R;

public class Regularfitness extends AppCompatActivity {
    ImageView reg1, reg2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regularfitness);
        reg1 = findViewById(R.id.imageView3);
        reg2 = findViewById(R.id.imageView4);



    }

    public void Rlvl1(View view) {
        Intent intent = new Intent(Regularfitness.this, Weight_grp_one.class);
        startActivity(intent);
    }

    public void Rlvl2(View view) {
        Intent intent = new Intent(Regularfitness.this, Weight_grp_two.class);
        startActivity(intent);
    }
}