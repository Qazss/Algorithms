package lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.geekbrains.DataStructures.lesson3.stack.StackImpl;

public class StackTests {
    private StackImpl<Integer> stack;

    @BeforeEach
    public void prepare(){
        stack = new StackImpl<>(5);
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(7);
        stack.push(1);
    }

    @Test
    public void testAdd(){
        Assertions.assertArrayEquals(new Integer[]{3, 2, 5, 7, 1}, stack.getArray());
    }

    @Test
    public void testPeek(){
        Integer expected = 1;
        Assertions.assertEquals(expected, stack.peek());
    }

    @Test
    public void testRemove(){
        Integer expected = 1;
        Assertions.assertEquals(expected, stack.pop());
    }

    @Test
    public void testSize(){
        Assertions.assertEquals(5, stack.size());
    }

    @Test
    public void testIsEmpty(){
        Assertions.assertFalse(stack.isEmpty());
    }

    @Test
    public void testIsFull(){
        Assertions.assertTrue(stack.isFull());
    }
}
