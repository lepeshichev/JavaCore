package ru.sber.oop2;

public class Rectangle extends Figure implements Drawable {
    Point leftUp;
    Point rightDown;
    public Rectangle(double x, double y, double x2, double y2) {
        leftUp = new Point(x,y);
        rightDown = new Point(x2, y2);
    }

    @Override
    public void draw() {
        System.out.println("Рисуем прямоугольник с вершинами в точках: " + leftUp.x + " " + rightDown.y
                + " " + leftUp.y + " " + rightDown.x);
    }

    @Override
    public void draw(Color color) {
        System.out.println("Рисуем прямоугольник " + color + " цвета с вершинами в точках: " + leftUp.y + " " + rightDown.x
                + " " + leftUp.x + " " + rightDown.y);
    }

    @Override
    public void area() {
        System.out.println("Считаем площадь прямоугольника");
    }

    @Override
    public void perimeter() {
        System.out.println("Считаем периметр прямоугольника");
    }
}
