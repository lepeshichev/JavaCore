package classesAndTests;

import java.util.NoSuchElementException;

public class AnotherClass {
    private String ID = "374528934578";

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int print2x2() {
        SomeClass sc = new SomeClass();
        sc.doSmth();
        sc.doSmth();
        return 2*2;
    }
    public void throwExeption(String s) {
        if (s == null)
            throw new NoSuchElementException("asd");
    }

    private String privateMethod() {
        return "asdasd";
    }

    public static void main(String[] args) {
        AnotherClass ac = new AnotherClass();
        System.out.println(ac.getID());
        ac.setID("54");
        System.out.println(ac.getID());

        SomeClass sc = new SomeClass();
        sc.doSmth();
        sc.doSmth();
        int b = 2;
        System.out.println(sc.getVarForTest());
        sc.setVarForTest(b);
        System.out.println(sc.getVarForTest());
        sc.doSmth();
    }
}
