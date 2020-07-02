/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4305group3.dateproject;

import static com.ict4305group3.dateproject.Date.isLeapYear;
import java.text.SimpleDateFormat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 
 * @author Ivan Piesh
 * @author Sara Sobczyk
 * @author Dawn Touriac
 * @author Kevin Taylor
 */
public class DateTest {

    private static Object getYear(DateTest d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public DateTest() {
        
    }

    /**
     * Test of getDay method, of class Date.
     */
    @Test
    public void testGetDay() {
    
    }

    /**
     * Test of getMonth method, of class Date.
     */
    @Test
    public void testGetMonth() {
        
    }

    /**
     * Test of getYear method, of class Date.
     */
    @Test
    public void testGetYear() {
        
    }

    /**
     * Test of getJulianNumber method, of class Date.
     */
    @Test
    public void testGetJulianNumber() {
        
    }

    /**
     * Test of isLeapYear method, of class Date.
     */
    @Test
    public void testIsLeapYear() {
        assertFalse(isLeapYear(2010));
        assertTrue(isLeapYear(2012));
        assertFalse(isLeapYear(2014));
        assertTrue(isLeapYear(2016));
        assertFalse(isLeapYear(2018));
        assertTrue(isLeapYear(2020));
    }

    /**
     * Test of getLastDayOfMonth method, of class Date.
     */
    @Test
    public void testGetLastDayOfMonth() {
        
    }
    
}
