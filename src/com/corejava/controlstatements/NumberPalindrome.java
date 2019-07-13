package com.corejava.controlstatements;

public class NumberPalindrome {
    public static void main(String[] args) {
        int number = 52425;
        if (isPalindrome(number)) {
            System.out.println(number+ " is palindrome");
        } else {
            System.out.println(number +" is not palindrome");
        }

    }

    private static boolean isPalindrome(int number) {
      int num = number;
      int reverse = 0;
      while (number !=0){
          int lastDigit = number%10;
          reverse = reverse * 10 + lastDigit;
          number /=10;
      }
      return (num==reverse);
    }
}
