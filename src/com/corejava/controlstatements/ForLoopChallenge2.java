package com.corejava.controlstatements;

public class ForLoopChallenge2 {
    public static void main(String args[]){
        System.out.println("sumOdd (1, 100) :: "+sumOdd (1, 100));
        System.out.println("sumOdd (-1, 100) :: "+sumOdd (-1, 100));
        System.out.println("sumOdd (100, 100) :: "+sumOdd (100, 100));
        System.out.println("sumOdd (13, 13) :: "+sumOdd (13, 13));
        System.out.println("sumOdd (100, -100) :: "+sumOdd (100, -100));
        System.out.println("sumOdd (100, 1000) :: "+sumOdd (100, 1000));

    }
    public static boolean isOdd(int number){
        if (number>0){
            if (number % 2 == 0){
                return false;
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }

    }
    public static int sumOdd(int start, int end){
        int sum=0 ;

        if (end>=start && start > 0 && end >0) {
            for (int i=start; i <= end; i++){
                int j= start++;
                if (isOdd(j)){
                   sum += j;

                }
            }

        }
        else {
            return -1;
        }
        return sum;
    }

}
