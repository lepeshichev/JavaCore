package Annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@SomeAnnotation(command = "Class", queueNumber = 10)
public class SomeClass {
    @SomeAnnotation(command = "Do", queueNumber = 5)
    public int doThings() {
        return 4;
    }

    @SomeAnnotation(command = "print", queueNumber = 2)
    public void printOne() {
        System.out.println(1);
    }

    @SomeAnnotation(command = "return", queueNumber = 3)
    public double returnDouble() {
        System.out.println("asdasd");
        return 56.34;
    }

    public Map<Method, Integer> getMap() {
        Map<Method, Integer> map = new HashMap<>();
        Method[] methods = SomeClass.class.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(SomeAnnotation.class)) {
                map.put(method, method.getAnnotation(SomeAnnotation.class).queueNumber());
            }
        }
        return map;
    }

    public void printData(Map<Method, Integer> map) {
        map = getMap();
        map.forEach((key, value) -> System.out.println(key + " " + value));
    }

    public void doCommandsLesserThenNumberAndNumberMethod(Map<Method, Integer> map, int number) {
        map = getMap();
        for (Map.Entry<Method, Integer> entry : map.entrySet()) {
            if(entry.getValue() < number) {
                try {
                    entry.getKey().invoke(new SomeClass());
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        //вызов самого метода
        for (Map.Entry<Method, Integer> entry : map.entrySet()) {
            if(entry.getValue() == number) {
                try {
                    entry.getKey().invoke(new SomeClass());
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
