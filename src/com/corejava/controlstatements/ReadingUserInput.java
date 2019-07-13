package com.corejava.controlstatements;

import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        int iterations;
        System.out.println("do you want to enter the number of numbers you want to add ? Type yes else default will be 10");
        if(readInput.hasNext()){
            if(readInput.next().equals("yes")) {
                System.out.println("Enter how many number you want to add :: ");
                readInput.nextLine();
               while(true) {

                   if (readInput.hasNextInt()) {
                       iterations = readInput.nextInt();
                       if(iterations>0) break;
                   } else {
                       System.out.println("Invalid number");
                       System.out.println("Please enter a valid number ::");
                       readInput = new Scanner(System.in);
                   }
               }
                System.out.println("Sum of the " + iterations + " numbers entered :: " + readUserInput(iterations));
            } else {
                iterations = 10;
                System.out.println("you can add 10 numbers");
                System.out.println("Sum of the " + iterations + " numbers entered :: " + readUserInput(iterations));


            }
            }


    }

    public static int readUserInput(int iterations) {
        int sum = 0;
        int count = 1;
        Scanner readInput = new Scanner(System.in);

        while (true) {

            if (count > iterations) break;
            System.out.println("Enter number #" + count);
            if (readInput.hasNextInt()) {
                count++;
                int num = readInput.nextInt();
                sum += num;
            } else {
                System.out.println("Invalid number");
                readInput =  new Scanner(System.in);
            }
        }
        readInput.close();

        return sum;
    }


}




