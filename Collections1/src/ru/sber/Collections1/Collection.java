package ru.sber.Collections1;

public interface Collection extends Iterable {
    int size();
    boolean isEmpty();
    boolean contains(Object item);
    void add(Object item);
    boolean remove(Object item);
    void clear();
}
