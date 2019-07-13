package com.corejava.controlstatements;

public class EvenDigitSum {
    public static void main(String[] args){
        int number = 2314;
        System.out.println("sum of even numbers in the given number is "+ getEvenDigitSum(number));

    }
    private static int getEvenDigitSum (int number){
        int evenNumbers = 0;
        if(number<0)
            return -1;
        while (number >0){
            int i= number%10;
            if (i%2==0){
                evenNumbers +=i;
            }
            number/=10;
        }
        return evenNumbers;

    }
}
