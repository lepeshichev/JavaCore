package ru.sber.Collections1;

public interface List<E> extends Collection<E> {
    void add(int index, E item);

    void set(int index, E item);

    Object get(int index);

    int indexOf(E item);

    int lastIndexOf(E item);

    Object remove(int index);

    Object subList(int from, int to);
}
