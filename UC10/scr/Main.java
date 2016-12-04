import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Created by T00171641.
 */

public class Main {
    public static LinkedList<String> functions = new LinkedList<>();

    public static void main(String[] args)
    {
        System.out.println("===============================\n    Welcome in Piano World! \n===============================\n");

        functions.add("Register Account");
        functions.add("Update Account");
        functions.add("Deactivate Account");
        functions.add("User Login");
        functions.add("User Logout");
        functions.add("Search For Teachers");
        functions.add("Search Pianos for sale");
        functions.add("Search Piano Tuners");
        functions.add("Book Teacher");
        functions.add(BuyPiano.getTitle());
        functions.add("Book Piano Tuner");
        functions.add("Rate Teacher");
        functions.add("Rate Tuner");

        printFunctions();
    }

    public static void printFunctions(){
        int i = 1;

        for (Object function: functions) {
            System.out.println(i + ". " + function);

            i++;
        }
    }

}
