package com.company.Main;

import java.util.ArrayList;

/**
 * Created by axelm on 28/11/2016.
 */
public class Convoi {
    private ArrayList<Vehicule> listeVehicule;

    public Convoi (){
        listeVehicule = new ArrayList<Vehicule>();
    }

    public float getVitesseMax (){
        float vitesseMax = 50000;
         for (int i=0; i<listeVehicule.size();i++){
             if (vitesseMax > listeVehicule.get(i).getVitesseMax()){
                 vitesseMax = listeVehicule.get(i).getVitesseMax();
             }
         }
        return vitesseMax;
    }

    public void addVehicule(Vehicule vehicule)
    {
        listeVehicule.add(vehicule);
    }

    public void deleteVehicule (int index) {
        listeVehicule.remove(index-1);
    }

    public ArrayList<Vehicule> getListeVehicule() {
        return listeVehicule;
    }

}
