package com.company.Loops;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n, r, a;
        int total = 1, total1 = 1, con = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("sayı 1 :");
        n = s.nextInt();
        System.out.print("sayı 2 :");
        r = s.nextInt();
        for (int i = 1; i <= n; i++){
            total = total * i;
        }
        for (int i = 1; i <= r; i++){
            total1 = total1 * i;
        }
        a = n-r;
        for (int i = 1; i <= a; i++){
            a = a * i;
        }
        // C(n,r) = n! / (r! * (n-r)!)
        con = total / (total1 * a);
        System.out.println(con);










        /*int f, total = 1;
        Scanner s = new Scanner(System.in);
        f = s.nextInt();

        for (int i = 1; i <= f; i++){
            total = total * i;

        }
        System.out.println(total);*/
    }
}
