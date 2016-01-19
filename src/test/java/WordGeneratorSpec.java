import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by nolan on 1/19/16.
 */
public class WordGeneratorSpec {


    @Test
    public void generateTest() {
        WordGenerator wg = new WordGenerator();
        String word = wg.generate("s");
        assertTrue("Generated word must be within expected parameters.", (0 < word.length() && word.length() < 11 && word.startsWith("s")));
        System.out.println(word);
    }
}
