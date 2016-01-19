import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nolan on 1/19/16.
 */
public class UserInterface {

    public boolean sort;
    public String[] arrIn;
    public UserInterface() {
        sort = false;
    }

    public void run() {
        Scanner user_input = new Scanner(System.in);
        System.out.println("What size Array would you like to create? (Please enter a positive number)");
        int size = user_input.nextInt();
        System.out.println("Would you like your array sorted? Yes/No");
        String YN = user_input.next();
        if ( YN.equalsIgnoreCase("yes") || YN.equalsIgnoreCase("y") ) sort = true;
        System.out.println("Please input each starting character (separated by spaces) for the words you'd like to generate in your preferred order:");
        String input = user_input.next();
        arrIn = input.split("[ ]+");
        System.out.println(Arrays.toString(arrIn));
        ArrayGenerator ag = new ArrayGenerator(arrIn, size, sort);
        ag.generate();


    }
    public static void main(String[] arg){
        UserInterface ui = new UserInterface();
        ui.run();

    }

    public boolean getSort() {
        return sort;
    }

    // Overloaded method for testing
    void run(int size, String YN, String[] arrIn) {
        System.out.println("What size Array would you like to create? (Please enter a positive number)");
        System.out.println("Test reply: " + size);
        System.out.println("Would you like your array sorted? Yes/No");
        System.out.println("Test reply: " + YN);
        if ( YN.equalsIgnoreCase("yes") || YN.equalsIgnoreCase("y") ) sort = true;
        ArrayGenerator ag = new ArrayGenerator(arrIn, size, sort);
        ag.generate();


    }

}

