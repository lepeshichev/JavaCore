package ru.sber.exeption;

import java.io.*;

public class BankOnline {
    public void send(String cardNumber, Double money) throws IOException {
        boolean success = true;
        if (cardNumber == null  || money == null) {
            try {
                throw new NullSendArgumentsExeption("Проверьте ввод данных");
            } catch (NullSendArgumentsExeption e) {
                e.printStackTrace();
                return;
            }

        }

        if(cardNumber.replaceAll(" ", "").length() != 16) {
            try {
                success = false;
                throw new InvalidCardNumberExeption("Неверный номер карты");
            } catch (InvalidCardNumberExeption e) {
                e.printStackTrace();
            }
        }
        try(BufferedReader reader = new BufferedReader(new FileReader("cards.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                if (line.equals(cardNumber)) {
                    success = false;
                    throw new BlockedCardExeption("Перевод невозможен. Карта заблокирована");
                }
                line = reader.readLine();
            }
        }
        catch (BlockedCardExeption e) {
            e.printStackTrace();
        }
        if (money < 0) {
            try {
                success = false;
                throw new InvalidTransferAmountExeption("Введена отрицательная сумма перевода");
            } catch (InvalidTransferAmountExeption e) {
                e.printStackTrace();
            }
        }
        if (money > 50_000.0) {
            success = false;
            try {
                throw new TransferLimitExceededExeption("Превышен лимит в 50 тыс.");
            } catch (TransferLimitExceededExeption e) {
                e.printStackTrace();
            }
        }

        if(success)
            System.out.println("Операция проведена успешно");
    }

}
