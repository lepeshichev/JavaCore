package ru.sber.oop2;

import static ru.sber.oop2.FigureUtil.*;

public class PaintExample{
    public static void main(String[] args) {
        draw(new Circle(32,123,2), Color.CYAN);
        area(new Circle(32,1,2));
        perimeter(new Circle(234,23,1));
        draw(new Rectangle(12,34,123,324));
        area(new Rectangle(12,123,32,12));
        perimeter(new Rectangle(2,1,3,4));
        draw(new Square(1,2,3,4), Color.RED);
        area(new Square(1,3,2,4));
        perimeter(new Square(23,23,1,2));
        draw(new Triangle(1,2,3,4,5,6));
        area(new Triangle(1,2,3,4,5,6));
        perimeter(new Triangle(1,2,3,4,5,6));
    }
}
