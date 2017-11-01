package com.example.pc_gaming.concesionario;

import java.io.Serializable;

/**
 * Created by PC_Gaming on 31/10/2017.
 */

public class Coche implements Serializable{

    private String marca, modelo, carburante, anno, estado, km, cv;
    private int id, puertas, marchas, imgLV, imgPerfil, imgFrontal, imgLogo;
    private boolean transferencia;

//CONSTRUCTOR SOBRECARGADO
    public Coche(int id, String marca, String modelo, String carburante, String anno, String estado, String km, int puertas, String cv, int marchas,
                 int imgLV, int imgPerfil, int imgFrontal, int imgLogo, boolean transferencia) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.carburante = carburante;
        this.anno = anno;
        this.estado = estado;
        this.km = km;
        this.puertas = puertas;
        this.cv = cv;
        this.marchas = marchas;
        this.transferencia = transferencia;
        this.imgLV = imgLV;
        this.imgLogo = imgLogo;
        this.imgPerfil = imgPerfil;
        this.imgFrontal = imgFrontal;
    }

//METODOS GETTER Y SETTER


    public void setId(int id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCarburante(String carburante) {
        this.carburante = carburante;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }

    public void setTransferencia(boolean transferencia) {
        this.transferencia = transferencia;
    }

    public void setImgLV(int imgLV) {
        this.imgLV = imgLV;
    }

    public void setImgPerfil(int imgPerfil) {
        this.imgPerfil = imgPerfil;
    }

    public void setImgFrontal(int imgFrontal) {
        this.imgFrontal = imgFrontal;
    }

    public void setImgLogo(int imgLogo) {
        this.imgLogo = imgLogo;
    }

    //-------------------------------------------------


    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCarburante() {
        return carburante;
    }

    public String getAnno() {
        return anno;
    }

    public String getEstado() {
        return estado;
    }

    public String getKm() {
        return km;
    }

    public int getPuertas() {
        return puertas;
    }

    public String getCv() {
        return cv;
    }

    public int getMarchas() {
        return marchas;
    }

    public boolean isTransferencia() {
        return transferencia;
    }

    public int getImgLV() {
        return imgLV;
    }

    public int getImgPerfil() {
        return imgPerfil;
    }

    public int getImgFrontal() {
        return imgFrontal;
    }

    public int getImgLogo() {
        return imgLogo;
    }
}
