package com.example.eva1_6_transiciones;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Slide;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Intent inLlamar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setExitTransition(new Slide().setDuration(1000));
        getWindow().setExitTransition(new Fade().setDuration(1000));


        //getWindow().setEnterTransition(new Slide().setDuration(500));

        inLlamar = new Intent(this, nextActivity.class);
        setContentView(R.layout.activity_main);
    }


    public void onCLick(View v){
        Toast.makeText(this, "Nueva actividad", Toast.LENGTH_SHORT).show();

        startActivity(inLlamar, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());

    }
}
