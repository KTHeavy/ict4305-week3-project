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
public class DateMain {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Start date of epoch time is (MM/DD/YYYY): " 
                + date.getMonth() + "/" + date.getDay() + "/" + date.getYear());
        System.out.println("--------------------------------------------------");
        System.out.println("Please use DateTest.java to conduct the unit test.");
        System.out.println("--------------------------------------------------");
    }

}
