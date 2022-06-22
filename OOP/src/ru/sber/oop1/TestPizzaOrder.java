package ru.sber.oop1;

public class TestPizzaOrder {
    public static void main(String[] args) {
        PizzaOrder FirstOrder = new PizzaOrder("Флорентина", PizzaSize.BIG,true,"Ярославская 101");
        FirstOrder.order();
        FirstOrder.setNeedForSauce(false);
        FirstOrder.order();
        PizzaOrder SecondOrder = new PizzaOrder("Сырная", PizzaSize.SMALL,false,"Ленинградская 101");
        SecondOrder.order();
    }
}
