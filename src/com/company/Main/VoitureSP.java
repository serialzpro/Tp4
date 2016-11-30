package com.company.Main;

/**
 * Created by axelm on 28/11/2016.
 * "Voiture sans permis"
 */
public class VoitureSP extends Vehicule {

    public VoitureSP (){
        this.setVitesseMax(50);
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public int getHorsePower() {
        return 0;
    }
}
