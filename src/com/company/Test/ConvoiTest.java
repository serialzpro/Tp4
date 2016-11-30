package com.company.Test;

import com.company.Main.CamionCit;
import com.company.Main.Convoi;
import com.company.Main.VoitureSP;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by axelm on 28/11/2016.
 */
public class ConvoiTest extends TestCase {
    private CamionCit testCam;
    private CamionCit testCam2;
    private VoitureSP voitureSP;
    private Convoi convoi;
    public void setUp() throws Exception {


    }

    public void tearDown() throws Exception {

    }

    @Test
    public void testGetVitesseMax() throws Throwable {
        testCam = new CamionCit(4000);
        testCam2 = new CamionCit(8000);
        voitureSP = new VoitureSP();
        convoi = new Convoi();
        convoi.addVehicule(testCam);
        convoi.addVehicule(testCam2);
        convoi.addVehicule(voitureSP);
        assertEquals(50,convoi.getVitesseMax(),0);
    }

}