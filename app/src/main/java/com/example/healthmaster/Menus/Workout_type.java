package com.example.healthmaster.Menus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Toast;

import com.example.healthmaster.Menu_Dancing_yoga.Dancing_yoga;
import com.example.healthmaster.Menu_Regular_Fitness.Regularfitness;
import com.example.healthmaster.Menu_Weightloss.Weightloss;
import com.example.healthmaster.Menu_Yoga.Yoga;
import com.example.healthmaster.Muscles_Workout.Targets;
import com.example.healthmaster.R;

public class Workout_type extends AppCompatActivity {
    GridView gridView;
    // set values for grid view content for pizza resta
    String[] fit_list = {"WEIGHT LOSS","REGULAR FITNESS","MUSCLES WORKOUT","YOGA","DANCING YOGA"};

    int[] fit_img = {R.drawable.weightlosss, R.drawable.regfit, R.drawable.buildmuscle, R.drawable.yoga,
            R.drawable.dancingyoga};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_type);
        getSupportActionBar().hide();

        gridView=findViewById(R.id.gridView);

        MainAdapter adapter= new MainAdapter(Workout_type.this,fit_list,fit_img);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You Choosed " + fit_list[+position], Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    startActivity(new Intent(Workout_type.this, Weightloss.class));
                } else if (position == 1) {
                    startActivity(new Intent(Workout_type.this, Regularfitness.class));
                }else if(position == 2) {
                    startActivity(new Intent(Workout_type.this, Targets.class));
                }else if(position == 3) {
                    startActivity(new Intent(Workout_type.this, Yoga.class));
                }else if(position == 4) {
                    startActivity(new Intent(Workout_type.this, Dancing_yoga.class));
                }
            }
        });

    }
}


