package com.corejava.controlstatements;

public class LastDigitChecker {
    public static void main (String[] args) {
        System.out.println(hasSameLastDigit(43, 555, 434));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
     if (isValid(number1) && isValid(number2) && isValid(number3)){
        number1 %=10;
        number2 %=10;
        number3 %=10;
        return (number1 == number2 || number1 == number3 || number2 == number3) ? true : false;

        }else {
         return false;
        }
    }

    public static boolean isValid(int number){
        return (number>=10 && number <=1000) ? true : false;
    }

}
