package ru.sber.exeption;

public class InvalidTransferAmountExeption extends BankOnlineExeption {
    InvalidTransferAmountExeption(String message) {
        super(message);
    }
}
