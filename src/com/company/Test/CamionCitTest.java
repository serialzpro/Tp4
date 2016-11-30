package com.company.Test;

import com.company.Main.CamionCit;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by axelm on 28/11/2016.
 */
public class CamionCitTest extends TestCase {
    @Override
    public void setUp() throws Exception {

    }
    @Override
    public void tearDown() throws Exception {

    }

    @Test
    public void testCamion0T() throws Throwable {
        CamionCit test = new CamionCit(0);
        assertEquals(130,test.getVitesseMax(),0);
    }

    @Test
    public void testCamion1T() throws Throwable {
        CamionCit test = new CamionCit(1000);
        assertEquals(110,test.getVitesseMax(),0);
    }

    @Test
    public void testCamion4T() throws Throwable {
        CamionCit test = new CamionCit(4000);
        assertEquals(90,test.getVitesseMax(),0);
    }

    @Test
    public void testCamion8T () throws  Throwable{
        CamionCit test = new CamionCit(8000);
        assertEquals(80,test.getVitesseMax(),0);
    }
}