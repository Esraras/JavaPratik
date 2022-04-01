package com.company.Loops;

import java.util.Scanner;

public class TotalBas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("sayı giriniz : ");
        int numberCounter = 0, counterValue = 1, result = 0;
        int a = input.nextInt();
        int tempA = a;

        while (tempA != 0){
            tempA /= 10;
            numberCounter++;
        }

        tempA = a;
        while (tempA != 0){
            counterValue = tempA % 10;
            tempA /= 10;
            result += counterValue;
        }
        System.out.println(result);
    }
}
