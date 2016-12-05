import java.util.*;

/**
 * Created by t00183399 on 21/11/2016.
 */
public class FindPianoTeacherTester {

    public static void main(String[] args) {
        //PianoTeachers addTeacher = new PianoTeachers("Shane Clifford", "Tralee", 5, "08764559899");
        // List<TeacherDirectory> lstTeachers = new LinkedList<>();
        //LinkedList<PianoTeachers> pT = new LinkedList<>();

        //PianoTeachers pT = new PianoTeachers();

        TeacherDirectory teachDir = new TeacherDirectory();

        teachDir.addTeachers("Shane Clifford", "Tralee", 5, "0879899986");
        teachDir.addTeachers("Marcel Proust", "Tralee", 5, "0879899986");
        teachDir.addTeachers("Gustave Flaubert", "Killarney", 5, "0879899986");
        teachDir.addTeachers("Leo Tolstoy", "Tralee", 5, "0879899986");
        teachDir.addTeachers("Anton Chekhov", "Dingle", 5, "0879899986");


        Scanner in = new Scanner(System.in);


        String area;

        System.out.println("Please enter the area to search ");
        area = in.nextLine();

        System.out.println(teachDir.getTeacher(area) == null ? "Sorry no teachers in this area" : "These teachers are in your area: " + teachDir.getTeacher(area));



    }
}


        //System.out.println(addTeachers);




       // PianoTeachers testSearch = new PianoTeachers();
      //  testSearch.setArea(area);

    //    System.out.println("These teachers are in your area: " +  );

 /*       if (!addTeachers.equals(null)) {

            for (PianoTeachers p : addTeachers
                    ) {
                if (p.getArea().matches(testSearch.getArea()))
                    System.out.print(p.toString() + "\n");

            }
        }
            else
                System.out.print("Sorry no teachers in this location");


        }

                */






