package ru.sber.lambdas;

public class ClassForFI {
    public static void main(String[] args) {
        FunctionalInterfaceOne FIOne = new FunctionalInterfaceOne() {
            @Override
            public void doNothing() {
                System.out.println("I did smth!");
            }
        };

        FunctionalInterfaceTwo FITwo = new FunctionalInterfaceTwo() {
            @Override
            public int doSmth(int value) {
                return value / 2;
            }
        };

        FunctionalInterfaceThree FIThree = new FunctionalInterfaceThree() {
            @Override
            public double doSmthWithSmth(int a, int b) {
                return a * b;
            }
        };

        FunctionalInterfaceThree FIThreeVer2 = (a, b) -> a * b;
        ClassForFI CFFI = new ClassForFI();
        CFFI.processOneNumber(FITwo);
        CFFI.processOneNumber(new FunctionalInterfaceTwo() {
            @Override
            public int doSmth(int value) {
                return value * 2;
            }
        });
        CFFI.processTwoNumbers(2, 3, (a, b) -> a * b);
    }

    public void process(FunctionalInterfaceOne function) {
        function.doNothing();
    }

    public void processOneNumber(FunctionalInterfaceTwo function) {
        function.doSmth(324);
    }

    public void processTwoNumbers(int a, int b, FunctionalInterfaceThree function) {
        function.doSmthWithSmth(a, b);
    }
}
