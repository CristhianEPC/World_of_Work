package com.cristhianpallmay.worldofwork;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bnt_inicia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void inicio(View view) {
        Intent ini = new Intent(MainActivity.this,Iniciar_Seccion.class);
        startActivity(ini);
    }
    /*blic void inici(){
      bnt_inicia.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent ini = new Intent(MainActivity.this,Iniciar_Seccion.class);
              startActivity(ini);
          }
      });

    }*/
}
