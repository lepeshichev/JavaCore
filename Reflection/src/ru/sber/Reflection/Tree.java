package ru.sber.Reflection;

import java.util.NoSuchElementException;

public class Tree {
    public double size;
    protected String root;
    private int leaf;

    public Tree(int leaf) {
        this.leaf = leaf;
    }

    private Tree(String s) {
        this.root = s;
    }

    public int getLeaf() {
        return leaf;
    }

    private int printSmth() throws NoSuchElementException {
        System.out.println(4);
        return 3;
    }
}
