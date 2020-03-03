package com.example.eva1_clima_frag;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;


public class ClimaAdapter extends ArrayAdapter <Clima>{



    private Context context;
    private int resource;
    Clima[] Ciudad;

    public ClimaAdapter(Context context, int resource, Clima[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.Ciudad = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imgClima;
        TextView txtVwCiudad, txtVwTemp, txtVwClima;



        if(convertView == null){
            LayoutInflater iInflator = ((Activity)context).getLayoutInflater();
            convertView = iInflator.inflate(resource,parent,false);
        }
        imgClima = convertView.findViewById(R.id.imgVwImagen);
        txtVwCiudad = convertView.findViewById(R.id.txtVwCiudad);
        txtVwClima = convertView.findViewById(R.id.txtVwClima);
        txtVwTemp = convertView.findViewById(R.id.txtVwTemper);


        imgClima.setImageResource(Ciudad[position].getImagen());
        txtVwCiudad.setText(Ciudad[position].getCiudad());
        txtVwClima.setText(Ciudad[position].getClima());
        txtVwTemp.setText(Ciudad[position].getTemperatura() + "C");
        return convertView;

    }
}

