package ru.sber.base.syntax;

// в промежутке [2, 100]. Используйте для решения этой задачи оператор % (остаток от деления) и циклы.
public class Task5 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 99 + 2);
        }
        for(int each : numbers)
            System.out.print(each + " ");
        int max = Integer.MIN_VALUE;
        for (int each : numbers) {
            if (each > max)
                max = each;
        }
        System.out.println();
        System.out.println(max);
        int sum = 0;
        int counter = 0;
        for (int each : numbers) {
            sum += each;
            counter++;
        }
        System.out.println(sum / counter);
    }
}
