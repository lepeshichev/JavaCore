package ru.sber.Collections1;

import java.util.Iterator;

public class Arraylist<T> implements List<T> {
    int len = 10;
    Object[] objArray = new Object[len];

    @Override
    public int size() {
        int counter = 0;
        for (Object obj : objArray) {
            if (obj != null) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public boolean isEmpty() {
        return objArray[0] == null;
    }

    @Override
    public boolean contains(T item) {
        for (Object obj : objArray) {
            if (obj == item)
                return true;
        }
        return false;
    }

    @Override
    public void add(T item) {
        int counter = 0;
        for (Object obj : objArray) {
            if (obj != null) {
                counter++;
            }
        }
        if (counter == len) {
            len = (len * 3) / 2 + 1;
            Object[] newObjArray = new Object[len];
            for (int i = 0; i < counter; i++) {
                newObjArray[i] = objArray[i];
            }
            objArray = newObjArray;
        }
        objArray[counter] = item;
    }

    @Override
    public boolean remove(T item) {
        Object[] newObjArray = new Object[len];
        int temp = 0;
        for (int i = 0; (i + temp) < len; i++) {
            while ((i + temp) < len && objArray[i + temp] == item) {
                temp++;
            }
            newObjArray[i] = objArray[i + temp];
        }
        objArray = newObjArray;
        return temp > 0;
    }

    @Override
    public void clear() {
        objArray = new Object[len];
    }

    @Override
    public void add(int index, T item) {
        int counter = 0;
        for (Object obj : objArray) {
            if (obj != null) {
                counter++;
            }
        }
        if (counter == len) {
            len = (len * 3) / 2 + 1;
            Object[] newObjArray = new Object[len];
            for (int i = 0; i < counter; i++) {
                newObjArray[i] = objArray[i];
            }
            objArray = newObjArray;
        }
        Object[] anotherObjArray = new Object[len];
        for (int i = 0; i < index; i++) {
            anotherObjArray[i] = objArray[i];
        }
        anotherObjArray[index] = item;
        for (int i = index; i < len - 1; i++) {
            anotherObjArray[i + 1] = objArray[i];
        }
        objArray = anotherObjArray;
    }

    @Override
    public void set(int index, T item) {
        objArray[index] = item;
    }

    @Override
    public Object get(int index) {
        return objArray[index];
    }

    @Override
    public int indexOf(T item) {
        for (int i = 0; i < len; i++) {
            if (objArray[i] == item)
                return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T item) {
        for (int i = len - 1; i > -1; i--) {
            if (objArray[i] == item)
                return i;
        }
        return -1;
    }

    @Override
    public Object remove(int index) {
        if (index >= len)
            throw new IndexOutOfBoundsException();
        Object elem = objArray[index];
        if (elem == null)
            throw new IndexOutOfBoundsException();
        Object[] newObjArray = new Object[len];
        for (int i = 0; i < index; i++) {
            newObjArray[i] = objArray[i];
        }
        for (int i = index; i < len - 1; i++) {
            newObjArray[i] = objArray[i + 1];
        }
        objArray = newObjArray;
        return elem;
    }

    @Override
    public Object[] subList(int from, int to) { /// List
        if (from < 0 || to >= len || objArray[to - 1] == null)
            throw new IndexOutOfBoundsException();
        Object[] newObjArray = new Object[len];
        for (int i = from; i < to; i++) {
            newObjArray[i - from] = objArray[i];
        }
        return newObjArray;
    }

    public void printList() {
        for (int i = 0; i < len; i++) {
            if (objArray[i] == null)
                break;
            else
                System.out.print(objArray[i] + " ");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                int counter = 0;
                for (Object obj : objArray) {
                    if (obj != null) {
                        counter++;
                    }
                }
                return currentIndex < counter;
            }

            @Override
            public T next() {
                return (T) objArray[currentIndex++];
            }

        };
    }
}
