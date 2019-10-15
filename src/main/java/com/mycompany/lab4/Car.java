
package com.mycompany.lab4;

public class Car {
    private String make;
    private String model;
    private int year;
    private int speed;
            
    public String getMake(){
        return this.make;    
    }
    public void setMake (String make){
        this.make = make;
    }
    public String getModel (){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }
    
    public int getSpeed(){
    return this.speed;
}
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    public Car(int year, String make, String model){
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }
    
    public int accelerate(){
       this.speed +=5;
        return this.speed;
    }
    public int brake(){
        this.speed += -5;
        return this.speed;
    }
    
    public void carInfo(){
        System.out.println(this.year + " "+this.make + " " + this.model);
        
    }
}
