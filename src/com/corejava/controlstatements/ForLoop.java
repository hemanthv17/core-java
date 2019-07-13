package com.corejava.controlstatements;

public class ForLoop {
    public static void main (String[] args) {
int count= 1;
        int j=0;
        int i;
        for(i=2;i<100;i++){

            if ( isPrime(i)) {
                j= count++;
                System.out.println(i + " is a prime number ");
                if(j==15){
                    break;
                }
            }
        }
        System.out.println("Number of prime numbers between 2 and "+ i +" are :: "+j);

    }
    public static double calculation(double amount, double interestRate){
        return (amount*(interestRate/100));
    }

    public static boolean isPrime(int n){
        if(n==1) {
            return false;
        }
        for (int i=2; i <= n/2 ; i++){
            if (n%i ==0){
                return false;
            }
        }
        return true;
    }
}
