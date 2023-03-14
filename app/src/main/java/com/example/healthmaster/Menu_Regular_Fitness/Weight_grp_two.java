package com.example.healthmaster.Menu_Regular_Fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.healthmaster.R;

public class Weight_grp_two extends AppCompatActivity {
    private Object VideoView;
    Button playVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_grp_two);
        getSupportActionBar().hide();



        MediaController mediaController = new MediaController(this);

        VideoView videoView = findViewById(R.id.Videoview);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Rehular" +
                "_workout%2Fregulartwo.mp4?alt=media&token=de24bfc7-8cd7-4292-8725-a9737cee8632");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}