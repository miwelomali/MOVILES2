package com.example.eva1_2_frag_com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    buttonFragment btnFragment;
    listFragment   lstFragment;
    TextView txtVwMensa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwMensa = findViewById(R.id.txtVwMensa);
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);

        if (fragment.getClass() == buttonFragment.class){

            btnFragment = (buttonFragment) fragment;
        }

        else if(fragment.getClass() == listFragment.class){
            lstFragment = (listFragment) fragment;

        }
    }
    //Quien y que estamos enviando
    public void onMessageFromFragmentMain(String Sender, String param){
        if(Sender.equals("Lista")){
            txtVwMensa.setText("Lista: " + param);
        }
        else if(Sender.equals("Boton")){

            txtVwMensa.setText("Botón: " + param);

        }

    }
}
