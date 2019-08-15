package lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.geekbrains.DataStructures.lesson3.queque.DequeImpl;

public class DequeueTests {
    private DequeImpl<Integer> deque;

    @BeforeEach
    public void prepare(){
        deque = new DequeImpl<>(5);
        deque.insert(1);
        deque.insert(3);
        deque.insert(4);
        deque.insert(7);
        deque.insert(6);
    }

    @Test
    public void testAdd(){
        Assertions.assertArrayEquals(new Integer[]{1, 3, 4, 7, 6}, deque.getArray());
    }


    @Test
    public void testInsertLeft(){
        Integer expected = 5;
        deque.removeLeft();
        Assertions.assertTrue(deque.insertLeft(expected));
    }

    @Test
    public void testInsertRight(){
        Integer expected = 9;
        deque.removeRight();
        Assertions.assertTrue(deque.insertRight(expected));
    }

    @Test
    public void testSize(){
        Assertions.assertEquals(5, deque.size());
    }

    @Test
    public void testIsEmpty(){
        Assertions.assertFalse(deque.isEmpty());
    }

    @Test
    public void testIsFull(){
        Assertions.assertTrue(deque.isFull());
    }
}
