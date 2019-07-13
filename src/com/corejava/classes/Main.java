package com.corejava.classes;

public class Main {
    public static void main(String[] args) {
        //For class Car
        Car porsche = new Car();
        Car audi = new Car();
        porsche.setModel("718 BOXTER");
        System.out.println("Model is "+ porsche.getModel());

        //For class SimpleCalculator
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("ADD = "+ calculator.getAdditionResult());
        System.out.println("SUBTRACT = "+ calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("MULTIPLY = "+ calculator.getMultiplicationResult());
        System.out.println("DIVIDE = "+ calculator.getDivisionResult());


    }
}
