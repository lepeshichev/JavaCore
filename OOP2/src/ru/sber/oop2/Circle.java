package ru.sber.oop2;

public class Circle extends Figure implements Drawable {
    int radius;
    Point center;
    public Circle(int radius, double x, double y) {
        center = new Point(x,y);
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Площадь круга: " + Math.PI * radius * radius);
    }

    @Override
    public void perimeter() {
        System.out.println("Периметр круга: " + Math.PI * 2 * radius);
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг с центром в точке: " + center.x + " " + center.y);
    }

    @Override
    public void draw(Color color) {
        System.out.println("Рисуем круг " + color + " цвета" + " с центром в точке: " + center.x + " " + center.y);
    }
}
