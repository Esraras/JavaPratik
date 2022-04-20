package com.company.Loops;
import javax.imageio.plugins.tiff.TIFFDirectory;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, password;
        int rigth = 3;
        int balance = 2000;
        int choice;

        while (rigth > 0){
            System.out.print("Kullanıcı adını giriniz : ");
            name = input.nextLine();
            System.out.print("Şifrenizi giriniz : ");
            password = input.nextLine();

            if (name.equals("esra") && password.equals("9876")){
                do {System.out.println("Merhaba, Aras Banka Hoşgeldiniz.\n"+
                        "1- Para çekme\n" +
                        "2- Para yatırma\n" +
                        "3- Bakiye sorgula\n" +
                        "4- Çıkış yap");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz ;");
                    choice = input.nextInt();
                    int many;
                    switch (choice){
                        case 1:
                            System.out.println("Çekmek istediğiniz miktarı girin : ");
                            many = input.nextInt();
                            if (many > balance) System.out.println("Bakiye yetersiz!");else balance -= many;
                            break;
                        case 2:
                            System.out.println("Yatırmak istediğin miktarı girin : ");
                            many = input.nextInt();
                            balance += many;
                            break;
                        case 3:
                            System.out.println("Mevcut bakiyeniz" + " " + balance);
                            break;
                    }
                }while (choice != 4);
                System.out.println("Güvenli bir şekilde çıkış yaptınız. İYİ GÜNLER DİLERİZ.");
                break;
            }else{
                rigth--;
                System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz.");
                if (rigth == 0) System.out.println("Hesabınız bloke olmuştur lütfen bankanızla iletişime geçiniz.");else
                    System.out.println("Kalan hakkınız : " + rigth);
            }
        }

    }
}
