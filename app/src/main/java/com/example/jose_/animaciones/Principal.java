package com.example.jose_.animaciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Principal extends AppCompatActivity {
    Button btnejemplo, btnejercicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnejemplo = (Button) findViewById(R.id.btnejemplo);
        btnejercicios = (Button) findViewById(R.id.btnEjercicios);

        btnejemplo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Principal.this,Ejemplo.class));
            }
        });

        btnejercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Principal.this, Ejercicio.class));
            }
        });
    }
}
