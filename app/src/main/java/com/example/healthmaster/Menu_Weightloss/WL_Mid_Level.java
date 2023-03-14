package com.example.healthmaster.Menu_Weightloss;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.healthmaster.R;

public class WL_Mid_Level extends AppCompatActivity {
    private Object VideoView;
    Button playVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wl_mid_level);
        getSupportActionBar().hide();


        MediaController mediaController = new MediaController(this);

        VideoView videoView = findViewById(R.id.Videoview);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/healthmaster-4a77b.appspot.com/o/Weight_loss%2Fmlevel.mp4?alt=media&token=39fbcde7-e2b2-4e36-bd51-6ce1c71105fe");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}