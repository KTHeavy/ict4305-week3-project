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
        
        var expectedDefaultDate = "01/01/1970";
        var actualDefualtDate = toString(dateDefault.day + "/" + dateDefault.month + "/" + dateDefault.year);
        var exptectedCopyDate = ("01/01/1970");
        var actualCopyDate = toString(dateCopy.day + "/" + dateCopy.month + "/" + dateCopy.year);
        var expectedManualDate = ("29/02/2020");
        var actualManualDate = toString(dateManual.day + "/" + dateManual.month + "/" + dateManual.year);
	int expectedJulianDate = 2470166;
	var actualJulianDate = dateJulian.mJulianNumber;
	Date dateInValid = new Date(39,13,2020);
	String inValidMessage = toString(dateInValid.day + "/" + dateInValid.month + "/" + dateInValid.year + " is not a valid Date. Please try again.");

        assertEquals(expectedDefaultDate, actualDefualtDate);
        assertEquals(exptectedCopyDate, actualCopyDate);
        assertEquals(expectedManualDate, actualManualDate);
	assertEquals(expectedJulianDate, actualJulianDate);
	assertEquals(dateInValid, inValidMessage);
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
        
        int expectedDefaultJulianNumber = 2440588;
	int actualDefaultJulianNumber = dateDefault.getJulianNumber();
	int exptectedCopyJulianNumber = 2440588;
	int actualCopyJulianNumber = dateCopy.getJulianNumber();
	int expectedManualJulianNumber = 2458909;
	int actualManualJulianNumber = dateManual.getJulianNumber();
	int expectedJulianNumber = 2470166;
	int actualJulianNumber = dateJulian.getJulianNumber();

	assertEquals(expectedDefaultJulianNumber, actualDefaultJulianNumber);
	assertEquals(exptectedCopyJulianNumber, actualCopyJulianNumber);
	assertEquals(expectedManualJulianNumber, actualManualJulianNumber);
	assertEquals(expectedJulianNumber, actualJulianNumber);
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
        
        int expectedDefaultLastDayofMonth = 31;
	int actualDefaultLastDayofMonth = Date.getLastDayOfMonth(dateDefault.getMonth(), dateDefault.getYear());
	int exptectedCopyLastDayofMonth = 31;
	int actualCopyLastDayofMonth = Date.getLastDayOfMonth(dateCopy.getMonth(), dateCopy.getYear());
	int expectedManualLastDayofMonth = 29;
	int actualManualLastDayofMonth = Date.getLastDayOfMonth(dateManual.getMonth(), dateManual.getYear());
	int expectedJulianLastDayOfMonth = 31;
	int actualJulianLastDayOfMonth = Date.getLastDayOfMonth(dateJulian.getMonth(), dateJulian.getMonth());

	assertEquals(expectedDefaultLastDayofMonth, actualDefaultLastDayofMonth);
	assertEquals(exptectedCopyLastDayofMonth, actualCopyLastDayofMonth);
	assertEquals(expectedManualLastDayofMonth, actualManualLastDayofMonth);
	assertEquals(expectedJulianLastDayOfMonth, actualJulianLastDayOfMonth);
    }
    private String toString(String string) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
