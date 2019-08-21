package lesson3;

import org.junit.Test;
import ru.geekbrains.DataStructures.lesson3.HomeWork.InvertReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvertReaderTests {


    @Test
    public void testShortWord(){
        InvertReader reader = new InvertReader("Привет");
        String test = reader.getInvertText();
        String expected = "тевирП";
        assertEquals(test, expected);
    }

    @Test
    public void testPhrase(){
        InvertReader reader = new InvertReader("Как твои дела?");
        String test = reader.getInvertText();
        String expected = "?алед иовт каК";
        assertEquals(test, expected);
    }


}
