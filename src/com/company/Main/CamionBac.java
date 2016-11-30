package com.company.Main;

/**
 * Created by axelm on 28/11/2016.
 */
public class CamionBac extends VehiculeCharge {


    public CamionBac (float charge) throws Throwable {
        this.setChargeMax(20000);
        this.setPoidVide(4000);
        this.setCharge(charge);

        if (charge == 0)
            this.setVitesseMax(130);

        else if (charge <= 3000)
            this.setVitesseMax(110);


        else if (charge <= 7000)
            this.setVitesseMax(90);


        else if (charge > 7000 && charge < 20000)
            this.setVitesseMax(80);

        else
            throw new Throwable("Erreur charge trop haute");
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
