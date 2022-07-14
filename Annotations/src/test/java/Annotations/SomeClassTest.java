package Annotations;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Map;

public class SomeClassTest {
    @Test
    public void TestOne() {
        SomeClass sc = new SomeClass();
        Map<Method, Integer> map;
        map = sc.getMap();
        sc.printData(map);
    }

    @Test
    public void TestTwo() {
        SomeClass sc = new SomeClass();
        Map<Method, Integer> map;
        map = sc.getMap();
        sc.doCommandsLesserThenNumberAndNumberMethod(map, 3);
    }
}
