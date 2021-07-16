package com.company;

import java.util.Scanner;

public class Shape_input {
    public static void main(String[] args) {
        String[] shapes = {" ","Circle","Square","Rectangle"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Your have 3 shapes:");
        for (int i=1; i<=3; i++){
            System.out.print(i+") "+shapes[i]+" ");
        }
        System.out.println();
        System.out.println("Which shape you want to select?");
        int shape_Input = scan.nextInt();

        if (shape_Input==1){
            Circle circle_obj = new Circle();
            System.out.println("Do you want to Draw circle?");
            System.out.println("Enter 1 for yes and 0 for no");
            int circle_input = scan.nextInt();
            if (circle_input==1){
                System.out.println("Enter radius of this circle");
                double radius_input = scan.nextDouble();
                circle_obj.setRadius(radius_input);
                circle_obj.draw();
                System.out.println("Do you want to remove this circle?");
                System.out.println("Enter 1 for yes and 0 for no");
                int remove_input = scan.nextInt();
                if (remove_input==1){
                    circle_obj.erase();
                }
            }

        }

        else if (shape_Input==2){
            Square square_obj = new Square();
            System.out.println("Do you want to Draw square?");
            System.out.println("Enter 1 for yes and 0 for no");
            int square_input = scan.nextInt();
            if (square_input==1){
                System.out.println("Enter length of this square");
                int length_input = scan.nextInt();
                square_obj.setLength(length_input);
                square_obj.draw();
                System.out.println("Do you want to remove this square?");
                System.out.println("Enter 1 for yes and 0 for no");
                int remove_input = scan.nextInt();
                if (remove_input==1){
                    square_obj.erase();
                }
            }
        }

        else if (shape_Input==3){
            Rectangle rectangle_obj = new Rectangle();
            System.out.println("Do you want to Draw rectangle?");
            System.out.println("Enter 1 for yes and 0 for no");
            int rectangle_input = scan.nextInt();
            if (rectangle_input==1){
                System.out.println("Enter length of this rectangle");
                int length = scan.nextInt();
                System.out.println("Enter width of this rectangle");
                int width = scan.nextInt();
                rectangle_obj.setLength(length);
                rectangle_obj.setWidth(width);

                rectangle_obj.draw();
                System.out.println("Do you want to remove this rectangle?");
                System.out.println("Enter 1 for yes and 0 for no");
                int remove_input = scan.nextInt();
                if (remove_input==1){
                    rectangle_obj.erase();
                }
            }
        }
    }
}
