package lesson4;

import lesson4.LinkedList.SimpleLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SimpleLinkedListTests {
    private static SimpleLinkedList<Integer> linkedList;

    @BeforeAll
    public static void prepare(){
        linkedList = new SimpleLinkedList<>();
        linkedList.insertFirst(2);
        linkedList.insertFirst(1); //1 2
        linkedList.insertFirst(4); //4 1 2
        linkedList.insertFirst(6); //6 4 1 2
        linkedList.insertFirst(3); //3 6 4 1 2
    }

    @Test
    public void removeFirstTest(){
        Integer expected = 3;
        Assertions.assertEquals(expected, linkedList.removeFirst());  // 6 4 1 2
    }

    @Test
    public void getFirstTest(){
        Integer expected = 6;
        Assertions.assertEquals(expected, linkedList.getFirstValue());
    }

    @Test
    public void sizeTest(){
        Assertions.assertEquals(4, linkedList.size());
    }

    @Test
    public void containsTest(){
        Assertions.assertTrue(linkedList.contains(1));
    }

    @Test
    public void forEachTest(){
        int[] array = new int[4];

        int i = 0;
        for(Integer num: linkedList){
            array[i] = num;
            i++;
        }

        Assertions.assertArrayEquals(new int[]{6, 4, 1, 2}, array);
    }

    @Test
    public void removeTest(){
        Assertions.assertTrue(linkedList.remove(1)); // 6 4 2
    }
}
