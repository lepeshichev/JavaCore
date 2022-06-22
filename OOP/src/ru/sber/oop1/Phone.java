package ru.sber.oop1;

public class Phone {

    private int number;
    private String model;
    private double weight;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public int getNumber() {
        return number;
    }

    void receiveCall(String name) {
        System.out.printf("Звонит %s%n",name);
    }

    void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + " по номеру " +number);
    }

    void sendMessage(int[] numbers) {
        for (int each : numbers) {
            System.out.println(each);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
