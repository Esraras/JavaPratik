package com.company.Loops;
import java.util.Scanner;

public class Powered {
    public static void main(String[] args) {
        int e;
        Scanner s = new Scanner(System.in);
        System.out.print("sayı : ");
        e = s.nextInt();
        for (int i = 1; i <= e; i*=4){
            System.out.println(i);
        }
        for (int i = 1; i <= e; i*=5){
            System.out.println(i);
        }
    }
}
