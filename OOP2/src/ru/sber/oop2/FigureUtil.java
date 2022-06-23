package ru.sber.oop2;

public class FigureUtil {
     private FigureUtil() {

    }

    static void area(Figure figure) {
        //вывод в зависимости от типа фигуры
        if(figure instanceof Circle) {
            Circle circle = (Circle) figure;
            circle.area();
        } else if(figure instanceof Square) {
            Square square = (Square) figure;
            square.area();
        } else if(figure instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) figure;
            rectangle.area();
        } else if(figure instanceof Triangle) {
            Triangle triangle = (Triangle) figure;
            triangle.area();
        }
    }

    static void perimeter(Figure figure) {
        if(figure instanceof Circle) {
            Circle circle = (Circle) figure;
            circle.perimeter();
        } else if(figure instanceof Square) {
            Square square = (Square) figure;
            square.perimeter();
        } else if(figure instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) figure;
            rectangle.perimeter();
        } else if(figure instanceof Triangle) {
            Triangle triangle = (Triangle) figure;
            triangle.perimeter();
        }
    }

    static void draw(Figure figure) {
        draw(figure,Color.BLACK);
    }

    static void draw(Figure figure, Color color) {
        if(figure instanceof Circle) {
            Circle circle = (Circle) figure;
            circle.draw(color);
        } else if(figure instanceof Square) {
            Square square = (Square) figure;
            square.draw(color);
        } else if (figure instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) figure;
                rectangle.draw(color);
        } else if(figure instanceof Triangle) {
            Triangle triangle = (Triangle) figure;
            triangle.draw(color);
        }
    }
}