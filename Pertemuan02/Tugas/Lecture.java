import java.util.List;
import java.util.ArrayList;

public class Lecture {
    private String name;
    private int age;
    private String address;
    private int employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public void name(String name){
        this.name = name;
    }

    public void age(int age){
        this.age = age;
    }

    public void address(String address){
        this.address = address;
    }

    public void employeeID(int employeeID){
        this.employeeID = employeeID;
    }

    public String getName(){
        return name;
    }

    public void getDetails(){
        System.out.println("Nama: " + name);
        System.out.println("Umur: " + age);
        System.out.println("Alamat: " + address);
        System.out.println("ID Dosen: " + employeeID);
    }

    public void teachCourse(Course course) {
        coursesTaught.add(course);
    }

    public void viewTaughtCourses(){
        if (!coursesTaught.isEmpty()) {
            for (Course course : coursesTaught) {
                System.out.println("Nama Mata Kuliah: " + course.getCourseName());
                System.out.println("Kode Mata Kuliah: " + course.getCourseCode());
                System.out.println("Dosen Pengampu: " + course.getLecture().getName());
            }
        } else {
            System.out.println("Dosen belum mengajar mata kuliah apapun.");
        }
    }
}
