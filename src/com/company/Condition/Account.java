package com.company.Condition;
import java.util.Scanner;

public class Account {
    public static void main(String[] args) {

        String userName, password, newpass;
        int select;

        Scanner ip = new Scanner(System.in);

        System.out.print("Kullanıcı adı : ");
        userName = ip.nextLine();
        System.out.print("Parola : ");
        password = ip.nextLine();

        if (userName.equals("esra")){
            if (password.equals("123"))
                System.out.println("Giriş Başarılı");
            else
            {
                System.out.print(" Şifrenizi sıfırlamak ister misiniz ? \n Evet ise 1 Hayır ise 2 yazınız : ");
                select = ip.nextInt();
                ip.nextLine();
                switch (select){
                    case 1:
                        System.out.print("Yeni şifre : ");
                        newpass = ip.nextLine();
                        if (newpass.equals("123")){
                            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        }else System.out.println("Şifre oluşturuldu.");
                        break;
                    case 2:
                        break;
                }
            }
        }else System.out.println("Kullanıcı adınızı yanlış girdiniz.");
    }
}
