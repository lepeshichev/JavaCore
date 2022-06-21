package ru.sber.base.syntax;

import java.util.Arrays;

// Быстрая сортировка
public class Task2 {
    public static void main(String[] args) {
        int[] digits = new int[]{9, 0, 2, -4, 1, 9, 12, -15, 1};
        // -15 -4 0 1 1 2 9 9 12
        for(int each : digits)
            System.out.print(each + " ");
        quickSort(digits, 0, digits.length - 1);
        //Arrays.sort(digits);
        System.out.println();
        for(int each : digits)
            System.out.print(each + " ");
    }

    public static void quickSort(int[] numbers, int begin, int end) {
        if (begin >= end)
            return;
        int firstIndex = begin;
        int lastIndex = end;
        int sep = (firstIndex + lastIndex) / 2;
        while(firstIndex < lastIndex) {
            while((numbers[firstIndex] <= numbers[sep]) && (firstIndex < sep))
                firstIndex++;
            while ((numbers[lastIndex] >= numbers[sep]) && (lastIndex > sep))
                lastIndex--;
            if (firstIndex < lastIndex) {
                int temp = numbers[firstIndex];
                numbers[firstIndex] = numbers[lastIndex];
                numbers[lastIndex] = temp;
                if (firstIndex == sep)
                    sep = lastIndex;
                else if(lastIndex == sep)
                    sep = firstIndex;
            }
        }
        quickSort(numbers, 0, sep);
        quickSort(numbers, sep+1, end);
    }
}
