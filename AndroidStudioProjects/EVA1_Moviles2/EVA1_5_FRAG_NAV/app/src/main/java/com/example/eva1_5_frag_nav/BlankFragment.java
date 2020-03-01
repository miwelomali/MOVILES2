package com.example.eva1_5_frag_nav;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout li = (LinearLayout) inflater.inflate(R.layout.fragment_blank, container, false);
        String strtext = getArguments().getString("edttext");
        TextView txtVwTexto = li.findViewById(R.id.txtVwBlank);
        txtVwTexto.setText(strtext);
        return li;
    }

}
