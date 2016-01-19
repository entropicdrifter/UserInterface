import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Arrays;


/**
 * Created by nolan on 1/19/16.
 */
public class ArrayGeneratorSpec {

    @Test
    public void arrayGeneratorTest() {
        ArrayGenerator ag = new ArrayGenerator(new String[] {"a", "q", "p", "l", "m"}, 5, false );
        ag.generate();
        String[] test = ag.getArray();
        assertTrue(test.length == 5 && test[0].startsWith("a"));
    }

    @Test
    public void arrayGeneratorSortTest() {
        ArrayGenerator ag = new ArrayGenerator(new String[] {"a", "q", "p", "l", "m"}, 5, true );
        ag.generate();
        String[] test = ag.getArray();
        assertTrue(test.length == 5 && test[0].startsWith("a") && test[4].startsWith("q"));
    }


    @Test
    public void arrayGeneratorLengthTest() {
        ArrayGenerator ag = new ArrayGenerator(new String[] {"a", "q", "p", "l", "m"}, 10, false );
        ag.generate();
        String[] test = ag.getArray();
        assertTrue(test.length == 10 && test[0].startsWith("a"));
    }


}
