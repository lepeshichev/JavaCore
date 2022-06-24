package ru.sber.exeption;

public class BlockedCardExeption extends BankOnlineExeption {
    BlockedCardExeption(String message) {
        super(message);
    }
}
