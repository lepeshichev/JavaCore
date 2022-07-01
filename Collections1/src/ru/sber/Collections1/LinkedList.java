package ru.sber.Collections1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements Deque<T>, Collection<T> {

    public static class Node<E> {
        public E item;
        public Node<E> next;
        public Node<E> prev;
    }

    int len = 0;

    public Node<T> start;

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
        Node<T> it = start;
        while (it.next != null) {
            if (it.item == item)
                return true;
            it = it.next;
        }
        return it.item == item;
    }

    @Override
    public void add(T item) {
        if (len == 0) {
            start = new Node<>();
            start.item = item;
            start.prev = null;
            start.next = null;
        } else {
            Node<T> it = start;
            while (it.next != null) {
                it = it.next;
            }
            Node<T> newNode = new Node<>();
            newNode.item = item;
            newNode.prev = it;
            it.next = newNode;
        }
        len++;
    }

    @Override
    public boolean remove(T item) {
        int counter = 0;
        Node<T> it = start;
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
    public void addFirst(T item) {
        if (len == 0) {
            start = new Node<>();
            start.item = item;
            len++;
            return;
        }
        Node<T> first = new Node<>();
        first.item = item;
        first.next = start;
        start.prev = first;
        start = first;
        len++;
    }

    @Override
    public void addLast(T item) {
        if (len == 0) {
            start = new Node<>();
            start.item = item;
            start.prev = null;
            start.next = null;
        } else {
            Node<T> it = start;
            while (it.next != null) {
                it = it.next;
            }
            Node<T> newNode = new Node<>();
            newNode.item = item;
            newNode.prev = it;
            it.next = newNode;
        }
        len++;
    }

    @Override
    public T getFirst() {
        return (T) start.item;
    }

    @Override
    public T getLast() {
        Node<T> it = start;
        while (it.next != null) {
            it = it.next;
        }
        return it.item;
    }

    @Override
    public T pollFirst() {
        if (len == 0)
            return null;
        T temp = start.item;
        start = start.next;
        len--;
        return temp;
    }

    @Override
    public T pollLast() {
        if (len == 0)
            return null;
        Node<T> it = start;
        while (it.next != null) {
            it = it.next;
        }
        it.prev.next = null;
        len--;
        return it.item;
    }

    @Override
    public T removeFirst() {
        if (len == 0)
            throw new NoSuchElementException("Нет такого элемента");
        T temp = start.item;
        start = start.next;
        len--;
        return temp;
    }

    @Override
    public Object removeLast() {
        if (len == 0)
            throw new NoSuchElementException("Нет такого элемента");
        Node<T> it = start;
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
        Node<T> it = start;
        while (it.next != null) {
            System.out.print(it.item + " ");
            it = it.next;
        }
        System.out.print(it.item);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < len;
            }

            @Override
            public T next() {
                Node<T> current = start;
                currentIndex++;
                while (currentIndex > 0) {
                    current = current.next;
                    currentIndex--;
                }
                return (T) current.item;
            }
        };
    }
}
