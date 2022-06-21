package ru.sber.base.syntax;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        while(counter < 3) {
            counter++;
            String userAnswer = sc.nextLine();
            if(userAnswer.equals("Троллейбус")) {
                System.out.println("Правильно");
                break;
            }
            if(userAnswer.equals("Сдаюсь")) {
                System.out.println("Правильный ответ - Троллейбус");
                break;
            }
            if(counter < 3)
                System.out.println("Подумай еще");
        }
    }
}
