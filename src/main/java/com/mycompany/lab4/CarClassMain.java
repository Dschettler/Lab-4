
package com.mycompany.lab4;

import java.util.Scanner;

public class CarClassMain {
    public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
   
     System.out.println("Please enter the year of the vehicle:");
     int carYear = keyboard.nextInt();
     System.out.println("Please enter the make of the vehicle:");
     String carMake = keyboard.next();
     System.out.println("Please enter the model of the vehicle:");
     String carModel = keyboard.next();
     
        
        Car myCar = new Car(carYear, carMake, carModel);
       myCar.carInfo();
        int counter = 1;
        
        while (counter <= 5 ){
            myCar.accelerate();
            counter++;
            System.out.println("The vehicle is travelling " +myCar.getSpeed() + " MPH");
        }
        counter = 1;
       
        
        while (counter<=5){
            myCar.brake();
            counter++;
            System.out.println("The vehicle is travelling " +myCar.getSpeed() + " MPH");

        }
      
      
    }
}
