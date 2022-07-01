package ru.sber.Collections1;

import java.util.Arrays;

public class TestCollections {
    public static void main(String[] args) {
        Arraylist<Integer> list = new Arraylist<>();
        list.add(11);
        list.add(12);
        list.add(10);
        list.add(11);
        list.add(11);
        System.out.println(list.size());
        System.out.println(list.len);
        list.printList();
        list.remove(1);
        System.out.println("\n");
        list.printList();
        list.add(1,20);
        System.out.println("\n");
        list.printList();
        list.set(2,30);
        System.out.println("\n");
        list.printList();
        System.out.println("\n");
        System.out.println(list.get(1));
        list.add(11);
        list.add(11);
        list.remove(2);
        System.out.println("\n");
        list.printList();
        System.out.println(Arrays.toString(list.subList(0, 2)));

    }
}
