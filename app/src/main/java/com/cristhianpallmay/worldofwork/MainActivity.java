package com.cristhianpallmay.worldofwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Button BtnOfrecerServicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    //setContentView(R.layout.activity_perfil_usuario_n);
    BtnOfrecerServicio=(Button)findViewbyId(R.id.BtnOfrecerServicio);

    BtnOfrecerServicio.setOnClickListener(new View.OnClickListener(){


        @Override
        public void onClick(View v) {
            Intent i = new Intent(packageContext: MainActivity.this, activity_ofrecer_servicio.class);
            startActivity(i);
        }
    });
}
}