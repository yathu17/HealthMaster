package com.example.healthmaster.Menu_Dancing_yoga;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.healthmaster.R;

public class Dancing_yoga extends AppCompatActivity {
    Button playVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dancing_yoga);
        getSupportActionBar().hide();

        MediaController mediaController = new MediaController(this);

        VideoView videoView = findViewById(R.id.Videoview);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Dancing_yoga%2FDancing_yoga.mp4?alt=media&token=e3b5e65b-e357-444d-992d-ad90769e8a16");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}