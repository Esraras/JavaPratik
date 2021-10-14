package com.company.DataTypes;
import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        int r, a;
        double pi = 3.14, alan,cevre, da;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap Giriniz : ");
        r = input.nextInt();
        System.out.print("Merkez Açısı Giriniz : ");
        a = input.nextInt();

        alan = pi*r*r;
        cevre = 2*pi*r;

        //(𝜋 * (r*r) * 𝛼) / 360
        da = (pi*(r*r)*a) / 360;

        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi : " + cevre);
        System.out.println("Dilimin alanı : " + da);


    }
}
