package com.example.eva1_4_frag_din_orienta;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class twoFragment extends Fragment {
    private String param;
    TextView txtDetail;

    public twoFragment() {
        // Required empty public constructor

    }

    public String getParam(String param) {
        return param;
    }


    public void setParam(String param) {
        this.param = param;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FrameLayout frame = (FrameLayout) inflater.inflate(R.layout.fragment_two, container, false);
        txtDetail = frame.findViewById(R.id.txtVwDetail);
        onMessageFromMainToFrag(param);
        return frame;
    }

    public void onMessageFromMainToFrag(String param) {
        txtDetail.setText(param);
    }

}
