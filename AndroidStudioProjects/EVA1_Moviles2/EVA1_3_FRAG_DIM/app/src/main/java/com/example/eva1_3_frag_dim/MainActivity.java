package com.example.eva1_3_frag_dim;

import androidx.appcompat.app.AppCompatActivity;


import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void button1(View v){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        BlueFragment onc = new BlueFragment();
        ft.replace(R.id.frgLyRem, onc);
    }

    public void button2(View v){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        RedFragment onc = new RedFragment();
        ft.replace(R.id.frgLyRem, onc);
    }
}
