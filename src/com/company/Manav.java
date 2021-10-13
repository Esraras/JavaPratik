package com.company;
import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double ka = 2.14 , ke = 3.67 , kd = 1.11, km = 0.95, kp = 5.00, a, e, d, m, p;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilo armut : ");
        a = input.nextDouble();
        System.out.print("Kaç kilo elma : ");
        e = input.nextDouble();
        System.out.print("Kaç kilo domates : ");
        d = input.nextDouble();
        System.out.print("Kaç kilo muz : ");
        m = input.nextDouble();
        System.out.print("Kaç kilo patlıcan : ");
        p = input.nextDouble();

        System.out.println("Armut" + " " + a * ka + " " + "lira.");
        System.out.println("Elma" + " " + e * ke + " " + "lira.");
        System.out.println("Domates" + " " + d * kd + " " + "lira.");
        System.out.println("Muz" + " " + m * km + " " +"lira.");
        System.out.println("Patlıcan" + " " + p * kp + " " + "lira.");
    }
}
