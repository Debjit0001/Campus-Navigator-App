package com.example.campusnavigator;

import androidx.appcompat.app.AppCompatActivity;
import com.google.ar.core.Anchor;
import com.google.ar.core.AugmentedImage;
import com.google.ar.core.AugmentedImageDatabase;
//import com.google.ar.core.AugmentedImageTrackingMode;
//import com.google.ar.core.AugmentedImageTrackingResult;
//import com.google.ar.core.AugmentedImageRenderer;
import com.google.ar.core.AugmentedFace;
//import com.google.ar.core.AugmentedFaceRegion;
import com.google.ar.core.Camera;
import com.google.ar.core.Config;
//import com.google.ar.core.FaceMesh;
import com.google.ar.core.Frame;
import com.google.ar.core.HitResult;
import com.google.ar.core.Plane;
import com.google.ar.core.Pose;
import com.google.ar.core.Session;
import com.google.ar.core.Trackable;
import com.google.ar.core.TrackingState;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize AR session
//        ArSession arSession = new ArSession(/* Context */);

    }
}