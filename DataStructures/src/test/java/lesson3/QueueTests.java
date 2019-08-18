package lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.geekbrains.DataStructures.lesson3.queque.QueueImpl;

public class QueueTests {
    private QueueImpl<Integer> queue;

    @BeforeEach
    public void prepare(){
        queue = new QueueImpl<>(5);
        queue.insert(1);
        queue.insert(3);
        queue.insert(4);
        queue.insert(7);
        queue.insert(6);
    }

    @Test
    public void testAdd(){
        Assertions.assertArrayEquals(new Integer[]{1, 3, 4, 7, 6}, queue.getArray());
    }

    @Test
    public void testPeek(){
        Integer expected = 1;
        Assertions.assertEquals(expected, queue.peek());
    }

    @Test
    public void testRemove(){
        Integer expected = 1;
        Assertions.assertEquals(expected, queue.remove());
    }

    @Test
    public void testSize(){
        Assertions.assertEquals(5, queue.size());
    }

    @Test
    public void testIsEmpty(){
        Assertions.assertFalse(queue.isEmpty());
    }

    @Test
    public void testIsFull(){
        Assertions.assertTrue(queue.isFull());
    }
}
