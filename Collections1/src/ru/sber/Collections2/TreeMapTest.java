package ru.sber.Collections2;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(8, "23");
        tm.put(3, "23");
        tm.put(10, "23");
        tm.put(1, "23");
        tm.put(6, "123");
        tm.put(14, "23");
        tm.put(14, "233333333333");
        tm.put(4, "23");
        tm.put(7, "23");
        tm.put(13, "23");
        System.out.println(tm.containsKey(6));
        System.out.println(tm.containsValue("123"));
        System.out.println(tm.get(14));
        System.out.println(tm.keySet());
        System.out.println(tm.values());
        System.out.println(tm.entrySet());
        tm.printTreeMap();
    }
}
