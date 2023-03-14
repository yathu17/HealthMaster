package com.example.healthmaster.Menu_Yoga;

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

import com.example.healthmaster.Menu_Regular_Fitness.Regularfitness;
import com.example.healthmaster.Menu_Weightloss.Weightloss;
import com.example.healthmaster.Menus.Workout_type;
import com.example.healthmaster.R;

public class

Yoga extends AppCompatActivity {
    private Object VideoView;
    private Object prograssebar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);
        getSupportActionBar().hide();


        MediaController mediaController = new MediaController(this);

        prograssebar=findViewById(R.id.prg);
        VideoView videoView = findViewById(R.id.Videoview);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

//action bar color
        //  getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Yellow)));

        ListView listView = findViewById(R.id.listView);

        final String[] text = {"Step ->> 01", "Step ->> 02 ","Step ->> 03","Step ->> 04","Step ->> 05","Step ->> 06","Step ->> 07","Step ->> 08"
                ,"Step ->> 09","Step ->> 10","Step ->> 11"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, text);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You Choosed " + text[position], Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    videoView.setVisibility(View.VISIBLE);
                    Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Yoga%2Fy_one.mp4?alt=media&token=1543f02a-4f88-4ce6-ac9a-afbefed6624e");
                    videoView.setVideoURI(uri);
                    videoView.start();
                } else if (position == 1) {
                    videoView.setVisibility(View.VISIBLE);
                    Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Yoga%2Fy_two.mp4?alt=media&token=a0bfdb5c-7a3d-46c4-8f31-56f49369dcd4");
                    videoView.setVideoURI(uri);
                    videoView.start();
                } else if (position == 2) {
                    videoView.setVisibility(View.VISIBLE);
                    Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Yoga%2Fy_three.mp4?alt=media&token=c649c982-e60a-47de-8ad4-a06dadb11c50");
                    videoView.setVideoURI(uri);
                    videoView.start();
                } else if (position == 3) {
                    videoView.setVisibility(View.VISIBLE);
                    Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Yoga%2Fy_four.mp4?alt=media&token=4dc15e07-597b-4cb2-ad2e-665dbd118e70");
                    videoView.setVideoURI(uri);
                    videoView.start();
                } else if (position == 4) {
                    videoView.setVisibility(View.VISIBLE);
                    Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Yoga%2Fy_five.mp4?alt=media&token=603ce595-a4df-4a5c-b1a2-4c85aaa76029");
                    videoView.setVideoURI(uri);
                    videoView.start();
                }else if (position == 5) {
                    videoView.setVisibility(View.VISIBLE);
                    Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Yoga%2Fy_six.mp4?alt=media&token=265f88b0-a259-47de-8fbf-22549bee8bfd");
                    videoView.setVideoURI(uri);
                    videoView.start();
                }else if (position == 6) {
                    videoView.setVisibility(View.VISIBLE);
                    Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Yoga%2Fy_seven.mp4?alt=media&token=22ee7c68-5718-415c-bfb0-86ddf6c08d5b");
                    videoView.setVideoURI(uri);
                    videoView.start();
                }else if (position == 7) {
                    videoView.setVisibility(View.VISIBLE);
                    Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Yoga%2Fy_eight.mp4?alt=media&token=355de82d-b310-44fe-a60c-b7ee46f8fb6b");
                    videoView.setVideoURI(uri);
                    videoView.start();
                }else if (position == 8) {
                    videoView.setVisibility(View.VISIBLE);
                    Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Yoga%2Fy_nine.mp4?alt=media&token=1f6d00ab-bd3a-488e-a9a1-c9198ccb5e7e");
                    videoView.setVideoURI(uri);
                    videoView.start();
                }else if (position == 9) {
                    videoView.setVisibility(View.VISIBLE);
                    Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Yoga%2Fy_ten.mp4?alt=media&token=f0f17a93-32f2-447f-9690-057a274593c3");
                    videoView.setVideoURI(uri);
                    videoView.start();
                }else if (position == 10) {
                    videoView.setVisibility(View.VISIBLE);
                    Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Yoga%2Fy_eleven.mp4?alt=media&token=5646df79-f762-4b9b-ab01-845074cb28cc");
                    videoView.setVideoURI(uri);
                    videoView.start();
                }
            }
        });
    }
}


