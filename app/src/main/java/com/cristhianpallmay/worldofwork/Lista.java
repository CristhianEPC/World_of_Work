package com.cristhianpallmay.worldofwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lista extends AppCompatActivity {

    //Button chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        //chatea();
    }

    public void chatea(View view) {
        Intent cha = new Intent(Lista.this, Chat.class);
        startActivity(cha);
    }

    /*private void chatea(){
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cha = new Intent(Lista.this, Chat.class);
                startActivity(cha);
            }
        });
    }*/
}