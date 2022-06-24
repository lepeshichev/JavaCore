package ru.sber.exeption;

public class InvalidCardNumberExeption extends BankOnlineExeption {
    public InvalidCardNumberExeption(String msg) {
        super(msg);
    }
}
