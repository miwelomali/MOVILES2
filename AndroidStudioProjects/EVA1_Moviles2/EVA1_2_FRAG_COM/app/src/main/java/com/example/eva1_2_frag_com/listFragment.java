package com.example.eva1_2_frag_com;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;

import java.util.List;

import static com.example.eva1_2_frag_com.R.layout.fragment_list;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link listFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class listFragment extends Fragment {

    String[] datos = {
            "Tacos",
            "Burritos",
            "Hamburguesas",
            "Entomatadas",
            "Montados",
            "Caldito de pollo"};
    MainActivity main;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public listFragment() {
        // Required empty public constructor
    }




    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment listFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static listFragment newInstance(String param1, String param2) {
        listFragment fragment = new listFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main = (MainActivity)getActivity();
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        FrameLayout frameLayout = (FrameLayout) inflater.inflate(fragment_list, container, false);

        ListView list = frameLayout.findViewById(R.id.listLista);
        list.setAdapter(new ArrayAdapter<String>(
                main,
                android.R.layout.simple_list_item_1,
                datos
        ));
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                main.onMessageFromFragmentMain("Lista", datos[position]);
            }
        });
        return frameLayout;


}}
