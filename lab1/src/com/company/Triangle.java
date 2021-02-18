package com.company;

public class Triangle extends Shape{

    private double base;
    private double height;

    public Triangle(){};
    public void setBase(double otherBase)
    {
        //Triangle t = new Triangle();
        this.base = otherBase;
        //return t;
    }

    public void setHeight(double otherHeight)
    {
        //Triangle t = new Triangle();
        this.height = otherHeight;
        //return t;
    }

    public void onAreaChange()
    {
        double otherArea = base*height/2;
        this.area = otherArea;
    }
}
