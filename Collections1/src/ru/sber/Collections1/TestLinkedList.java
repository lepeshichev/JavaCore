package ru.sber.Collections1;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(3);
        ll.printLinkedList();
        System.out.println("\n");
        System.out.println(ll.contains(4));
        ll.remove(3);
        ll.printLinkedList();
        ll.addFirst(6);
        ll.addLast(7);
        System.out.println("\n");
        ll.printLinkedList();
        System.out.println("\n");
        ll.pollFirst();
        ll.pollLast();
        ll.printLinkedList();
        ll.removeFirst();
        System.out.println("\n");
        ll.printLinkedList();
    }
}
