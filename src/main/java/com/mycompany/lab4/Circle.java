
package com.mycompany.lab4;

public class Circle {
    private double radius;
    private double pi;
    
    public Circle(){
        this.radius = 0;
        this.pi = 3.14159;
    }
    
    public Circle(double radius){
        this.radius = radius;
        this.pi = 3.14159;
    }
    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double area (){
    double area = this.pi * (this.radius * this.radius);
    return area;
    }
    public double diameter(){
        double diameter = this.radius * 2;
        return diameter;
    }
    public double circumference(){
        double circumference = 2 * this.pi * this.radius;
        return circumference;
    }
}
    

