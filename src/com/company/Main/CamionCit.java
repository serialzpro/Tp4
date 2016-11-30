package com.company.Main;

/**
 * Created by axelm on 28/11/2016.
 */
public class CamionCit extends VehiculeCharge {

    public CamionCit (float charge) throws Throwable {
        this.setPoidVide(4000);
        this.setChargeMax(10000);

        if (charge == 0){
            this.setVitesseMax(130);
        }

        else if (charge <= 1000){
            this.setVitesseMax(110);
        }

        else if (charge <= 4000){
            this.setVitesseMax(90);
        }

        else if (charge > 4000 && charge < 10000){
            this.setVitesseMax(80);
        }

        else
        throw new Throwable("Erreur charge trop haute");

    }
}
