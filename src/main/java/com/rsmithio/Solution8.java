package com.rsmithio;

import java.time.DayOfWeek;
import java.util.Scanner;

import java.time.LocalDate;


public class Solution8 {

    private static String getDay(String day, String month, String year) {
        /*
        * Write your code here.
        */

        DayOfWeek dayOfWeek = LocalDate.of(Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day)).getDayOfWeek();
        return dayOfWeek.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Bollocks
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }
}