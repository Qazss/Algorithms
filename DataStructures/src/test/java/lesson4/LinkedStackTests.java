package lesson4;

import lesson4.LinkedList.LinkedStackImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LinkedStackTests {
    private static LinkedStackImpl<Integer> stack;

    @BeforeAll
    public static void prepare(){
        stack = new LinkedStackImpl<>();
        stack.push(2);
        stack.push(5);
        stack.push(7);
        stack.push(9);
    }

    @Test
    public void pop(){
        Integer expected = 9;
        Assertions.assertEquals(expected, stack.pop());
    }

    @Test
    public void peekTest(){
        Integer expected = 7;
        Assertions.assertEquals(expected, stack.peek());
    }

    @Test
    public void sizeTest(){
        Assertions.assertEquals(3, stack.size());
    }

    @Test
    public void isEmptyTest(){
        Assertions.assertFalse(stack.isEmpty());
    }
}
