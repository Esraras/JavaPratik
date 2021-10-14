package com.company.DataTypes;
import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {

        int a, b;
        double c, cevre, alan;

        Scanner ip = new Scanner(System.in);
        System.out.print("1. Kenar : ");
        a = ip.nextInt();
        System.out.print("2. Kenar : ");
        b = ip.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        cevre = ((a+b+c)/2);
        alan = Math.sqrt(cevre * (cevre - a) * (cevre - b) * (cevre - c));

        System.out.println("Üçgenin Hipotenüsü : " + c);
        System.out.println("Üçgenin çevresi : " + cevre);
        System.out.println("Üçgenin alanı : " + alan);

    }
}
