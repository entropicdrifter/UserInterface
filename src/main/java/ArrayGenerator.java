import java.util.Arrays;

public class ArrayGenerator {

    private int size = 0;
    private boolean sort = false;
    private String[] arrIn;
    private String[] arrOut;

    public ArrayGenerator(String[] arrIn, int size, boolean sort) {
        this.sort = sort;
        this.arrIn = arrIn;
        this.size = size;
        this.arrOut = new String[size];
    }
    public void generate() {
        WordGenerator wg = new WordGenerator();
        int j = 0;
    for (int i = 0; i < size; i++) {
        arrOut[i] = wg.generate(arrIn[j]);
        j++;
        if(j >= arrIn.length){
            j = 0;
        }
    }
        System.out.println(Arrays.toString(arrOut));

        if (sort) sortArray();

    }
    private void sortArray() {

        System.out.println("Sorting...");

        Arrays.sort(arrOut);

        System.out.println(Arrays.toString(arrOut));
    }
    public String[] getArray(){
        return arrOut;
    }

}

