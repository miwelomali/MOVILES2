package com.example.eva1_practico_imagenes;


import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragmentPort extends Fragment {
int param;

    public fragmentPort() {
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
        FrameLayout framePort = (FrameLayout) inflater.inflate(R.layout.fragment_fragment_port, container, false);
        ImageView imgPort;
        imgPort = framePort.findViewById(R.id.imgPort);
        onMessageFromMainToFrag(param, imgPort);
        return framePort;
    }

    public void onMessageFromMainToFrag(int param, ImageView image) {

        switch (param){
            case 0:
                image.setImageResource(R.drawable.frame0);
                break;
            case 1:
                image.setImageResource(R.drawable.frame1);
                break;
            case 2:
                image.setImageResource(R.drawable.frame2);
                break;
            case 3:
                image.setImageResource(R.drawable.frame3);
                break;
            case 4:
                image.setImageResource(R.drawable.frame4);
                break;
            case 5:
                image.setImageResource(R.drawable.frame5);
                break;
            case 6:
                image.setImageResource(R.drawable.frame6);
                break;
            case 7:
                image.setImageResource(R.drawable.frame7);
                break;
            case 8:
                image.setImageResource(R.drawable.frame8);
                break;
            case 9:
                image.setImageResource(R.drawable.frame9);
                break;
            case 10:
                image.setImageResource(R.drawable.frame10);
                break;
            case 11:
                image.setImageResource(R.drawable.frame11);
                break;
            default:
                image.setImageResource(R.drawable.frame0);
                break;



        }

    }
}
