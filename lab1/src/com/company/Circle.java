package com.company;

public class Circle extends Shape{
    private double radius;
    private double PI = 3.145;
    public Circle(){}

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
