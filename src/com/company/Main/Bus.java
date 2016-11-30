package com.company.Main;

/**
 * Created by axelm on 28/11/2016.
 */
public class Bus extends Vehicule {

    public Bus (){
        super (4000,150);
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
