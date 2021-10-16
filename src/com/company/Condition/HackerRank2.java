package com.company.Condition;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class HackerRank2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int t = 2;

        for(int i=0;i<t;i++){

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            System.out.print("give me a number: ");
            String status = "";
            if (n >= 1  && n<= 100){
                String weird = n > 2 && n < 5 ? "Not Weird" : "Weird";
                if (n > 6 && n < 20) status = "Weird"; else status ="Not Weird";
                if (n > 20 ) status = "Not Weird"; else status = "Weird";
            }

            System.out.println(status);

        }
        scanner.close();
    }
}
