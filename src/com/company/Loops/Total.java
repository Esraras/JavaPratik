package com.company.Loops;
import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        int a;
        int total = 0;
        Scanner s = new Scanner(System.in);
/*
        do {
            System.out.print("Sayı :");
            a = s.nextInt();
            if (a % 2 == 1) {
                total +=a;
            }
        }while (a > 0);

        System.out.println("Toplam : " + total); */

        do {
            System.out.print("Sayı :");
            a = s.nextInt();
            if (a % 2 == 0 || a % 4 == 0) {
                total +=a;
            }
        }while (a % 2 == 0);

        System.out.println("Toplam : " + total);


    }

}
