package ru.sber.oop1;

import java.util.ArrayList;
import java.util.List;

public class PizzaOrder {
    private String name;
    private PizzaSize size;
    private boolean needForSauce;
    private String address;
    boolean isOrderAccepted;
    List<String> addresses = new ArrayList<>();

    public PizzaOrder(String name, PizzaSize size, boolean needForSauce, String address) {
        this.name = name;
        this.size = size;
        this.needForSauce = needForSauce;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public boolean isNeedForSauce() {
        return needForSauce;
    }

    public void setNeedForSauce(boolean needForSauce) {
        this.needForSauce = needForSauce;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    void order() {
        if (!addresses.contains(getAddress())) {
            isOrderAccepted = true;
            addresses.add(address);
            if (!needForSauce && (getSize() == PizzaSize.BIG))
                System.out.println("Ваш заказ принят! Большая " +
                        getName() + " без соуса на адрес: " + getAddress());
            if (!needForSauce && (getSize() == PizzaSize.MEDIUM))
                System.out.println("Ваш заказ принят! Средняя " +
                        getName() + " без соуса на адрес: " + getAddress());
            if (!needForSauce && (getSize() == PizzaSize.SMALL))
                System.out.println("Ваш заказ принят! Маленькая " +
                        getName() + " без соуса на адрес: " + getAddress());
            if (needForSauce && (getSize() == PizzaSize.BIG))
                System.out.println("Ваш заказ принят! Большая " +
                        getName() + " с соусом на адрес: " + getAddress());
            if (needForSauce && (getSize() == PizzaSize.MEDIUM))
                System.out.println("Ваш заказ принят! Средняя " +
                        getName() + " с соусом на адрес: " + getAddress());
            if (needForSauce && (getSize() == PizzaSize.SMALL))
                System.out.println("Ваш заказ принят! Маленькая " +
                        getName() + " с соусом на адрес: " + getAddress());
        } else {
            isOrderAccepted = false;
            cancel();
        }
    }

    void cancel() {
        if (!isOrderAccepted)
            System.out.println("Заказ уже принят");
        else
            System.out.println("Заказ отменен");
    }

}
