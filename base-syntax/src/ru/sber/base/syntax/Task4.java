package ru.sber.base.syntax;

// Заполните массив случайными числами и выведете максимальное и среднее значение.
// Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
public class Task4 {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random();
        }
        for(double each : numbers)
            System.out.print(each + " ");
        double max = Double.MIN_VALUE;
        for (double each : numbers) {
            if (each > max)
                max = each;
        }
        System.out.println();
        System.out.println(max);
        double sum = 0;
        double counter = 0;
        for (double each : numbers) {
            sum += each;
            counter++;
        }
        System.out.println(sum / counter);
    }
}
