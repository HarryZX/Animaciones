package com.example.jose_.animaciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Ejemplo extends AppCompatActivity {
    ImageView imgView;
    Button btnAnim1, btnAnim2, btnAnim3, btnAnim4, btnAnim5;

    Animation anim_rotar;
    Animation anim_izq;
    Animation anim_der;
    Animation anim_arriba;
    Animation anim_abajo;
    Animation anim_aparecer;
    Animation anim_desaparecer;
    Animation anim_zoomIN;
    Animation anim_zoomOut;
    Animation anim_COMBINADO;

    Boolean es_der;
    Boolean es_arriba;
    Boolean es_visible;
    Boolean es_zoomIN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo);
        btnAnim1 = (Button) findViewById(R.id.btnanimar1);
        btnAnim2 = (Button) findViewById(R.id.btnanimar2);
        btnAnim3 = (Button) findViewById(R.id.btnanimar3);
        btnAnim4 = (Button) findViewById(R.id.btnanimar4);
        btnAnim5 = (Button) findViewById(R.id.btnanimar5);

        imgView = (ImageView) findViewById(R.id.imgView1);

        //rotar
        anim_rotar = AnimationUtils.loadAnimation(this,R.anim.rotar);

        //horizontal
        anim_izq = AnimationUtils.loadAnimation(this,R.anim.a_izq);
        anim_izq.setDuration(1000);
        anim_izq.setFillAfter(true);

        anim_der = AnimationUtils.loadAnimation(this, R.anim.a_der);
        anim_der.setDuration(1000);
        anim_der.setFillAfter(true);

        //vertical
        anim_arriba = AnimationUtils.loadAnimation(this,R.anim.a_arriba);
        anim_arriba.setDuration(1000);
        anim_arriba.setFillAfter(true);

        anim_abajo = AnimationUtils.loadAnimation(this,R.anim.a_abajo);
        anim_abajo.setDuration(1000);
        anim_abajo.setFillAfter(true);

        //alpha
        anim_aparecer = AnimationUtils.loadAnimation(this,R.anim.aparecer);
        anim_aparecer.setDuration(1000);
        anim_aparecer.setFillAfter(true);

        anim_desaparecer = AnimationUtils.loadAnimation(this,R.anim.desaparecer);
        anim_desaparecer.setDuration(1000);
        anim_desaparecer.setFillAfter(true);

        //zoom
        anim_zoomIN = AnimationUtils.loadAnimation(this,R.anim.zoom_in);
        anim_zoomIN.setDuration(1000);
        anim_zoomIN.setFillAfter(true);

        anim_zoomOut = AnimationUtils.loadAnimation(this,R.anim.zoom_out);
        anim_zoomOut.setDuration(1000);
        anim_zoomOut.setFillAfter(true);

        //Combinado
        //horizontal
        anim_COMBINADO = AnimationUtils.loadAnimation(this,R.anim.subir_aparecer);
        anim_COMBINADO.setDuration(1000);
        anim_COMBINADO.setFillAfter(true);

        //variables de estado
        es_der = true;
        es_arriba = true;
        es_visible = true;
        es_zoomIN = true;

        //horizontal
        btnAnim1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim_rotar);
                animacionesDER_IZQ();
            }
        });

        //vertical
        btnAnim2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim_rotar);
                animacionesARRIBA_ABAJO();
            }
        });

        //alpha
        btnAnim3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim_rotar);
                animacionesAPARECER_DESAPARECER();
            }
        });

        //zoom
        btnAnim4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim_rotar);
                animacionesIN_OUT();
            }
        });

        //zoom
        btnAnim5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim_rotar);
                imgView.startAnimation(anim_COMBINADO);
            }
        });
    }

    private void animacionesDER_IZQ(){

        if(es_der) {
            imgView.startAnimation(anim_der);
        }else{
            imgView.startAnimation(anim_izq);
        }
        es_der=!es_der;
    }

    private void animacionesARRIBA_ABAJO(){
        if(es_arriba) {
            imgView.startAnimation(anim_arriba);
        }else{
            imgView.startAnimation(anim_abajo);
        }
        es_arriba=!es_arriba;
    }

    private void animacionesAPARECER_DESAPARECER(){

        if(es_visible) {
            imgView.startAnimation(anim_desaparecer);
        }else{
            imgView.startAnimation(anim_aparecer);
        }
        es_visible=!es_visible;
    }

    private void animacionesIN_OUT(){
        if(es_zoomIN) {
            imgView.startAnimation(anim_zoomIN);
        }else{
            imgView.startAnimation(anim_zoomOut);
        }
        es_zoomIN=!es_zoomIN;
    }
}
