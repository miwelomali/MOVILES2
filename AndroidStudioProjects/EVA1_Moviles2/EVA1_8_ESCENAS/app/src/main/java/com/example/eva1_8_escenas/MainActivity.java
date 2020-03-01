package com.example.eva1_8_escenas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Fade;
import android.transition.Scene;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
Scene escenaA,escenaB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewGroup reemp = findViewById(R.id.layoutRem);
        escenaA = Scene.getSceneForLayout(reemp, R.layout.escena_a, this);
        escenaB = Scene.getSceneForLayout(reemp, R.layout.escena_b, this);
        Transition fade = new Fade();
        TransitionManager.go(escenaB,fade);

    }

    public void miCLick(View v){
        Transition slide = new Slide();
        TransitionManager.go(escenaA, slide);
    }
}
