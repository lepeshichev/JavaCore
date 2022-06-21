package ru.sber.base.syntax;

//Напишите программу, которая выводит на консоль простые числа в промежутке [2, 100].
// Используйте для решения этой задачи оператор % (остаток от деления) и циклы.
public class Task5 {
    public static void main(String[] args) {
        for (int i = 2; i < 101; i++) {
            if(isPrime(i))
                System.out.print(i + " ");
        }
    }

    private static boolean isPrime(int number){
        boolean isPrime = true;
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
