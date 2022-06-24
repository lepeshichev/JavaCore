package ru.sber.exeption;

public class TransferLimitExceededExeption extends BankOnlineExeption {
    TransferLimitExceededExeption(String message) {
        super(message);
    }
}
