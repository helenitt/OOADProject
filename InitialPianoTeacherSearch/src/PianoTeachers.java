/**
 * Created by t00183399 Shane Clifford on 21/11/2016.
 */
public class PianoTeachers implements PianoPerson{

    private String teachersName;
    private Locations area;
    private int rating;
    private String phone;



    public PianoTeachers() {


    }



    public PianoTeachers(String teachersName, Locations area, int rating, String phone) {
        this.teachersName = teachersName;
        this.area = area;
        this.rating = rating;
        this.phone = phone;
    }


    public String getName() {
        return teachersName;
    }

    public void setName(String teachersName) {
        this.teachersName = teachersName;
    }

    public Locations getArea() {
        return area;
    }

    public void setArea(Locations area) {
        this.area = area;
    }


    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return
                "\nTeachers Name : " + teachersName + '\n' +
                "Area : " + area + '\n' +
                "Rating : " + rating + "\n" +
                "Phone : " + phone;

    }
}
