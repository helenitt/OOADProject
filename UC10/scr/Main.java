import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by T00171641.
 */

public class Main {
    private static LinkedList<String> functions = new LinkedList<>();
    private static String action = "";
    private static boolean isExit = false;

    public static void main(String[] args)
    {
        print("===============================\n    Welcome in Piano World! \n===============================\n");

        functions.add("Register Account (Placeholder)");
        functions.add("Update Account (Placeholder)");
        functions.add("Deactivate Account (Placeholder)");
        functions.add("User Login (Placeholder)");
        functions.add("User Logout (Placeholder)");
        functions.add("Search For Teachers (Placeholder)");
        functions.add("Search Pianos for sale (Placeholder)");
        functions.add("Search Piano Tuners (Placeholder)");
        functions.add("Book Teacher (Placeholder)");
        functions.add(BuyPiano.getTitle());
        functions.add("Book Piano Tuner (Placeholder)");
        functions.add("Rate Teacher (Placeholder)");
        functions.add("Rate Tuner (Placeholder)");

        printFunctions();
        BuyPiano buyPiano = new BuyPiano();

        while(!isExit) {
            print("\nWhat you wish to do? (Type number to call function): ");
            Scanner sc = new Scanner(System.in);
            action = sc.nextLine();

            switch (action.toLowerCase()) {
                case "exit":
                    isExit = true;
                    break;
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case "11":
                case "12":
                case "13":
                    println("Not Implemented Yet");
                    break;
                case "10":
                    buyPiano.buyPiano(5, 5);
                    if(buyPiano.message != "") {
                        println(buyPiano.message);
                        buyPiano.message = "";
                    }
                    break;
                default:
                    println("No such a function");
                    break;
            }
        }
    }

    private static void printFunctions(){
        int i = 1;

        for (Object function: functions) {
            println(i + ". " + function);

            i++;
        }
    }

    private static void println(String text){
        System.out.println(text);
    }

    private static void print(String text){
        System.out.print(text);
    }

}