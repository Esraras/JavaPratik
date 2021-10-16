package com.company.Condition;
import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month, day;
        String burc = "";

        System.out.print("Doğum gününüz : ");
        day = input.nextInt();
        System.out.print("Doğum ayınız : ");
        month = input.nextInt();

        if (month == 1){
            if (day >= 1 && day < 31){
                if (day < 22){
                    burc = "oğlak";
                }else{
                    burc = "kova";
                }
            }
        }else if (month == 2){
            if (day >= 1 && day < 28){
                if (day < 22){
                    burc = "kova";
                }else{
                    burc = "balık";
                }
            }
        }else if (month == 3){
            if (day >= 1 && day < 31){
                if (day < 21){
                    burc = "balık";
                }else{
                    burc = "koç";
                }
            }
        }else if (month == 4){
            if (day >= 1 && day < 30){
                if (day < 21){
                    burc = "koç";
                }else{
                    burc = "boğa";
                }
            }
        }else if (month == 5){
            if (day >= 1 && day < 31){
                if (day < 21){
                    burc = "boğa";
                }else{
                    burc = "ikizler";
                }
            }
        }else if (month == 6){
            if (day >= 1 && day < 30){
                if (day < 23){
                    burc = "ikizler";
                }else{
                    burc = "yengeç";
                }
            }
        }else if (month == 7){
            if (day >= 1 && day < 31){
                if (day < 23){
                    burc = "yengeç";
                }else{
                    burc = "aslan";
                }
            }
        }else if (month == 8){
            if (day >= 1 && day < 30){
                if (day < 23){
                    burc = "aslan";
                }else{
                    burc = "başak";
                }
            }
        }else if (month == 9){
            if (day >= 1 && day < 31){
                if (day < 23){
                    burc = "başak";
                }else{
                    burc = "terazi";
                }
            }
        }else if (month == 10){
            if (day >= 1 && day < 30){
                if (day < 23){
                    burc = "terazi";
                }else{
                    burc = "akrep";
                }
            }
        }else if (month == 11){
            if (day >= 1 && day < 31){
                if (day < 23){
                    burc = "akrep";
                }else{
                    burc = "yay";
                }
            }
        }else if (month == 12){
            if (day >= 1 && day < 30){
                if (day < 22){
                    burc = "yay";
                }else{
                    burc = "oğlak";
                }
            }
        }

        System.out.println("Burcunuz : "+ burc);





    }
}
