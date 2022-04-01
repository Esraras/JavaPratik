package com.company.Loops;

public class Armstrong2 {
    public static void main(String[] args) {

        int numberCounter = 0, counterValue = 1, result = 0;
        int countPow;

            for (int i = 100; i <= 999; i++){
                int tempI = i;
                numberCounter = 0;
                while (tempI != 0){
                    tempI /= 10;
                    numberCounter++;
                }
                tempI = i;
                result = 0;
                while (tempI != 0){
                    counterValue = tempI % 10;
                    countPow = 1;
                    for (int j = 1; j <= numberCounter; j++){
                        countPow *= counterValue;
                    }
                    result += countPow;
                    tempI /= 10;
                }
                System.out.println(result);
                //if (result == i) System.out.println(i);else System.out.println("armstrong sayı değil");
            }
    }
}
