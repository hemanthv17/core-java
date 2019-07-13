package com.corejava.controlstatements;

public class FirstLastDigitSum {
    public static void main (String[] args) {
        int number= 1234;
        System.out.println("sum of fist and last numbers of "+ number + " is "+ sumFirstAndLastDigit(number));
    }

    private static int sumFirstAndLastDigit(int number){
        int firstDigit= 0;
        int lastDigit;
        if (number>=0){
            lastDigit =number%10;
            while (number!=0){
                firstDigit = number%10;
                number /=10;
            }
        }else {
            return -1;
        }
         return firstDigit+lastDigit;
    }
}
