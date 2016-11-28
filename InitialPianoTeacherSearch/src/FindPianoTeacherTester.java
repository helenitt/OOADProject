import java.util.*;

/**
 * Created by t00183399 on 21/11/2016.
 */
public class FindPianoTeacherTester {

    public static void main(String[] args) {


        TeacherDirectory teachDir = new TeacherDirectory();
        Scanner in = new Scanner(System.in);

        String area;

        System.out.println("Please enter the area to search ");
         area = in.nextLine();
        System.out.println("These teachers are available in your area" + teachDir.getByArea(area));

    }
}













