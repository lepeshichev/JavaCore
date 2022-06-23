package ru.sber.oop2;

public class Triangle extends Figure implements Drawable {
    Point a;
    Point b;
    Point c;
    public Triangle(double x, double y, double x2, double y2, double x3, double y3) {
        a = new Point(x,y);
        b = new Point(x2, y2);
        c = new Point(x3, y3);
    }

    @Override
    public void draw() {
        System.out.println("Рисуем треугольник с вершинами в точках: " + a.x + " " + a.y
                + " " + b.x + " " + b.y+ " " + c.x + " " + c.y);
    }

    @Override
    public void draw(Color color) {
        System.out.println("Рисуем треугольник " + color + " цвета c вершинами в точках: " + a.x + " " + a.y
                + " " + b.x + " " + b.y+ " " + c.x + " " + c.y);
    }

    @Override
    public void area() {
        System.out.println("Считаем площадь треугольника");
    }

    @Override
    public void perimeter() {
        System.out.println("Считаем периметр треугольника");
    }
}
