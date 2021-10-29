package com.company.Condition;
import java.util.Scanner;

public class WasteYear {
    public static void main(String[] args) {
        int year,result,b,result2,b2,b3,result3;

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz :");
        year = input.nextInt();

        b = year / 4;
        result = year - (4 * b);
        b2 = year / 100;
        result2 = year - ( 100 * b2 );
        b3 = year / 400;
        result3 = year - ( 400 * b3 );

        if (result2 != 0){
            if (result == 0)System.out.println(year + " " +"artık yıldır !"); else System.out.println(year + " " + "artık yıl değildir !");
        }else{
            if (result3 == 0) System.out.println(year + " " +"artık yıldır !"); else System.out.println(year + " " + "artık yıl değildir !");
        }
    }
}
