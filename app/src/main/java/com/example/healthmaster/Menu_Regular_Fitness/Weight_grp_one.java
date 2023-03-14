package com.example.healthmaster.Menu_Regular_Fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.healthmaster.R;

public class Weight_grp_one extends AppCompatActivity {
    private Object VideoView;
    Button playVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_grp_one);
        getSupportActionBar().hide();

        MediaController mediaController = new MediaController(this);

        VideoView videoView = findViewById(R.id.Videoview);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Rehular_workout%2Fregularone.mp4?alt=media&token=a72d053d-6733-4d53-8207-44707c7be7e7");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}