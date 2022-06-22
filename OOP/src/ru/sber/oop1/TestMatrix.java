package ru.sber.oop1;

public class TestMatrix {
    public static void main(String[] args) {
        Matrix someMatrix = new Matrix(2,2);
        someMatrix.setValue(1,1,2);
        someMatrix.setValue(0,0,3);
        Matrix someMatrix2 = new Matrix(2,2);
        someMatrix2.setValue(1,1,4);
        someMatrix2.setValue(0,0,2);
        System.out.println(someMatrix.printMatrix());
        System.out.println(someMatrix2.printMatrix());
        someMatrix.sumWith(someMatrix2);
        System.out.println(someMatrix.printMatrix());
        someMatrix.multiplicateWith((someMatrix2));
        System.out.println(someMatrix.printMatrix());
        someMatrix.multiplicateWithDouble(2.5);
        System.out.println(someMatrix.printMatrix());
    }
}
