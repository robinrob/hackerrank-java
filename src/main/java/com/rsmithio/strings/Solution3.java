package com.rsmithio.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Solution3 {

    public static String getSmallestAndLargest(String s, int k) {
        ArrayList<String> substrs = new ArrayList<String>();
        int start;
        int end;
        for (int i = k; i <= s.length(); ++i) {
            start = i - k;
            end = i;
            substrs.add(s.substring(start, end));
        }
        Collections.sort(substrs);
//        System.out.println("strs: " + substrs);

        return substrs.get(0) + "\n" + substrs.get(substrs.size() - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
