package com.example.eva1_4_frag_din_orienta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;

public class Secundaria extends AppCompatActivity {
    twoFragment two = null;

    @Override
    public void onAttachFragment(Fragment fragment) {

        two = (twoFragment) fragment;
        Log.wtf("mensaje","on Attach");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        //GET INTENT, RECUPERAR BUNDLE Y PASAR DATOS AL FRAGMENTO
        Log.wtf("mensaje","on create");


        two.onMessageFromMainToFrag(getIntent().getStringExtra("MENSAJE"));
    }
}
