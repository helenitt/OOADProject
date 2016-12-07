/*
  Created by t00183399 on 21/11/2016.
 */

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class TeacherDirectory {

    private final List<PianoTeachers> teachers;

    private final List<PianoTeachers> matchingTeacher;


    public TeacherDirectory() {
        teachers = new LinkedList<>();
        matchingTeacher = new LinkedList<>();
        addTeachers("Shane Clifford", Locations.TRALEE, 5, "087923255");
        addTeachers("Marcel Proust", Locations.KILLARNEY, 4, "08655953112");
        addTeachers("Gustave Flaubert", Locations.KILLARNEY, 3, "086912333");
        addTeachers("Leo Tolstoy", Locations.TRALEE, 2, "08544587524");
        addTeachers("Anton Chekhov", Locations.DINGLE, 1, "089454448");
        addTeachers("Billy Bremner", Locations.DINGLE, 3, "08978896438");
        addTeachers("Richard Pryor", Locations.TRALEE, 4, "0892445712");
        addTeachers("Frank Butcher", Locations.TRALEE, 5, "0872582551");
        addTeachers("Jim Bowen", Locations.KILLARNEY, 2, "0864788788");
        addTeachers("Frank Stallone", Locations.DINGLE, 3, "0866336987");
        addTeachers("Albert Fish", Locations.TRALEE, 2, "0857455122");
        addTeachers("Albert Camus", Locations.KILLARNEY, 1, "0898996456");
        addTeachers("Steve Martin", Locations.DINGLE, 3, "087873335274");
        addTeachers("Fidel Castro", Locations.KILLARNEY, 4, "0879866899");




    }



    private void addTeachers(String teachersName, Locations area, int rating, String phone) {
        PianoTeachers newTeach = new PianoTeachers(teachersName, area, rating, phone);
        teachers.add(newTeach);


    }

    public String getByArea(Locations area) {
        matchingTeacher.addAll(teachers.stream().filter(teach -> teach.getArea().equals((area))).collect(Collectors.toList()));
        return matchingTeacher.toString();
    }





    public List<PianoTeachers> search(PianoTeachers searchTeacher) {
        return teachers.stream().filter(teach -> teach.getPhone().matches(searchTeacher.getPhone())).map(teach -> (teach)).collect(Collectors.toCollection(LinkedList::new));}
}
