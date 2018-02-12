package com.rsmithio.intro;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> lines = new ArrayList<String>();
        while(sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }

        int i = 1;
        for (String line: lines) {
            System.out.printf("%d %s\n", i++, line);
        }
    }
}