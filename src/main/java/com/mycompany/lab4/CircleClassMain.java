
package com.mycompany.lab4;

import java.util.Scanner;

public class CircleClassMain {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle: ");
        double radius = keyboard.nextDouble();
        
        
        Circle circle = new Circle(radius);
        
        System.out.println("The radius of the circle is: " + circle.getRadius());
        System.out.println("The area of the circle is: " + circle.area());
        System.out.println("The diameter of the circle is: " + circle.diameter());
        System.out.println("The circumference of the circle is: " + circle.circumference());
                
        
        
    }
}
