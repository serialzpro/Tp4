package com.company.Main;

/**
 * Created by axelm on 28/11/2016.
 */
public abstract class VehiculeCharge extends Vehicule {
    private float chargeMax;
    private float charge;

    public VehiculeCharge (){

    }

    public VehiculeCharge (float charge){
        this.charge= charge;
    }

    public float getCharge() {
        return charge;
    }

    public void setCharge(float charge) {
        this.charge = charge;
    }

    public float getChargeMax() {
        return chargeMax;
    }

    public void setChargeMax(float chargeMax) {
        this.chargeMax = chargeMax;
    }
}
