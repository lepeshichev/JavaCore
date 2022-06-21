package ru.sber.base.syntax;

// Сортирока методом пузырька
public class Task1 {
    public static void main(String[] args) {
        int[] digits = new int[]{9, 0, 2, -4, 1, 9, 12, -15, 1};
        for(int each : digits)
            System.out.print(each + " ");
        bubbleSort(digits);
        System.out.println();
        for(int each : digits)
            System.out.print(each + " ");
    }

    public static void bubbleSort(int[] numbers) {
        boolean isSorted = false;

        while(!isSorted) {
            isSorted = true;
            for (int i = 1; i < numbers.length; i++) {
                if(numbers[i-1] > numbers[i]) {
                    isSorted = false;
                    int temp = numbers[i-1];
                    numbers[i - 1] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
    }
}
