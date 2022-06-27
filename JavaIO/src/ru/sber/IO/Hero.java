package ru.sber.IO;

import ru.sber.IO.armour.Armour;

import java.io.Serializable;

public class Hero implements Serializable {
    String name;
    int lvl;
    Armour armour;

    public Hero(String name, int lvl) {
        this.name = name;
        this.lvl = 1;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", lvl=" + lvl +
                ", armour=" + armour +
                '}';
    }
}
