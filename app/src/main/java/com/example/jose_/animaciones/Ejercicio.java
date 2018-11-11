package com.example.jose_.animaciones;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Ejercicio extends AppCompatActivity {
    ImageView imgCorona1, imgCorona2, imgCorona3;

    Button btnIzquierda, btnCentro, btnDerecha;

    Animation anim_COMBINADO;
    Animation anim_rotar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio);

        imgCorona1 =  findViewById(R.id.imgCorona1);
        imgCorona2 =  findViewById(R.id.imgCorona2);
        imgCorona3 =  findViewById(R.id.imgCorona3);

        btnIzquierda =  findViewById(R.id.btnIzquierda);
        btnCentro =  findViewById(R.id.btnCentro);
        btnDerecha =  findViewById(R.id.btnDerecha);

        //Combinado
        //horizontal
        anim_COMBINADO = AnimationUtils.loadAnimation(this,R.anim.bajar_aparecer);
        anim_COMBINADO.setDuration(1000);
        anim_COMBINADO.setFillAfter(true);

        //rotar
        anim_rotar = AnimationUtils.loadAnimation(this, R.anim.rotar);

        btnIzquierda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim_rotar);
                imgCorona1.startAnimation(anim_COMBINADO);
            }
        });

        btnCentro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim_rotar);
                imgCorona2.startAnimation(anim_COMBINADO);
            }
        });

        btnDerecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim_rotar);
                imgCorona3.startAnimation(anim_COMBINADO);
            }
        });
    }
}
