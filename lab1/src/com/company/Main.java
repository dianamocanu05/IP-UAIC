package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Triangle t = new Triangle();
    t.setBase(2);
    t.setHeight(3);
    t.onAreaChange();
    System.out.println("Triangle area: "+t.getArea());

    Circle c = new Circle();
    c.setRadius(3);
    c.onAreaChange();
    System.out.println("Circle area "+c.getArea());

    Rectangle r = new Rectangle();
    r.setHeight(4);
    r.setWidth(5);
    r.onAreaChange();
    System.out.println("Rectangle area "+r.getArea());
    }
}
