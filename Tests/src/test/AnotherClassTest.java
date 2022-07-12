package test;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.Invocation;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.reflect.Whitebox;
import ru.sber.classesAndTests.AnotherClass;
import ru.sber.classesAndTests.SomeClass;

import java.util.Collection;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class AnotherClassTest {
    private static final String TEST_ID = "374528934578";

    @Test // Task 1
    public void testGetAndSetID() {
        AnotherClass ac = new AnotherClass();
        ac.setID("567");
        int value = Integer.parseInt(ac.getID());
        assertEquals(567, value);
    }

    @Test // Task 1
    public void testingMock() {
        AnotherClass ac = mock(AnotherClass.class);
        when(ac.getID()).thenReturn(TEST_ID);
        assertEquals(TEST_ID, ac.getID());
    }

    @Test // Task 1
    public void getSpiedID() {
        AnotherClass ac = spy(AnotherClass.class);
        ac.getID();
        ac.getID();
        verify(ac, times(2)).getID();
    }

    @Test // Task 1
    public void testPrint2x2() {
        SomeClass sc =  mock(SomeClass.class);
        when(sc.doSmth()).thenReturn(3);
    }

    @Test // task 2
    public void getNumberOfCallsToMethodsOfOtherClasses() {
        AnotherClass ac = mock(AnotherClass.class);
        ac.print2x2();
        Collection<Invocation> invocations = Mockito.mockingDetails(ac).getInvocations();
        System.out.println(invocations.size());
    }

    @Test(expected = NoSuchElementException.class) // task 3
    public void testExeptionMethod() {
        AnotherClass ac = new AnotherClass();
        ac.throwExeption(null);
    }

    @Test // task 4
    public void testPrivateMethod() {
        String key = "asdasd";
        AnotherClass ac = PowerMockito.mock(AnotherClass.class);
        try {
            PowerMockito.when(ac, "privateMethod").thenReturn(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String result = null;
        try {
            result = Whitebox.invokeMethod(ac, "privateMethod");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(key, result);
    }
}
