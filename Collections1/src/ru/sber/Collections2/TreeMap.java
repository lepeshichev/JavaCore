package ru.sber.Collections2;

import java.util.*;

public class TreeMap<K, V> implements Map<K, V> {
    class Leaf {
        int key;
        V value;
        Leaf left;
        Leaf right;

        public Leaf(int key, V value, Leaf left, Leaf right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
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
    Leaf root = null;

    @Override
    public int size() {
        return len;
    }

    @Override
    public boolean isEmpty() {
        return len == 0;
    }

    @Override
    public boolean containsKey(K key) {
        return containsKey((int) key, root);
    }

    private boolean containsKey(int key, Leaf curr) {
        if (curr == null)
            return false;
        if (curr.key == key) {
            //System.out.println(curr.left.value + " " + curr.right.value);
            return true;
        } else if (key > curr.key) {
            return containsKey(key, curr.right);
        } else
            return containsKey(key, curr.left);
    }

    @Override
    public boolean containsValue(V value) {
        Queue<Leaf> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Leaf curr = q.poll();
            if (curr == null)
                continue;
            if (curr.value == value)
                return true;
            q.add(curr.left);
            q.add(curr.right);
        }
        return false;
    }

    @Override
    public Object get(K key) {
        return get((Integer) key, root);
    }

    private Object get(int key, Leaf curr) {
        if (curr == null)
            return null;
        else if (curr.key == key) {
            return curr.value;
        } else if (key < curr.key) {
            return get(key, curr.left);
        } else
            return get(key, curr.right);
    }

    @Override
    public Object put(K key, V value) {
        root = put((int) key, value, root);
        return value;
    }

    private Leaf put(int key, V value, Leaf curr) {
        if (curr == null) {
            len++;
            return new Leaf(key, value, null, null);
        } else if (curr.key == key) {
            return new Leaf(key, value, curr.left, curr.right);
        } else if (key < curr.key) {
            return new Leaf(curr.key, curr.value, put(key, value, curr.left), curr.right);
        } else {
            return new Leaf(curr.key, curr.value, curr.left, put(key, value, curr.right));
        }
    }

    @Override
    //Todo
    public Object remove(K key) {
        return remove((Integer) key, root);
    }

    private Object remove(int key, Leaf curr) {
        Leaf temp = getLeaf(key, root);
        if (temp.left == null && temp.right == null) {
            Leaf parent = getParent(curr.key, root, null);
        }
        return null;
    }

    private Leaf getLeaf(int key, Leaf curr) {
        if (curr == null)
            return null;
        if (curr.key == key) {
            return curr;
        } else if (key > curr.key) {
            return getLeaf(key, curr.right);
        } else
            return getLeaf(key, curr.left);
    }

    private Leaf getParent(int key, Leaf curr, Leaf prev) {
        if (curr == null)
            return prev;
        if (curr.key == key) {
            return prev;
        } else if (key > curr.key) {
            return getParent(key, curr.right, curr);
        } else
            return getParent(key, curr.left, curr);
    }

    @Override
    public void clear() {
        root = null;
        len = 0;
    }

    @Override
    public Collection values() {
        Queue<Leaf> q = new LinkedList<>();
        q.add(root);
        List<Object> list = new ArrayList<>();
        while (!q.isEmpty()) {
            Leaf curr = q.poll();
            if (curr == null)
                continue;
            list.add(curr.value);
            q.add(curr.left);
            q.add(curr.right);
        }
        return list;
    }

    @Override
    public Collection keySet() {
        Queue<Leaf> q = new LinkedList<>();
        q.add(root);
        List<Object> list = new ArrayList<>();
        while (!q.isEmpty()) {
            Leaf curr = q.poll();
            if (curr == null)
                continue;
            list.add(curr.key);
            q.add(curr.left);
            q.add(curr.right);
        }
        return list;
    }

    @Override
    public Collection entrySet() {
        Queue<Leaf> q = new LinkedList<>();
        q.add(root);
        List<Object> list = new ArrayList<>();
        while (!q.isEmpty()) {
            Leaf curr = q.poll();
            if (curr == null)
                continue;
            list.add(curr);
            q.add(curr.left);
            q.add(curr.right);
        }
        return list;
    }

    public void printTreeMap() {
        Queue<Leaf> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Leaf curr = q.poll();
            if (curr == null)
                continue;
            System.out.print("{" + curr.key + "; " + curr.value + "} ");
            q.add(curr.left);
            q.add(curr.right);
        }
    }
}
