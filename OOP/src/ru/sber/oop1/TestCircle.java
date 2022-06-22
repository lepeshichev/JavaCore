package ru.sber.oop1;

public class TestCircle {
    public static void main(String[] args) {
        Circle SomeCircle = new Circle(4.2,"red");
        System.out.println(SomeCircle.area());
        System.out.println(SomeCircle.perimeter());
        System.out.println(SomeCircle.toString());
    }

}
