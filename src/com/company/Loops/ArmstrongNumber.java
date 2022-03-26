package com.company.Loops;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("sayı giriniz : ");
        int numberCounter = 0, counterValue = 1, result = 0;
        int a = input.nextInt();
        int tempA = a;
        int countPow;

        while (tempA != 0){
            tempA /= 10;
            numberCounter++;
        }

        tempA = a;
        while (tempA != 0){
            counterValue = tempA % 10;
            countPow = 1;
            for (int i = 1; i <= numberCounter; i++){
                countPow *= counterValue;
            }
            result += countPow;
            tempA /= 10;
        }
        if (result == a) System.out.println(a + " " + "sayısı bir Armstrong sayıdır.");else System.out.println(a + " " + "sayısı bir Armstrong sayı değildir.");





/*
        int sub = 2, sup = 3;
        result = 1;
        for (int i = 1; i <= 3; i++){
            result *= sub;
        }
        System.out.println(result);
*/
    }
}
