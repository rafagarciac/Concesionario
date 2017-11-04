package com.example.pc_gaming.concesionario;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class DetalleActivity extends AppCompatActivity {

    ImageView imgPerfil, imgFrontal;
    TextView anno, kilometros, carburante, caballos, marchas, puertas;
    ImageButton btnImgLogo;
    Switch swTransferencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);


        //ASOCIACION COMPONENTES
        imgPerfil = (ImageView) findViewById(R.id.imgPerfil);
        imgFrontal = (ImageView) findViewById(R.id.imgFrontal);
        anno = (TextView) findViewById(R.id.anno);
        kilometros = (TextView) findViewById(R.id.kilometros);
        carburante = (TextView) findViewById(R.id.carburante);
        puertas = (TextView) findViewById(R.id.puertas);
        caballos = (TextView) findViewById(R.id.caballos);
        marchas = (TextView) findViewById(R.id.marchas);
        btnImgLogo = (ImageButton) findViewById(R.id.btnIWeb);
        swTransferencia= (Switch) findViewById(R.id.swTransferencia);

        //CREO UN OBJETO DE COCHE Y RECOJO LO QUE ME MANDO EL MAIN_ACTIVITY
        final Coche coche = (Coche) getIntent().getExtras().getSerializable("objeto");

        //ASIGNO EL TEXTO A CADA COMPONENTE
        imgPerfil.setImageResource(coche.getImgPerfil());
        imgFrontal.setImageResource(coche.getImgFrontal());
        anno.setText(coche.getAnno());
        kilometros.setText(coche.getKm());
        carburante.setText(String.valueOf(coche.getCarburante()));
        puertas.setText(String.valueOf(coche.getPuertas()));
        caballos.setText(coche.getCv());
        marchas.setText(String.valueOf(coche.getMarchas()));
        swTransferencia.setChecked(coche.isTransferencia());

        //CREO UN BITMAP Y LUEGO SE LO PASO AL BOTON
        Bitmap btmLogo = BitmapFactory.decodeResource(getResources(), coche.getImgLogo());
        btnImgLogo.setImageBitmap(btmLogo);

        //AÑADO UNA URL A LA WEB Y SE LO METO EN UNA ACCION DE BTNIMGLOGO
        btnImgLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Creo un objeto de tipo Uri --> Identificador de Recursos Uniforme
                Uri urlMarca = Uri.parse(coche.getUrl());
                Intent intent = new Intent(Intent.ACTION_VIEW, urlMarca);
                startActivity(intent);
            }
        });


    }
}
