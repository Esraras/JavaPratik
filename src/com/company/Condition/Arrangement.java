package com.company.Condition;
import java.util.Scanner;

public class Arrangement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("1. sayı a : ");
        a = input.nextInt();
        System.out.print("2. sayı b : ");
        b = input.nextInt();
        System.out.print("3. sayı c : ");
        c = input.nextInt();

        /* -- Büyükten küçüğe sıralama
        if (a>b && a>c){
            if (b>c) System.out.println("a > b > c");else System.out.println("a > c > b");
        }else if (b>a && b>c){
            if (a>c) System.out.println("b > a > c");else System.out.println("b > c > a");
        }else if (c>a && c>b){
            if (a>b) System.out.println("c > a > b");else System.out.println("c > b > a");
        }else return;*/

        // Küçükten büyüğe sıralama

        if (a<b && a<c){
            if (b<c) System.out.println("a < b < c");else System.out.println("a < c < b");
        }else if (b<a && b<c){
            if (a<c) System.out.println("b < a < c");else System.out.println("b < c < a");
        }else if (c<a && c<b){
            if (a<b) System.out.println("c < a < b");else System.out.println("c < b < a");
        }


    }
}
