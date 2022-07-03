package com.cristhianpallmay.worldofwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registrar extends AppCompatActivity {

    //Button cancela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        //cancelacion();
    }

    public void cancela(View view) {
        Intent cance = new Intent(Registrar.this, Iniciar_Seccion.class);
        startActivity(cance);
    }

    /*public void cancelacion(){
        cancela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cance = new Intent(Registrar.this, Iniciar_Seccion.class);
                startActivity(cance);
            }
        });
    }*/
}