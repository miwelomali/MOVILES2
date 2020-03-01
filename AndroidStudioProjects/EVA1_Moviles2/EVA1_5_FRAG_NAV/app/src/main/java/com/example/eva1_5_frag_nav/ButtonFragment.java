package com.example.eva1_5_frag_nav;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ButtonFragment extends Fragment {
    private View.OnClickListener miCLickLis;
    private String Datos;



    public void setMiCLickLis(View.OnClickListener miCLickLis) {
        this.miCLickLis = miCLickLis;
    }


    public ButtonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FrameLayout li = (FrameLayout) inflater.inflate(R.layout.fragment_button, container, false);
        Button btn = li.findViewById(R.id.btnFragmentButton);

        btn.setOnClickListener(miCLickLis);
        return li;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Toast.makeText(getContext(), "ButtonFragment Cerrado", Toast.LENGTH_SHORT).show();
    }
}
