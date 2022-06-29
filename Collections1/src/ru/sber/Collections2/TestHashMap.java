package ru.sber.Collections2;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(1, "asdasd");
        map.put(2, "wasd");
        map.put(2, "wassd");
        map.put(3, "awasd");
        System.out.println(map.size());
        map.printHashMap();
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("asdasd"));
        //System.out.println(map.get(1));
        System.out.println(map.remove(1));
        map.printHashMap();
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
    }
}
