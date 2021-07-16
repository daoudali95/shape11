package com.company;

import java.util.Scanner;

public class Square extends Shape{
    Scanner scan = new Scanner(System.in);
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void draw(){

        if (length>0){
            System.out.println("You draw square of area: "+ length*length);
        }
    }
    public void erase(){
        System.out.println("Enter r to remove this square");
        char square_remove = scan.next().charAt(0);
        if(square_remove=='r'){
            System.out.println("Your circle removed");
        }
    }
}
