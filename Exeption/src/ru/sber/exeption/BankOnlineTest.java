package ru.sber.exeption;

import java.io.IOException;

public class BankOnlineTest {
    public static void main(String[] args) throws IOException {
        BankOnline bo = new BankOnline();
        bo.send("1234 1234 4123 1234",10.0);
        bo.send("1234 1234 4123 123",10.0);
        bo.send("3333 3333 3333 3333",10.0);
        bo.send("1234 1234 4123 1234",-1.0);
        bo.send("1234 1234 4123 1234", 50_000.1);
        bo.send("1234 1234 4123 1234", null);
    }

}
