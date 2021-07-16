package com.company;

import java.util.Scanner;

public class Rectangle extends Shape{
    Scanner scan = new Scanner(System.in);
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void draw(){
        if (this.length>0 && this.width>0){
            System.out.println("You have created rectangle of area: "+this.length*this.width);
        }
    }
    public void erase(){
        System.out.println("Enter r to remove this rectangle");
        char circle_remove = scan.next().charAt(0);
        if(circle_remove=='r'){
            System.out.println("Your rectangle removed");
        }
    }
}
