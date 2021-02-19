package com.company;


public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(){System.out.println("Constructing a rectangle...");};
    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public void onAreaChange()
    {
        double otherArea = width*height;
        this.area = otherArea;
    }
}
