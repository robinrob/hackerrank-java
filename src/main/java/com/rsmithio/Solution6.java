package com.rsmithio;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution6 {

    private static Scanner sc = new Scanner(System.in);

    private static int B = sc.nextInt();

    private static int H = sc.nextInt();

    private static boolean flag = checkVars();

    private static boolean checkVars() {
        if (B > 0 && H > 0) {
            return true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            return false;
        }
    }


    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}