package ru.sber.exeption;

public class NullSendArgumentsExeption extends BankOnlineExeption{
    NullSendArgumentsExeption(String message) {
        super(message);
    }
}
