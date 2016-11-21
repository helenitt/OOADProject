/**
 * Created by t00183399 on 21/11/2016.
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class TeacherDirectory {

    private List teachers;

    public TeacherDirectory() {
        teachers = new LinkedList();
    }

    public void addTeachers(String teachersName, String area, int rating, String phone) {
        PianoTeachers newTeach = new PianoTeachers(teachersName, area, rating, phone);
        teachers.add(newTeach);


    }

    public PianoTeachers getTeacher(String area) {
        for (Iterator i = teachers.iterator(); i.hasNext(); ) {
            PianoTeachers teach = (PianoTeachers) i.next();
            {
                if (teach.getArea().equals((area)))
                    return teach;
            }
        }
        return null;
    }


    public PianoTeachers search(PianoTeachers searchTeacher) {
        for (Iterator i = teachers.iterator(); i.hasNext(); ) {
            PianoTeachers teach = (PianoTeachers) i.next();

            String teachersName = searchTeacher.getTeachersName();
            if ((teachersName != null) && (!teachers.equals("")) &&
                    (!teachersName.equals()))

        }


    }


}
