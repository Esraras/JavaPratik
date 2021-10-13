package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, türkce, tarih, müzik;

        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz : ");
        türkce = input.nextInt();
        System.out.print("Tarih notunuzu giriniz : ");
        tarih = input.nextInt();
        System.out.print("Müzik notunuzu giriniz : ");
        müzik = input.nextInt();

        double result = (müzik+fizik+kimya+türkce+tarih+müzik)/6;
        System.out.println(result);
        String başarı = result > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(başarı);


    }
}
