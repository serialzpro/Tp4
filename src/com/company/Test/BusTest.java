package com.company.Test;

import com.company.Main.Bus;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by axelm on 28/11/2016.
 */
public class BusTest extends TestCase {
    public void setUp() throws Exception {


    }

    public void tearDown() throws Exception {

    }

    @Test
    public void testGetBus() throws Exception {
        Bus test = new Bus();
        assertEquals(4000,test.getPoidVide(),0);
        assertEquals(150,test.getVitesseMax(),0);
    }



}