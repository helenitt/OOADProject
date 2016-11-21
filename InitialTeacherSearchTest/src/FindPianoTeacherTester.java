import java.util.LinkedList;

/**
 * Created by t00183399 on 21/11/2016.
 */
public class FindPianoTeacherTester {

    public static void main(String[] args) {
        //PianoTeachers addTeacher = new PianoTeachers("Shane Clifford", "Tralee", 5, "08764559899");
        LinkedList<PianoTeachers> addTeachers = new LinkedList<>();

        addTeachers.add(new PianoTeachers("Shane Clifford", "Tralee", 5, "08764559899"));
        addTeachers.add(new PianoTeachers("Gary Healy", "Killarney", 5, "08767855545"));
        addTeachers.add(new PianoTeachers("Mary Black", "Tralee", 5, "087647567454"));
        addTeachers.add(new PianoTeachers("Billy Batts", "Listowel", 5, "0872585558"));

        //System.out.println(addTeachers);


        PianoTeachers testSearch = new PianoTeachers();
        testSearch.setArea("Tralee");

        if (testSearch != null) {
            if (testSearch.getTeachersName().equals(addTeachers.) ||
                    testSearch.getArea().equals(tes))


        } else {
            System.out.println("ERROR! Please try again");
        }


    }


}
