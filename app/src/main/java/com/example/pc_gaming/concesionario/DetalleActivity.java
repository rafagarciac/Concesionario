package com.example.pc_gaming.concesionario;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        Coche coche = (Coche) getIntent().getExtras().getSerializable("objeto");

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


    }
}
