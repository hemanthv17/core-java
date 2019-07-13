package com.corejava.controlstatements;

public class WhileAndDoWhile {

    public static void main(String[] args) {
        int startNumber = 6;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while (startNumber <= finishNumber) {
            if (isEvenNumber(startNumber)) {
                evenNumbersFound++;
                System.out.println(startNumber + " is an even number");
            }
            if (evenNumbersFound>=5){
                break;
            }
            startNumber++;
        }
        System.out.println("Total number of even numbers are : " + evenNumbersFound);


    }

    private static boolean isEvenNumber(int number) {
        return (number % 2 == 0);
    }
}
