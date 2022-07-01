package ru.sber.Collections2;

import java.util.Collection;

public interface Map<K, V> {
    int size();

    boolean isEmpty();

    boolean containsKey(K key);

    boolean containsValue(V value);

    Object get(K key);

    Object put(K key, V value);

    Object remove(K key);

    void clear();

    Collection values();

    Collection keySet();

    Collection entrySet();
}

