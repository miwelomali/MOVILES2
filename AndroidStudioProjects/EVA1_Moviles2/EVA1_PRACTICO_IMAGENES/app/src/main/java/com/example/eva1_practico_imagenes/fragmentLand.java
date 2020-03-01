package com.example.eva1_practico_imagenes;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.transition.Fade;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragmentLand extends Fragment {
int param;
    Scene escenaA;

    public fragmentLand() {
        // Required empty public constructor
    }
    public int getParam(int param) {
        return param;
    }


    public void setParam(int param) {
        this.param = param;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        LinearLayout frameLand = (LinearLayout) inflater.inflate(R.layout.fragment_fragment_land, container, false);
        ImageView imgLand,imgLand2,imgLand3;

        imgLand = frameLand.findViewById(R.id.imgLand);
        imgLand2 = frameLand.findViewById(R.id.imgLand2);
        imgLand3 = frameLand.findViewById(R.id.imgLand3);
        onMessageFromMainToFrag(param,imgLand,imgLand2,imgLand3);

        return frameLand;
    }

    public void onMessageFromMainToFrag(int param, ImageView imgLand, ImageView imgLand2, ImageView imgLand3) {
        switch (param){
            case 0:
                imgLand.setImageResource(R.drawable.frame00);
                imgLand2.setImageResource(R.drawable.frame01);
                imgLand3.setImageResource(R.drawable.frame02);
                break;
            case 1:
                imgLand.setImageResource(R.drawable.frame01);
                imgLand2.setImageResource(R.drawable.frame02);
                imgLand3.setImageResource(R.drawable.frame03);
                break;
            case 2:
                imgLand.setImageResource(R.drawable.frame02);
                imgLand2.setImageResource(R.drawable.frame03);
                imgLand3.setImageResource(R.drawable.frame04);
                break;
            case 3:
                imgLand.setImageResource(R.drawable.frame03);
                imgLand2.setImageResource(R.drawable.frame04);
                imgLand3.setImageResource(R.drawable.frame05);
                break;
            default:
                imgLand.setImageResource(R.drawable.frame04);
                imgLand2.setImageResource(R.drawable.frame05);
                imgLand3.setImageResource(R.drawable.frame06);
                break;
        }

    }

}
