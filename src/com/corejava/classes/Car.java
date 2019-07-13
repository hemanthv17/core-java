package com.corejava.classes;

public class Car {

     private int car;
     private int wheels;
     private String model;
     private String engine;
     private String color;

     public void setModel(String model){
         //setting up rules
         String validModel = model.toLowerCase();
         if (validModel.equals("boxter") || validModel.equals("cayman")){
             this.model = model;

         } else {
             this.model="unknown";
         }

     }
     public String getModel(){
         return this.model;
     }
}

