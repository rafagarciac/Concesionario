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
        arrayListCoches.add(new Coche(1, "BMW", "Z4", "Gasolina", "2001", "Semi-Nuevo", "154.000", 2, "233", 6, "http://www.bmw.es/", R.mipmap.bmw_lv, R.mipmap.bmw_perfil, R.mipmap.bmw_frontal, R.mipmap.bmw_logo, false));
        arrayListCoches.add(new Coche(2, "MERCEDES", "S-CLASS", "Diésel", "2013", "Nuevo", "0", 5, "200", 6, "https://www.mercedes-benz.es/", R.mipmap.mercedes_lv, R.mipmap.mercedes_perfil, R.mipmap.mercedes_frontal, R.mipmap.mercedes_logo, true));
        arrayListCoches.add(new Coche(3, "VOLKS", "SCIROCCO", "Diésel", "2010", "Semi-Nuevo", "40.000", 5, "175", 5, "https://www.volkswagen.es/", R.mipmap.volkswagen_lv, R.mipmap.volkswagen_perfil, R.mipmap.volkswagen_frontal, R.mipmap.volkswagen_logo, false));
        arrayListCoches.add(new Coche(4, "ALFA ROMEO", "4-C", "Gasolina", "2015", "Nuevo", "0", 3, "220", 6, "http://www.alfaromeo.es/", R.mipmap.alfaromeo_lv, R.mipmap.alfaromeo_perfil, R.mipmap.alfaromeo_frontal, R.mipmap.alfaromeo_logo, true ));
        arrayListCoches.add(new Coche(5, "MAZDA", "MX-4", "Diésel", "2013", "Nuevo", "0", 5, "200", 6, "https://www.mazda.es/", R.mipmap.mazda_lv, R.mipmap.mazda_perfil, R.mipmap.mazda_frontal, R.mipmap.mazda_logo, false ));
        arrayListCoches.add(new Coche(6, "KOENIGSEGG", "AGERA RS", "Gasolina", "2016", "Semi-Nuevo", "10.000", 4, "400", 7, "http://www.koenigsegg.com/", R.mipmap.koenigsegg_lv, R.mipmap.koenigsegg_perfil, R.mipmap.koenigsegg_frontal, R.mipmap.koenigsegg_logo, true));
        arrayListCoches.add(new Coche(7, "BUGATTI", "CHIRON", "Gasolina", "2017", "Nuevo", "0", 3, "600", 8, "https://www.bugatti.com/home/", R.mipmap.bugatti_lv, R.mipmap.bugatti_perfil, R.mipmap.bugatti_frontal, R.mipmap.bugatti_logo, true ));
        arrayListCoches.add(new Coche(8, "TESLA", "MODEL 3", "Eléctrico", "2017", "Nuevo", "0", 5, "450", 0, "https://www.tesla.com/es_ES/model3", R.mipmap.tesla_lv, R.mipmap.tesla_perfil, R.mipmap.tesla_frontal, R.mipmap.tesla_logo, false));
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
