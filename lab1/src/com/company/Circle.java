package com.company;

public class Circle extends Shape{
    private double radius;
    private final double PI = 3.145;
    public Circle(){
        System.out.println("Constructing a circle...");
    }

    public void setRadius(double otherRadius)
    {
        this.radius = otherRadius;
    }
    public void onAreaChange()
    {
        double otherArea = radius*radius*PI;
        this.area = otherArea;
    }

}
