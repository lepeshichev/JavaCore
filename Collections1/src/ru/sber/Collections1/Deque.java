package ru.sber.Collections1;

public interface Deque<E> extends Collection<E> {
    void addFirst(E item);
    void addLast(E item);
    E getFirst();
    Object getLast();
    Object pollFirst();
    Object pollLast();
    Object removeFirst();
    Object removeLast();
}
