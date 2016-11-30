package com.company.Main;

import junit.framework.TestCase;

/**
 * Created by axelm on 30/11/2016.
 */
public class UtilitaireTest extends TestCase {

    private Bus busTest;
    private Convoi convoiTest;
    private CamionCit camionCitTest;

    public void testConsommation() throws Throwable {
        convoiTest = new Convoi();
        busTest = new Bus();
        camionCitTest = new CamionCit(4000);
        convoiTest.addVehicule(busTest);
        convoiTest.addVehicule(camionCitTest);
        assertEquals(270,(int)Utilitaire.consommation(busTest,(int)convoiTest.getVitesseMax()));

    }

}