package com.corejava.controlstatements;

public class ForChallenge {

    public static void main (String args[]) {
        int k =0;
        int j = 0;
       for (int i=1; i<1000;i++) {
               if (i % 3 == 0 && i % 5 == 0) {
                   k++;
                   j = j + i;
                   System.out.println("the number is + :: " + i);
               }
           if (k==5){
               System.out.println("sum of the number is :: " + j);
               break;
           }
       }



       }

    }


