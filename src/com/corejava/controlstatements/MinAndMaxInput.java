package com.corejava.controlstatements;

import java.util.Arrays;
import java.util.Scanner;

public class MinAndMaxInput {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        int[] sum = new int[10];
        int count=0;
        while(true) {
            System.out.println("Enter Number");
            if(readInput.hasNextInt()){
                int num=readInput.nextInt();
                sum[count]=num;
                count++;
            }
            else{
                Arrays.sort(sum);
                System.out.println("Minimum number = "+ sum[0]);
                System.out.println("Maximum number = "+ sum[sum.length-1]);
                break;
            }
        }
        readInput.close();
     }
}