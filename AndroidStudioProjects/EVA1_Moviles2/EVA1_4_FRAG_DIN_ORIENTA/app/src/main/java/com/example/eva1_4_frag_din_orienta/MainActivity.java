package com.example.eva1_4_frag_din_orienta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
FrameLayout frmLytDetail;
Intent inSecun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMessageFromFragToMain(){
        frmLytDetail = findViewById(R.id.frmkLytDetail);
        if (frmLytDetail !=null ){ //MODO LANDSCAPE
            //CREAR EL FRAGMENT 2 DINAMICAMENTE
            Toast.makeText(this, "LANDSCAPE", Toast.LENGTH_SHORT).show();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            twoFragment two = new twoFragment();
            two.setParam("Este mensaje viene desde SET PARAM");
            ft.replace(R.id.frmkLytDetail,two);

            ft.commit();
        }

        else { //Modo PORTRAIT
            //LANZAR LA ACTIVIDAD SECUNDARIA CON INTENTO
            Toast.makeText(this, "PORTRAIT", Toast.LENGTH_SHORT).show();
            inSecun = new Intent(this, Secundaria.class);
            inSecun.putExtra("MENSAJE", "ESTE ES EL MENSAJE ");
            startActivity(inSecun);

        }
    }
}
