package com.company;

import java.util.Scanner;

public class Circle extends Shape{
    Scanner scan = new Scanner(System.in);
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void draw(){
        if (radius>0){
            System.out.println("You have created circle of diameter : " + (radius+radius));
        }
    }

    public void erase(){
        System.out.println("Enter r to remove this circle");
        char circle_remove = scan.next().charAt(0);
        if(circle_remove=='r'){
            System.out.println("Your circle removed");
        }
    }
}
