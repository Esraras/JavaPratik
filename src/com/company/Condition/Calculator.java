package com.company.Condition;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int s1, s2, select;
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz : ");
        s1 = input.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        s2 = input.nextInt();

        System.out.println("Birini seçiniz : \n 1 - Toplama \n 2 - Çıkarma \n 3 - Çarpma \n 4 - Bölme");
        select = input.nextInt();

        switch (select){
            case 1 :
                System.out.println(" Sonuç : " + (s1 + s2));
                break;
            case 2 :
                System.out.println(" Sonuç : " + (s1 - s2));
                break;
            case 3 :
                System.out.println(" Sonuç : " + (s1 * s2));
                break;
            case 4 :
                System.out.println(" Sonuç : " + (s1 / s2));
                break;
        }
    }
}
