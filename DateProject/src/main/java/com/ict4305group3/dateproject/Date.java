/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4305group3.dateproject;

/**
 *
 * @author Ivan Piesh
 * @author Sara Sobczyk
 * @author Dawn Touriac
 * @author Kevin Taylor
 */
public class Date {
    
    // private attributes
    private int mJulianNumber;
    private int day;
    private int month;
    private int year;

    // constructors

    /**
     * Default constructor sets date to beginning epoch date January 01, 1970
     */
    
    public Date() {
        this( 1,1,1970 );
    };

    /**
     *
     * @param other
     */
    public Date( Date other ) {
        this(other.day, other.month, other.year);
    };
    
    /**
     *
     * @param julianNumber
     */
    public Date( int julianNumber ) {
        this(
            fromJulianNumber(julianNumber)[0], 
            fromJulianNumber(julianNumber)[1],
            fromJulianNumber(julianNumber)[2]
        );
    };
    
    /**
     *
     * @param day
     * @param month
     * @param year
     */
    public Date( int day, int month, int year ) {
        if(!isValidDate(day, month, year)) 
            throw new IllegalArgumentException(day + "/" + month + "/" + year 
                    + " is not a valid Date. Please try again.");
        this.day = day;
        this.month = month;
        this.year = year;
        this.mJulianNumber = this.toJulianNumber(day, month, year);
    };

    /**
     *
     * @return day
     */
    public int getDay(){
       return day;
    }; 

    /**
     *
     * @return month
     */
    public int getMonth(){
       return month;
    }; 

    /**
     *
     * @return year
     */
    public int getYear(){
       return year;
    };
    
    /**
     *
     * @return julian number
     */
    public int getJulianNumber(){
       return mJulianNumber;
    }; 

    /**
     *
     * @param year
     * @return boolean true/false
     */
    public static boolean isLeapYear( int year ){
        if (year % 400 == 0) return true;
        else if (year % 100 == 0) return false;
        else return year % 4 == 0;
    }; 

    /**
     *
     * @param month
     * @param year
     * @return int day
     *
     */
    public static int getLastDayOfMonth( int month, int year ){
        int lastDayOfMonth;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10:
            case 12:
                lastDayOfMonth = 31;
                break;
            case 2:
                if (isLeapYear(year)) {
                    lastDayOfMonth = 29;
                } else {
                    lastDayOfMonth = 28;
                }   break;
            default:
                lastDayOfMonth = 30;
                break;
        }
        return lastDayOfMonth;
    }; 

    private int toJulianNumber( int day, int month, int year ){
        int julianNumber = ( 1461 * (year + 4800 + (month - 14 ) / 12 ) ) / 4 
                + ( 367 * (month - 2 - 12 * ( (month - 14 ) / 12 ) ) ) / 12 
                - ( 3 * ( ( year + 4900 + ( month - 14 ) / 12 ) / 100 ) ) / 4 
                + day - 32075; 
        return julianNumber;
    }; 

    private static int[] fromJulianNumber( int mJulianNumber ){
        int l = mJulianNumber + 68569;
        int n = (4 * l) / 146097;
        l = l - (146097 * n + 3) / 4;
        int i = (4000 * (l + 1)) / 1461001;
        l = l - (1461 * i) / 4 + 31;
        int j = (80 * l) / 2447;
        int day = l - (2447 * j) / 80;
        l = j / 11;
        int month = j + 2 - (12 * l);
        int year = 100 * (n - 49) + i + l;

        int[] gregorian = {day, month, year};
        
        return gregorian;
        
    };
    
    private boolean isValidDate( int day, int month, int year ){
        int lastDay = getLastDayOfMonth(month, year);
        if(day < 1 || day > lastDay) return false;
        if(month < 1 || month > 31) return false;
        if(month == 2 && day == 29 && !isLeapYear(year)) return false;
        return true;
    };

}