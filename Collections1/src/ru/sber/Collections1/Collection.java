package ru.sber.Collections1;

public interface Collection<E> extends Iterable<E> {
    int size();

    boolean isEmpty();

    boolean contains(E item);

    void add(E item);

    boolean remove(E item);

    void clear();
}
