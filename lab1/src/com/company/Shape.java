package com.company;

public abstract class Shape {
    protected double area;

    protected Shape(){System.out.println("Constructing a shape...");}
    protected double getArea()
    {
        return this.area;
    }
    protected void onAreaChange(double area){}
}
