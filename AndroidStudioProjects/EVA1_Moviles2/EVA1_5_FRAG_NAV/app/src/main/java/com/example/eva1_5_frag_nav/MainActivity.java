package com.example.eva1_5_frag_nav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentTransaction ft2;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.setCustomAnimations(R.anim.anim_exit, R.anim.anim_exit);
        ButtonFragment buttonFragment = new ButtonFragment();
        buttonFragment.setMiCLickLis(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Realizamos el fragmento 2 con los mismos pasos:
                ft2 = getSupportFragmentManager().beginTransaction();

                ft2.setCustomAnimations(R.anim.anim_exit, R.anim.anim_exit);
                BlankFragment blankFragment = new BlankFragment();
                Bundle bundle = new Bundle();
                bundle.putString("edttext", "Hola mundo desde MainActivity");
                blankFragment.setArguments(bundle);
                ft2.replace(R.id.frmLytFragmentos, blankFragment);
                ft2.addToBackStack("CID");

                ft2.commit();
            }
        });
        ft.replace(R.id.frmLytFragmentos, buttonFragment);
        //ft.addToBackStack("HOLA");
        ft.commit();
    }
}
