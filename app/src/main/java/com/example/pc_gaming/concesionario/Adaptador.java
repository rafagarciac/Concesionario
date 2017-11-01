package com.example.pc_gaming.concesionario;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by PC_Gaming on 31/10/2017.
 */

public class Adaptador extends BaseAdapter{

    Context context;
    List <Coche> listaCoches;

    public Adaptador(Context context, List <Coche> listaCoches) {
        this.context = context;
        this.listaCoches = listaCoches;
    }


    @Override
    public int getCount() {
        return listaCoches.size();
    }

    @Override
    public Object getItem(int i) {
        return listaCoches.get(i);
    }

    @Override
    public long getItemId(int i) {
        return listaCoches.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View vista = view;
        LayoutInflater inflate = LayoutInflater.from(context);
        vista = inflate.inflate(R.layout.coche_item, null);

        TextView tvMarca = vista.findViewById(R.id.tvMarca);
        TextView tvModelo = vista.findViewById(R.id.tvModelo);
        ImageView imgView = vista.findViewById(R.id.imgView);
        ImageView logoView = vista.findViewById(R.id.imgLogo);


        tvMarca.setText(listaCoches.get(i).getMarca().toString());
        tvModelo.setText(listaCoches.get(i).getModelo().toString());
        imgView.setImageResource(listaCoches.get(i).getImgLV());
        logoView.setImageResource(listaCoches.get(i).getImgLogo());

        return vista;

    }
}
