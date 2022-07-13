package Tests;

import org.junit.Test;
import ru.sber.Reflection.Tree;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TreeTest {
    @Test
    public void TestOne() {
        Tree tree = new Tree(1);
        try {
            Field field = Tree.class.getDeclaredField("leaf");
            field.setAccessible(true);
            field.set(tree, 3);
            int leaf = (int) field.get(tree);
            System.out.println(leaf);
            System.out.println(tree.getClass().getField("size"));
            System.out.println(tree.getClass().getDeclaredField("root").getType());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void TestTwo() {
        Tree tree = new Tree(1);
        try {
            Method method = tree.getClass().getDeclaredMethod("printSmth");
            method.setAccessible(true);
            System.out.println(method.invoke(tree));
            System.out.println(Arrays.toString(tree.getClass().getSuperclass().getDeclaredMethods()));
            System.out.println(Arrays.toString(method.getExceptionTypes()));
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void TestThree() {
        try {
            Constructor<Tree> privateConstructor = Tree.class.getDeclaredConstructor(String.class);
            privateConstructor.setAccessible(true);
            Tree tr = privateConstructor.newInstance("asd");
            Class<Tree> anotherTree = Tree.class;
            Constructor<Tree> publicConstructor = anotherTree.getConstructor(int.class);
            System.out.println(publicConstructor);
            Class<?>[] parameterTypes = publicConstructor.getParameterTypes();
            System.out.println(Arrays.toString(parameterTypes));
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}