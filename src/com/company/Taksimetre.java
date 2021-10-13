package com.company;
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double km, kmTutarı = 2.22, ücret, startPrice =10;

        Scanner input = new Scanner(System.in);

        System.out.println("Km giriniz : ");
        km = input.nextDouble();

        ücret = startPrice+(km * kmTutarı);
        ücret = (ücret < 20) ? 20 : ücret;

        /*if (ücret < 20){
            ücret = 20;
        }*/

        System.out.println("Taksimetre tutarı : " + ücret);

    }
}
