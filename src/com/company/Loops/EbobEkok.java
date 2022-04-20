package com.company.Loops;
import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("birinci sayı : ");
        a =input.nextInt();
        System.out.print("ikinci sayı : ");
        b = input.nextInt();

        // ebob

       /* for (int i = 1; i <= a; i++){
            int result = a % i;
            if (result == 0) System.out.println(i);
        }*/
        int i = 1;
        int ebob = 1;
        while (i <= a){
            if ((a % i == 0)  && (b % i == 0))ebob = i;
            i++;
        }
        System.out.println("EBOB : " + " " + ebob);

        // ekok
        int ekok = (a*b) / ebob;
        System.out.println("EKOK : " +" "+ ekok);





    }
}
