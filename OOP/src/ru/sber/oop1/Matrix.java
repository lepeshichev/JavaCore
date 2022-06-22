package ru.sber.oop1;

import java.util.Arrays;

public class Matrix {

    private final int rows;
    private final int columns;

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    double[][] digits;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        digits = new double[rows][columns];
    }

    void setValue(int i, int j, double value) {
        digits[i][j] = value;
    }

    public double getElement(int i, int j) {
        return digits[i][j];
    }

    public void sumWith(Matrix matrixA) {
        for (int i = 0; i < matrixA.getRows(); i++) {
            for (int j = 0; j < matrixA.getColumns(); j++) {
                digits[i][j] += matrixA.getElement(i,j);
            }
        }
    }

    public void multiplicateWith(Matrix matrixA) {
        for (int i = 0; i < matrixA.getRows(); i++) {
            for (int j = 0; j < matrixA.getColumns(); j++) {
                digits[i][j] *= matrixA.getElement(i,j);
            }
        }
    }

    public void multiplicateWithDouble(double number) {
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits[0].length; j++) {
                digits[i][j] *= number;
            }
        }
    }

    public String printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(digits[i][j] + " ");
            }
            System.out.print('\n');
        }
        return "Matrix{" +
                "rows=" + rows +
                ", columns=" + columns +
                ", digits=" + Arrays.toString(digits) + " " +
                '}';
    }
}
