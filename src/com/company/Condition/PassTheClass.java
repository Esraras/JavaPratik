package com.company.Condition;
import java.util.Scanner;

public class PassTheClass {
    public static void main(String[] args) {

        int mat, fizik, türkce, kimya, müzik;
        double avarage;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notu : ");
        mat = input.nextInt();
        System.out.print("Fizik notu : ");
        fizik = input.nextInt();
        System.out.print("Türkçe notu : ");
        türkce = input.nextInt();
        System.out.print("Kimya notu : ");
        kimya = input.nextInt();
        System.out.print("Müzik notu : ");
        müzik = input.nextInt();



        if (mat < 0 || mat >100) {
            avarage = (müzik+fizik+türkce+kimya)/ 4;
        } else  if (fizik < 0 || fizik >100) {
            avarage = (müzik+mat+türkce+kimya)/ 4;
        }else if (türkce < 0 || türkce >100){
            avarage = (müzik+fizik+mat+kimya)/ 4;
        }else if (kimya < 0 || kimya >100){
            avarage = (müzik+fizik+türkce+mat)/ 4;
        }else if (müzik < 0 || müzik >100) {
            avarage = (mat+fizik+türkce+kimya)/ 4;
        } else avarage = (mat+müzik+fizik+türkce+kimya) / 5;

        if (avarage >= 55)System.out.println("Geçtiniz !"); else System.out.println("Kaldınız !");
        System.out.println("Not ortamananız : " + avarage);

    }
}
