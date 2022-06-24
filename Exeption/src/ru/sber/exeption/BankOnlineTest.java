package ru.sber.exeption;

import java.io.IOException;

public class BankOnlineTest {
    public static void main(String[] args) throws IOException {
        BankOnline bo = new BankOnline();
        try {
            bo.send("1234 1234 4123 1234",10.0);
            //bo.send("1234 1234 4123 123",10.0);
            //bo.send("3333 3333 3333 3333",10.0);
            bo.send("1234 1234 4123 1234",-1.0);
            //bo.send("1234 1234 4123 1234", 50_000.1);
            //bo.send(null, null);
        } catch (NullSendArgumentsExeption e) {
            e.printStackTrace();
        } catch (InvalidCardNumberExeption e) {
            e.printStackTrace();
        } catch (BlockedCardExeption e) {
            e.printStackTrace();
        } catch (InvalidTransferAmountExeption e) {
            e.printStackTrace();
        } catch (TransferLimitExceededExeption e) {
            e.printStackTrace();
        }
    }

}
