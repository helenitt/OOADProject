/**
 * Created by t00183399 Shane Clifford on 21/11/2016.
 */
public class PianoTeachers {

    private String teachersName;
    private String area;
    private int rating;
    private String phone;


    //contructor for default
    public PianoTeachers() {
       /* teachersName = "Null";
        area = "Null";
        rating = 0;
        phone = "null";*/

    }

//constructors

    public PianoTeachers(String teachersName, String area, int rating, String phone) {
        this.teachersName = teachersName;
        this.area = area;
        this.rating = rating;
        this.phone = phone;
    }


    public String getTeachersName() {
        return teachersName;
    }

    public void setTeachersName(String teachersName) {
        this.teachersName = teachersName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
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
        return "PianoTeachers{" +
                "teachersName='" + teachersName + '\'' +
                ", area='" + area + '\'' +
                ", rating=" + rating +
                ", phone='" + phone + '\'' +
                '}';
    }
}