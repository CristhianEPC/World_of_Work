package com.cristhianpallmay.worldofwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Iniciar_Seccion extends AppCompatActivity {

    //Button registra;
    //Button ingresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_seccion);

    }


    public void ingresa(View view) {
        Intent ingre = new Intent(Iniciar_Seccion.this,Lista.class);
        startActivity(ingre);
    }

    public void registra(View view) {
        Intent regi = new Intent(Iniciar_Seccion.this,Registrar.class);
        startActivity(regi);
    }

}