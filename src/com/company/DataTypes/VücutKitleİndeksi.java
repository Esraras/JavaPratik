package com.company.DataTypes;
import java.util.Scanner;

public class VücutKitleİndeksi {
    public static void main(String[] args) {
        double kilo, boy ,indeks;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kilonuzu giriniz : ");
        kilo = inp.nextDouble();
        System.out.print("Boyunuzu giriniz : ");
        boy = inp.nextDouble();

        indeks = kilo / (boy*boy);
        System.out.println("Vücut kitle indeksiniz : " + indeks);

    }
}
