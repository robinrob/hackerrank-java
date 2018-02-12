package com.rsmithio.strings;

import java.io.*;
import java.util.*;


public class Solution4 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        boolean isPalin = new StringBuilder(A).reverse().toString().equals(A);
        System.out.println(isPalin ? "Yes" : "No");
    }
}
