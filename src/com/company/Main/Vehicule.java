package com.company.Main;

/**
 * Created by axelm on 28/11/2016.
 */
public abstract class Vehicule  {

    private String immatriculation;
    private float poidVide;
    private float vitesseMax;

    public Vehicule (){

    }

    public Vehicule (float poidVide,float vitesseMax){
        this.poidVide = poidVide;
        this.vitesseMax = vitesseMax;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public float getPoidVide() {
        return poidVide;
    }

    public void setPoidVide(float poidVide) {
        this.poidVide = poidVide;
    }

    public float getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(float vitesseMax) {
        this.vitesseMax = vitesseMax;
    }
}
