package com.example.pc_gaming.concesionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvCoches;
    ArrayList <Coche> arrayListCoches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //INSTANCIACION Y ASIGNACION DE VARIABLES Y COMPONENTES
        lvCoches = (ListView) findViewById(R.id.listviewCoches);
        arrayListCoches = new ArrayList<Coche>();

        //CREACION DE OBJETOS
        arrayListCoches.add(new Coche(1, "BMW", "Z4", "Gasolina", "2001", "Semi-Nuevo", "154.000", 2, "233", 6, R.drawable.coche_z4_lv, R.drawable.coche_z4_perfil, R.drawable.coche_z4_frontal, R.drawable.bmw_logo,  false));
        arrayListCoches.add(new Coche(2, "MERCEDES", "S-CLASS", "Diésel", "2013", "Nuevo", "0", 5, "200", 6, R.drawable.coche_mercedes_lv, R.drawable.coche_mercedes_perfil, R.drawable.coche_mercedes_frontal, R.drawable.mercedes_logo,  true));
        arrayListCoches.add(new Coche(3, "VOLKS", "SCIROCCO", "Diésel", "2010", "Semi-Nuevo", "40.000", 5, "175", 5, R.drawable.coche_volkswagen_lv, R.drawable.coche_volkswagen_perfil, R.drawable.coche_volkswagen_frontal, R.drawable.volkswagen_logo,  false));

        //ADAPTADOR
        Adaptador myAdaptor = new Adaptador(getApplicationContext(), arrayListCoches);
        lvCoches.setAdapter(myAdaptor);

        lvCoches.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //RECOJO UN COCHE DE LA POSICION DE LA LIST VIEW
                Coche coche = (Coche) adapterView.getItemAtPosition(i);

                //MANDO EL OBJETO SELECCIONADO EN EL LISTVIEW A MI NUEVO ACTIVITY DETALLE
                Intent e = new Intent(getApplicationContext(), DetalleActivity.class);
                e.putExtra("objeto", (Serializable) coche);
                startActivity(e);

            }
        });
    }
}
