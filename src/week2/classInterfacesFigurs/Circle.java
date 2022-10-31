package week2.classInterfacesFigurs;

public class Circle implements Figure {
    double radius;

    // Constructor for circle
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }
}
