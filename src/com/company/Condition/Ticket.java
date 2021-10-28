package com.company.Condition;
import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        double km, price, discountedPrice = 0;
        int year,tripType;

        Scanner ip = new Scanner(System.in);

        System.out.print("Mesafe (km) : ");
        km = ip.nextDouble();
        price = km * 0.10 ;

        System.out.print("Yaşınız : ");
        year = ip.nextInt();

        if (year < 12) discountedPrice = price - (price * 0.50);
        else if (year > 12 && year < 24) discountedPrice = price - (price * 0.10);
        else if (year > 65) discountedPrice = price - (price * 0.30);

        System.out.print("Yolculuk tipi seçiniz  (1 - Tek yön, 2 - Gidiş dönüş) : ");
        tripType = ip.nextInt();

        if (tripType == 1 ) System.out.println(discountedPrice);
        else if (tripType == 2) System.out.println( 2 * (discountedPrice = price - (price * 0.20)));
        else System.out.println("Hatalı Veri Girdiniz !");

    }
}
