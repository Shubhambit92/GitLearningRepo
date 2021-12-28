package com.ford.Training.Training_Week_1.Day3;

public class Rectangle {
    int l;
    int b;
    public Rectangle(){
        l=10;
        b=6;
    }
    public Rectangle(int length,int breadth){
        l=length;
        b=breadth;
    }
    public int calcArea(){
        return l*b;
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        System.out.println("Area of Rectangle: "+rec.calcArea());
    }
}
