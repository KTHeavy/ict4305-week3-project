/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4305group3.dateproject;

import static com.ict4305group3.dateproject.Date.isLeapYear;
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
    
    Date dateDefault = new Date();
    Date dateCopy = new Date(dateDefault);
    Date dateManual = new Date(29, 02, 2020);
    Date dateJulian = new Date(2470166);
    
    public DateTest() {
        
    }

    /**
     * Test of getDay method, of class Date.
     */
    @Test
    public void testGetDay() {
        
        int expectedDefaultDay = 1;
        int actualDefualtDay = dateDefault.getDay();
        int exptectedCopyDay = 1;
        int actualCopyDay = dateCopy.getDay();
        int expectedManualDay = 29;
        int actualManualDay = dateManual.getDay();
        int expectedJulianDay = 25;
        int actualJulianDay = dateJulian.getDay();
        
        assertEquals(expectedDefaultDay, actualDefualtDay);
        assertEquals(exptectedCopyDay, actualCopyDay);
        assertEquals(expectedManualDay, actualManualDay);
        assertEquals(expectedJulianDay, actualJulianDay);
    }

    /**
     * Test of getMonth method, of class Date.
     */
    @Test
    public void testGetMonth() {
        
        int expectedDefaultMonth = 1;
        int actualDefualtMonth = dateDefault.getMonth();
        int exptectedCopyMonth = 1;
        int actualCopyMonth = dateCopy.getMonth();
        int expectedManualMonth = 02;
        int actualManualMonth = dateManual.getMonth();
        int expectedJulianMonth = 12;
        int actualJulianMonth = dateJulian.getMonth();
        
        assertEquals(expectedDefaultMonth, actualDefualtMonth);
        assertEquals(exptectedCopyMonth, actualCopyMonth);
        assertEquals(expectedManualMonth, actualManualMonth);
        assertEquals(expectedJulianMonth, actualJulianMonth);
    }

    /**
     * Test of getYear method, of class Date.
     */
    @Test
    public void testGetYear() {
        int expectedDefaultYear = 1970;
        int actualDefualtYear = dateDefault.getYear();
        int exptectedCopyYear = 1970;
        int actualCopyYear = dateCopy.getYear();
        int expectedManualYear = 2020;
        int actualManualYear = dateManual.getYear();
        int expectedJulianYear = 2050;
        int actualJulianYear = dateJulian.getYear();
        
        assertEquals(expectedDefaultYear, actualDefualtYear);
        assertEquals(exptectedCopyYear, actualCopyYear);
        assertEquals(expectedManualYear, actualManualYear);
        assertEquals(expectedJulianYear, actualJulianYear);
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
