/**
 * Created by t00183399 on 21/11/2016.
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class TeacherDirectory {

    private final List<PianoTeachers> teachers;

    public TeacherDirectory() {
        teachers = new LinkedList<>();


    }



    public void addTeachers(String teachersName, String area, int rating, String phone) {
        PianoTeachers newTeach = new PianoTeachers(teachersName, area, rating, phone);
        teachers.add(newTeach);


    }

    public PianoTeachers getTeacher(String area) {
        for (PianoTeachers teach : teachers) {
            {
                if (teach.getArea().equals((area)))
                    return teach;
            }
        }
        return null;
    }


    public List<PianoTeachers> search(PianoTeachers searchTeacher) {
        List<PianoTeachers> foundTeach = new LinkedList<>();
        for (PianoTeachers teach : teachers) {
            if (teach.getPhone().matches(searchTeacher.getPhone()))
                foundTeach.add((teach));

        }


    return foundTeach;}


}
