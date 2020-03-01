package com.example.eva1_practico_imagenes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    SeekBar seekPort;
    SeekBar seekLand;
    LinearLayout linearLayoutLand;
    LinearLayout linearLayoutPort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekPort = findViewById(R.id.seekBar2);
        seekLand = findViewById(R.id.seekBar);
        try {
            seekPort.setOnSeekBarChangeListener(this);
        } catch (Exception e) {

        }
        try {
            seekLand.setOnSeekBarChangeListener(this);
        } catch (Exception e) {

        }

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        linearLayoutLand = findViewById(R.id.linearLayoutLand);
        linearLayoutPort = findViewById(R.id.linearLayoutPort);
        if (linearLayoutLand != null) { //Se encuentra en Landscape

            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            fragmentLand land = new fragmentLand();
            land.setParam(progress);

            ft.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
            ft.replace(R.id.linearLayoutLand,land);

            ft.commit();

        } else {    //Se encuentra en Portrait


            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            fragmentPort Port = new fragmentPort();
            Port.setParam(progress);
            ft.setCustomAnimations(R.anim.pop_enter, R.anim.pop_exit);
            ft.replace(R.id.linearLayoutPort,Port);
            ft.commit();
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
