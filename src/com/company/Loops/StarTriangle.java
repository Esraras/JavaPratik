package com.company.Loops;
import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i) - 1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int l = n - 1; l >= 1; l--){
            for (int h = 1; h <= (n - l); h++){
                System.out.print(" ");
            }
            for (int m = (2 * l)- 1; m >= 1; m--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
