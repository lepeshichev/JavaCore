package ru.sber.Collections2;

import ru.sber.Collections1.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class HashMap<K, V> implements Map<K, V> {
    static class Pair<K, V> {
        K key;
        V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public Pair() {

        }

        @Override
        public String toString() {
            return "Pair{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    int len = 0;
    LinkedList[] buckets = new LinkedList[32];

    @Override
    public int size() {
        return len;
    }

    @Override
    public boolean isEmpty() {
        return len == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        int id = key.hashCode() % buckets.length;
        LinkedList current = buckets[id];
        if (current == null) {
            return false;
        }
        LinkedList.Node it = current.start;
        while (it.next != null) {
            Pair p = (Pair) it.item;
            if (p.key == key)
                return true;
            it = it.next;
        }
        Pair p = (Pair) it.item;
        return p.key == key;
    }

    @Override
    public boolean containsValue(Object value) {
        for (LinkedList current : buckets) {
            if (current == null) {
                continue;
            }
            LinkedList.Node it = current.start;
            while (it.next != null) {
                Pair p = (Pair) it.item;
                if (p.value == value) {
                    return true;
                }
                it = it.next;
            }
            Pair p = (Pair) it.item;
            if (p.value == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object get(Object key) {
        int id = key.hashCode() % buckets.length;
        LinkedList current = buckets[id];
        if (current == null) {
            return null;
        }
        LinkedList.Node it = current.start;
        while (it.next != null) {
            Pair p = (Pair) it.item;
            if (p.key == key)
                return p.value;
            it = it.next;
        }
        Pair p = (Pair) it.item;
        if (p.key == key)
            return p.value;
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        int bucketNumber = key.hashCode() % buckets.length;
        LinkedList list = buckets[bucketNumber];
        if (list == null) {
            list = new LinkedList();
        }
        if (list.size() != 0) {
            LinkedList.Node it = list.start;
            while (it.next != null) {
                Pair p = (Pair) it.item;
                if (p.key == key) {
                    p.value = value;
                    //it.item = p;
                    return it.item;
                }
                it = it.next;
            }
            Pair p = (Pair) it.item;
            if (p.key == key) {
                p.value = value;
                //it.item = p;
                return it.item;
            }
        }
        Pair p1 = new Pair(key, value);
        list.addLast(p1);
        len++;
        buckets[bucketNumber] = list;
        return p1;
    }

    @Override
    public Object remove(Object key) {
        int id = key.hashCode() % buckets.length;
        LinkedList current = buckets[id];
        if (current == null) {
            return null;
        }
        LinkedList.Node it = current.start;
        while (it.next != null) {
            Pair p = (Pair) it.item;
            if (p.key == key) {
                if (it.prev != null)
                    it.prev.next = it.next;
                it.next.prev = it.prev;
                len--;
                if (it.prev == null) {
                    current.start = it.next;
                } else {
                    while (it.prev != null) {
                        it = it.prev;
                    }
                    current.start = it;
                }
                buckets[id] = current;
                len--;
                return p.value;
            }
            it = it.next;
        }
        Pair p = (Pair) it.item;
        if (p.key == key) {
            if (it.prev != null)
                it.prev.next = null;
            len--;
            while (it.prev != null) {
                it = it.prev;
            }
            if (current.size() != 1)
                current.start = it;
            else
                current.start = null;
            buckets[id] = current;
            len--;
            return p.value;
        }
        buckets[id] = current;
        return null;
    }

    @Override
    public void clear() {
        Arrays.fill(buckets, null);
        len = 0;
    }

    @Override
    public Collection values() {
        ArrayList<Object> values = new ArrayList<>();
        for (int i = 0; i < buckets.length; i++) {
            LinkedList list = buckets[i];
            if (list == null)
                continue;
            LinkedList.Node it = list.start;
            if (it == null)
                continue;
            while (it.next != null) {
                Pair p = (Pair) it.item;
                values.add(p.value);
            }
            Pair p = (Pair) it.item;
            values.add(p.value);
        }
        return values;
    }

    @Override
    public Collection keySet() {
        ArrayList<Object> values = new ArrayList<>();
        for (int i = 0; i < buckets.length; i++) {
            LinkedList list = buckets[i];
            if (list == null)
                continue;
            LinkedList.Node it = list.start;
            if (it == null)
                continue;
            while (it.next != null) {
                Pair p = (Pair) it.item;
                values.add(p.key);
            }
            Pair p = (Pair) it.item;
            values.add(p.key);
        }
        return values;
    }

    @Override
    public Collection entrySet() {
        ArrayList<Object> values = new ArrayList<>();
        for (int i = 0; i < buckets.length; i++) {
            LinkedList list = buckets[i];
            if (list == null)
                continue;
            LinkedList.Node it = list.start;
            if (it == null)
                continue;
            while (it.next != null) {
                Pair p = (Pair) it.item;
                values.add(p);
            }
            Pair p = (Pair) it.item;
            values.add(p);
        }
        return values;
    }

    public void printHashMap() {
        for (int i = 0; i < buckets.length; i++) {
            LinkedList current = buckets[i];
            if (current == null) {
                continue;
            }
            LinkedList.Node it = current.start;
            if (it == null)
                continue;
            while (it.next != null) {
                Pair p = (Pair) it.item;
                System.out.print("{" + p.key + "; " + p.value + "} ");
                it = it.next;
            }
            Pair p = (Pair) it.item;
            System.out.print("{" + p.key + "; " + p.value + "} ");
        }
    }
}
