package ru.sber.base.syntax;

// Выведите на экран первые 11 членов последовательности Фибоначчи.
public class Task7 {
    public static void main(String[] args) {
        // 0 = 0 1 = 1 2 = 2 - 1 + 2 - 2
        int[] fib = new int[11];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < 11; ++i) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for(int each : fib)
            System.out.print(each + " ");
    }
}
