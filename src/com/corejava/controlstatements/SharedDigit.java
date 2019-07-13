package com.corejava.controlstatements;

public class SharedDigit {
    public static void main(String[] args){
        System.out.println(hasSharedDigit(55, 101));
    }
    private static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        } else {
            int num2= number2;
            while (number1 > 0) {
                int digit1 = number1 % 10;
                number2 = num2;
                while (number2 > 0) {
                    int digit2 = number2 % 10;
                    number2 /= 10;
                    if (digit1 == digit2) {
                        return true;
                    }
                }
                number1 /= 10;

            }
          return false;
        }

    }
}
