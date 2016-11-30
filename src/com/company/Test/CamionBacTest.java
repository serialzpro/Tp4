package com.company.Test;

import com.company.Main.CamionBac;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by axelm on 28/11/2016.
 */
public class CamionBacTest extends TestCase {
    public void setUp() throws Exception {


    }

    public void tearDown() throws Exception {

    }

    @Test
    public void testCamion0T() throws Throwable {
        CamionBac test = new CamionBac(0);
        assertEquals(130,test.getVitesseMax(),0);
    }

    @Test
    public void testCamion3T() throws Throwable {
        CamionBac test = new CamionBac(3000);
        assertEquals(110,test.getVitesseMax(),0);
    }

    @Test
    public void testCamion7T() throws Throwable{
        CamionBac test = new CamionBac(7000);
        assertEquals(90,test.getVitesseMax(),0);
    }

    @Test
    public void testCamion8T() throws Throwable{
        CamionBac test = new CamionBac(8000);
        assertEquals(80,test.getVitesseMax(),0);
    }

    @Test
    public void testCamion25T() throws Throwable{
        CamionBac test = new CamionBac(250000);

    }
}