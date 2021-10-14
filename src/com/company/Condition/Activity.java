package com.company.Condition;
import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {
        int a;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz : ");
        a = input.nextInt();

        if (a<5)System.out.println("Bugün hava şartlarına göre en iyi etkinlik kayak. Kayak yapmaya ne dersiniz !");
        if (a>5 && a<15)System.out.println("Bugün sinema en iyi seçenek olabilir.");
        if (a>15 && a<25)System.out.println("Piknik yapmak için hava çok güzel.");
        if (a>25) System.out.println("Bugün hava tam yüzmeye gitmelik. Serinlemek için en iyi aktivite.");
    }
}