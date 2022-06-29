package ru.sber.Collections1;

import java.util.function.Consumer;

public interface Collection extends Iterable {
    int size();

    boolean isEmpty();

    boolean contains(Object item);

    void add(Object item);

    boolean remove(Object item);

    void clear();
}
