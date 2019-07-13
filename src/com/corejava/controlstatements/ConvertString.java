package com.corejava.controlstatements;

import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;


public class ConvertString {
    public static void main(String[] args){
        String number = "{\"name\":\"hemanth\",\"phoneNumber\":6.1869188294432E13}";
        try {
            JSONObject jsonObject = new JSONObject(number);
            System.out.println("JsonObject before converting phonenumber using BigDecimal:: "+jsonObject);
            //String phoneNumber= toBigDecimal(jsonObject.get("phoneNumber").toString());
           // jsonObject.put("phoneNumber", phoneNumber);
            String phoneNumber = new BigDecimal(jsonObject.get("phoneNumber").toString()).toString();
            jsonObject.put("phoneNumber", phoneNumber);
            System.out.println("JsonObject after converting phonenumber using BigDecimal:: "+jsonObject);

        }
        catch (JSONException e){
            System.out.println(e.getLocalizedMessage());
        }



    }

    public static String toBigDecimal(String number){
       String num = new BigDecimal(number).toString();
        return num;
    }
}
