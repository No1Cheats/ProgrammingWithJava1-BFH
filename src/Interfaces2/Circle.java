package Interfaces2;

public class Circle {

    private final double PI = 3.14159;
    private double radius;
    private double area;

    public Circle(double rad) {
        this.radius = rad;
    }

    public double getArea() {
        return PI * this.radius * this.radius;
    }

}
