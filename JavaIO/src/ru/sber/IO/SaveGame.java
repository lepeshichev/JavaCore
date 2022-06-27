package ru.sber.IO;

import ru.sber.IO.armour.SteelArmour;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveGame {
    public static void main(String[] args) {
        Hero hero = new Hero("MyChar", 1);
        hero.setLvl(10);
        hero.setArmour(new SteelArmour());
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("save.bin"))) {
            oos.writeObject(hero);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
