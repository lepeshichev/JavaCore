package ru.sber.exeption;

import java.io.*;

public class BankOnline {
    public void send(String cardNumber, Double money) throws IOException, NullSendArgumentsExeption, InvalidCardNumberExeption, BlockedCardExeption, InvalidTransferAmountExeption, TransferLimitExceededExeption {
        boolean success = true;
        if (cardNumber == null  || money == null) {
            throw new NullSendArgumentsExeption("Проверьте ввод данных");
        }

        if(cardNumber.replaceAll(" ", "").length() != 16) {
            success = false;
            throw new InvalidCardNumberExeption("Неверный номер карты");
        }
        BufferedReader reader = new BufferedReader(new FileReader("cards.txt"));
        String line = reader.readLine();
        while (line != null) {
            if (line.equals(cardNumber)) {
                success = false;
                throw new BlockedCardExeption("Перевод невозможен. Карта заблокирована");
            }
            line = reader.readLine();
        }
        if (money < 0) {
            success = false;
            throw new InvalidTransferAmountExeption("Введена отрицательная сумма перевода");
        }
        if (money > 50_000.0) {
            success = false;
            throw new TransferLimitExceededExeption("Превышен лимит в 50 тыс.");
        }
        if(success)
            System.out.println("Операция проведена успешно");
    }
}
