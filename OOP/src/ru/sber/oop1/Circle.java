package ru.sber.oop1;

public class Circle {
    private final double radius;
    private final String colour;

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    double area() {
        return Math.PI*Math.pow(radius,2);
    }

    double perimeter() {
        return Math.PI*2*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", colour='" + colour + '\''+ " Square=" + area()
                + " Perimeter=" + perimeter() + " " +
                '}';
    }
}
