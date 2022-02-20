package com.company.Loops;
import java.util.Scanner;

public class ÜslüSayı {
    public static void main(String[] args) {
        int n,k;
        Scanner ip = new Scanner(System.in);
        System.out.print("üssü alınacak sayı :");
        n = ip.nextInt();
        System.out.print("üs olan sayı : ");
        k = ip.nextInt();
        int result = 1;
        for (int i = 1; i <= k; i++){
            result *= n;
        }
        System.out.println("sonuç : " + result);
    }
}
