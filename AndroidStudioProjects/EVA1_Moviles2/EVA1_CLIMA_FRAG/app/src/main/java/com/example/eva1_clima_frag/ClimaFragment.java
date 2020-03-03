package com.example.eva1_clima_frag;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ClimaFragment extends Fragment {
ListView listViewClima;
SearchView searchView;

    Clima[] cCiudades = {
            new Clima(),
            new Clima(R.drawable.snow,"Bonn",20,"Nevado"),
            new Clima(R.drawable.tornado,"Villa Ahumada",30,"Ciclon"),
            new Clima(R.drawable.light_rain,"Tokyo",30,"Tranqui"),
            new Clima(R.drawable.cloudy,"Chihuahua",20,"Chill"),
            new Clima(R.drawable.thunderstorm,"Delicias",25,"Infernal")

    };
    public ClimaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_clima, container, false);
        listViewClima = (ListView) view.findViewById(R.id.listViewClima);
        listViewClima.setAdapter(new ClimaAdapter(getActivity(), R.layout.layoutclima, cCiudades));
        listViewClima.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent inDatos = new Intent();
                inDatos.putExtra("ciudad", cCiudades[position].getCiudad());
                inDatos.putExtra("temperatura", cCiudades[position].getTemperatura());
                inDatos.putExtra("clima", cCiudades[position].getClima());
                inDatos.putExtra("imagenClima", cCiudades[position].getImagen());

                Toast.makeText(view.getContext(), cCiudades[position].getCiudad(), Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }


}
