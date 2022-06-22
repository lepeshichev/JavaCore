package ru.sber.oop1;

public class TestPhone {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        Phone yourPhone = new Phone(7_921_123_23, "Samsung11");
        Phone someonesPhone = new Phone(7_00_11_2, "iPhoneX", 0.255);
        System.out.println(yourPhone.getNumber());
        System.out.println(someonesPhone.toString());
        myPhone.receiveCall("Alex");
        myPhone.receiveCall("Alex", 123_456);
    }
}
