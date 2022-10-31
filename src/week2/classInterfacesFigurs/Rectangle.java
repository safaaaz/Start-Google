package week2.classInterfacesFigurs;

import week2.classInterfacesFigurs.Figure;

public class Rectangle implements Figure {
    double length;
    double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double area() {
        return length * width;
    }

}