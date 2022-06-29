package ru.sber.Collections1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList implements Deque, Collection {

    public static class Node {
        public Object item;
        public Node next;
        public Node prev;
    }

    int len = 0;

    public Node start;

    @Override
    public int size() {
        return len;
    }

    @Override
    public boolean isEmpty() {
        return len == 0;
    }

    @Override
    public boolean contains(Object item) {
        Node it = start;
        while (it.next != null) {
            if (it.item == item)
                return true;
            it = it.next;
        }
        return it.item == item;
    }

    @Override
    public void add(Object item) {
        if (len == 0) {
            start = new Node();
            start.item = item;
            start.prev = null;
            start.next = null;
        } else {
            Node it = start;
            while (it.next != null) {
                it = it.next;
            }
            Node newNode = new Node();
            newNode.item = item;
            newNode.prev = it;
            it.next = newNode;
        }
        len++;
    }

    @Override
    public boolean remove(Object item) {
        int counter = 0;
        Node it = start;
        while (it.next != null) {
            if (it.item == item) {
                it.prev.next = it.next;
                it.next.prev = it.prev;
                counter++;
            }
            it = it.next;
        }
        if (it.item == item) {
            it.prev.next = null;
            counter++;
        }
        len -= counter;
        return counter != 0;
    }

    @Override
    public void clear() {
        start = null;
        len = 0;
    }

    @Override
    public void addFirst(Object item) {
        if (len == 0) {
            start = new Node();
            start.item = item;
            len++;
            return;
        }
        Node first = new Node();
        first.item = item;
        first.next = start;
        start.prev = first;
        start = first;
        len++;
    }

    @Override
    public void addLast(Object item) {
        if (len == 0) {
            start = new Node();
            start.item = item;
            start.prev = null;
            start.next = null;
        } else {
            Node it = start;
            while (it.next != null) {
                it = it.next;
            }
            Node newNode = new Node();
            newNode.item = item;
            newNode.prev = it;
            it.next = newNode;
        }
        len++;
    }

    @Override
    public Object getFirst() {
        return start.item;
    }

    @Override
    public Object getLast() {
        Node it = start;
        while (it.next != null) {
            it = it.next;
        }
        return it.item;
    }

    @Override
    public Object pollFirst() {
        if (len == 0)
            return null;
        Object temp = start.item;
        start = start.next;
        len--;
        return temp;
    }

    @Override
    public Object pollLast() {
        if (len == 0)
            return null;
        Node it = start;
        while (it.next != null) {
            it = it.next;
        }
        it.prev.next = null;
        len--;
        return it.item;
    }

    @Override
    public Object removeFirst() {
        if (len == 0)
            throw new NoSuchElementException("Нет такого элемента");
        Object temp = start.item;
        start = start.next;
        len--;
        return temp;
    }

    @Override
    public Object removeLast() {
        if (len == 0)
            throw new NoSuchElementException("Нет такого элемента");
        Node it = start;
        while (it.next != null) {
            it = it.next;
        }
        it.prev.next = null;
        len--;
        return it.item;
    }

    public void printLinkedList() {
        if (start == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node it = start;
        while (it.next != null) {
            System.out.print(it.item + " ");
            it = it.next;
        }
        System.out.print(it.item);
    }

    @Override
    public Iterator<Object> iterator() {
        return new Iterator<>() {
            int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < len;
            }

            @Override
            public Object next() {
                Node current = start;
                currentIndex++;
                while (currentIndex > 0) {
                    current = current.next;
                    currentIndex--;
                }
                return current.item;
            }
        };
    }
}
