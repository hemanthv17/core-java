package com.corejava.controlstatements;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args){
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        int count = 1;
        long average = 0;
        Scanner readInput = new Scanner(System.in);
        System.out.println("Enter a number");
        while(true) {
            if (readInput.hasNextInt()) {
                int num = readInput.nextInt();
                sum += num;
                count++;
            }
            else {
                count--;
                average = Math.round(sum / (double)count);
                System.out.println("SUM = "+sum +" AVG = "+ average);
                readInput.close();
                break;
            }
            readInput.nextLine();

        }
    }

    }

