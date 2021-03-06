package com.rsmithio.intro;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;




public class Solution8 {

    private static String getDay(String day, String month, String year) {
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