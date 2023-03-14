


package com.example.healthmaster.Muscles_Workout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.healthmaster.Menu_Dancing_yoga.Dancing_yoga;
import com.example.healthmaster.Menu_Regular_Fitness.Regularfitness;
import com.example.healthmaster.Menu_Weightloss.Weightloss;
import com.example.healthmaster.Menu_Yoga.Yoga;
import com.example.healthmaster.Menus.Workout_type;
import com.example.healthmaster.R;

public class Targets extends AppCompatActivity {
    private Object VideoView;
    private Object prograssebar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_targets);
        getSupportActionBar().hide();


        MediaController mediaController = new MediaController(this);

        prograssebar=findViewById(R.id.prg);
        VideoView videoView = findViewById(R.id.Videoview);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

//action bar color
        //  getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Yellow)));

        ListView listView = findViewById(R.id.listView);

        final String[] text = {"\nShoulders ->>\n ", "\nArms ->>\n","\nChest ->>\n ",
                "\nAbs ->> \n","\nAbs Core ->>\n ","\nBack ->> \n","\nLegs ->>\n ","\nThigh ->> \n"
                ,"\nGlutes ->>\n ","\nExternal Obilique ->> \n"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, text);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(getApplicationContext(), "You Choosed " + text[position], Toast.LENGTH_SHORT).show();
                    if (position == 0) {
                        videoView.setVisibility(View.VISIBLE);
                        Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Mascle_Workout%2Fshoulders.mp4?alt=media&token=43ed7ce7-db53-4fcf-8017-aa89d2f8fcc0");
                        videoView.setVideoURI(uri);
                        videoView.start();
                    } else if (position == 1) {
                        videoView.setVisibility(View.VISIBLE);
                        Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Mascle_Workout%2Farms.mp4?alt=media&token=8c5d5916-c928-4695-9558-59e9c536d558");
                        videoView.setVideoURI(uri);
                        videoView.start();
                    } else if (position == 2) {
                        videoView.setVisibility(View.VISIBLE);
                        Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Mascle_Workout%2Fchest.mp4?alt=media&token=ceb2faa0-6e1c-4c7f-80fc-f22486ccc224");
                        videoView.setVideoURI(uri);
                        videoView.start();
                    } else if (position == 3) {
                        videoView.setVisibility(View.VISIBLE);
                        Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Mascle_Workout%2Fabs.mp4?alt=media&token=beeec915-65d9-4ffa-b597-433fe33c6a4b");
                        videoView.setVideoURI(uri);
                        videoView.start();
                    } else if (position == 4) {
                        videoView.setVisibility(View.VISIBLE);
                        Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Mascle_Workout%2FAbs_core.mp4?alt=media&token=0c75de60-aad9-457d-beea-a9e8be871ab4");
                        videoView.setVideoURI(uri);
                        videoView.start();
                    }else if (position == 5) {
                        videoView.setVisibility(View.VISIBLE);
                        Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Mascle_Workout%2Fback.mp4?alt=media&token=c58128cb-2b39-40ed-87ef-407d02fa9d3e");
                        videoView.setVideoURI(uri);
                        videoView.start();
                    }else if (position == 6) {
                        videoView.setVisibility(View.VISIBLE);
                        Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Mascle_Workout%2Flegs.mp4?alt=media&token=d440b80d-24a6-4faa-9057-d61a9e38b657");
                        videoView.setVideoURI(uri);
                        videoView.start();
                    }else if (position == 7) {
                        videoView.setVisibility(View.VISIBLE);
                        Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Mascle_Workout%2FThigh.mp4?alt=media&token=ef579906-dc9f-4304-a3d1-a77d436dde77");
                        videoView.setVideoURI(uri);
                        videoView.start();
                    }else if (position == 8) {
                        videoView.setVisibility(View.VISIBLE);
                        Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Mascle_Workout%2Fglutes.mp4?alt=media&token=68d6c9d0-12d6-479c-a6a0-9ac2484bf9a7");
                        videoView.setVideoURI(uri);
                        videoView.start();
                    }else if (position == 9) {
                        videoView.setVisibility(View.VISIBLE);
                        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Mascle_Workout%2FE_B.mp4?alt=media&token=27b2d331-8167-4ebf-bba9-49540ca263ee");
                        videoView.setVideoURI(uri);
                        videoView.start();
                    }
            }
        });
    }
}

