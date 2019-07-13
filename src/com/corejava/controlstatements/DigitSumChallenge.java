package com.corejava.controlstatements;

public class DigitSumChallenge {
    public static void main(String[] args) {

        System.out.println("sum of the digits of number 123 is "  +sumDigits(123));
        System.out.println("sum of the digits of number 345 is "+sumDigits(4));
        System.out.println("sum of the digits of number 343243 is "+sumDigits(343243));
        System.out.println("sum of the digits of number 8895 is "+sumDigits(9));
        System.out.println("sum of the digits of number  8283 is "+sumDigits(8283));

    }


    private static int sumDigits(int number) {
        int sum = 0;

        if (number < 10) {
            return -1;
        }
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
           number /=10;
        }
        return sum;
    }

}
