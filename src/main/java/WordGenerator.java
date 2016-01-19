import java.util.Random;

public class WordGenerator {
    String word;
    Random rand = new Random();
    public String generate(String s){
        word = s;
        int length = rand.nextInt(9);

        for (int i = 0; i < length; i++ ) {
            int nextl = (rand.nextInt(26) + 'a');
            word += String.valueOf((char) nextl);
        }
        return word;

    }

}
