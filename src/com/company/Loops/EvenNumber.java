package com.company.Loops;
import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        int a;
        Scanner ip = new Scanner(System.in);

        System.out.print("Sayı : ");
        a = ip.nextInt();
/*
        for (int i = 0; i <=a; i++){
            if (i % 2 ==0) System.out.println(i);
        }*/

        for (int i = 0; i <=a; i++){
            if (i % 3 ==0 || i % 4 ==0) System.out.println(i);
        }
    }
}
