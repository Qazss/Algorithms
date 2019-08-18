package lesson4;

import lesson4.LinkedList.TwoSideLinkedList;
import lesson4.LinkedList.TwoSideLinkedListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TwoSideLinkedListTests {
    private static TwoSideLinkedList<Integer> linkedList;

    @BeforeAll
    public static void prepare(){
        linkedList = new TwoSideLinkedListImpl<>();
        linkedList.insertLast(2);
        linkedList.insertLast(3); // 2 3
        linkedList.insertFirst(5); // 5 2 3
        linkedList.insertFirst(7);  // 7 5 2 3
        linkedList.insertLast(9);  // 7 5 2 3 9
    }

    @Test
    public void removeFirst(){
        Integer expected = 7;
        Assertions.assertEquals(expected, linkedList.removeFirst());
    }

    @Test
    public void sizeTest(){
        Assertions.assertEquals(4, linkedList.size());
    }

    @Test
    public void removeTest(){
        Assertions.assertTrue(linkedList.remove(2));
    }
}
