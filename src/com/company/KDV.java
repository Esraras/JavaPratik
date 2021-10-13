package com.company;
import java.util.Scanner;
public class KDV {

    public static void main(String[] args) {
        double tutar, kdvOran = 0.18;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ücret : ");
        tutar = inp.nextInt();
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;


        if (tutar < 1000){
            kdvOran = 0.18;
        }else if (tutar > 1000)
            kdvOran = 0.8;
        else return;
        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı " + kdvOran);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutar : " + kdvliTutar);

    }
}
