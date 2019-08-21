package lesson4;

import lesson4.LinkedList.LinkedQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedQueueTests {
    private LinkedQueue<Integer> queue;

    @BeforeEach
    public void prepare(){
        queue = new LinkedQueue<>();
        queue.insert(3);
        queue.insert(4);
        queue.insert(6);
        queue.insert(1);
    }

    @Test
    public void peekTest(){
        Integer expected = 3;
        Assertions.assertEquals(expected, queue.peek());
    }

    @Test
    public void removeTest(){
        Integer expected = 3;
        Assertions.assertEquals(expected, queue.remove());
    }

    @Test
    public void isEmptyTest(){
        Assertions.assertFalse(queue.isEmpty());
    }

    @Test
    public void sizeTest(){
        Assertions.assertEquals(4, queue.size());
    }
}
