package ru.sber.base.syntax;

// Необходимо, чтобы программа выводила на экран вот такую последоватлеьность 7 14 21 28 35 42 49 56 63 70 77 84 91 98
public class Task3 {
    public static void main(String[] args) {
        int seven = 7;
        while (seven < 100) {
            System.out.print(seven + " ");
            seven += 7;
        }
    }
}
