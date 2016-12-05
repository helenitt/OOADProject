import java.util.*;
import javax.swing.JOptionPane;

/**
 * Created by t00183399 on 21/11/2016.
 */
public class FindPianoTeacherTester {

    public static void main(String[] args) {
		String[] choices = { "TRALEE", "DINGLE", "KILLARNEY" };

        TeacherDirectory teachDir = new TeacherDirectory();
        //Scanner in = new Scanner(System.in);

        String area =  String input = (String) JOptionPane.showInputDialog(null, "Choose a location",
        "Teacher Location", JOptionPane.QUESTION_MESSAGE, null,
        choices, // Array of choices
        choices[0]); // Initial choice;

        
        System.out.println("These teachers are available in your area " + teachDir.getByArea(Locations.valueOf(area)));

    }
}













