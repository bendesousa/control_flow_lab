import java.util.Scanner;

public class WhatShouldIWear {

    public static void main(String[] args) {
        System.out.println("Daily Outfit Selector");
//        Prompt the user to input the weather from a list
        System.out.println("PLease pick one of the following weather conditions: Sun, Rain, Snow,");
//        Gave a list of weather conditions to ensure that the code could not be broken by user inputting a condition that had not been accounted for
//        Collect user input
        Scanner reader = new Scanner(System.in);
        String weather = reader.nextLine();
//        Prompt the user to input average temperature
        System.out.println("What is today's forecasted average temperature?");
//        Collect user input
        Scanner numerator = new Scanner(System.in);
        int temperature = numerator.nextInt();
//        Select an output based on user input
        if (weather.equals("Rain") && temperature <= 14){
            System.out.println("Waterproof jacket and trousers");
        } else if (weather.equals("Rain") && temperature >= 15){
            System.out.println("Waterproof jacket and shorts");
        } else if (weather.equals("Sun") && temperature <= 14){
            System.out.println("Hoodie and trousers");
        } else if (weather.equals("Sun") && temperature >= 15){
            System.out.println("T-shirt and shorts");
        } else if (weather.equals("Snow") && temperature <= 14){
            System.out.println("Winter coat and trousers");
        } else if (weather.equals("Snow") && temperature >= 15){
            System.out.println("Hoodie and trousers");
        }
//        Temperature conditions were set so that any temperature input could be captured in the process

    }

}
