import java.util.List;
import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String address;
    private int studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, int studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
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

    public void studentID(int studentID){
        this.studentID = studentID;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getAddress(){
        return address;
    }

    public int getStudentID(){
        return studentID;
    }

    public void getDetails(){
        System.out.println("Nama: " + name);
        System.out.println("Umur: " + age);
        System.out.println("Alamat: " + address);
        System.out.println("ID Mahasiswa: " + studentID);    
    }

    public void enrollInCourse(Course course) {
        coursesEnrolled.add(course);
    }

    public void viewEnrolledCourses(){
        if (!coursesEnrolled.isEmpty()) {
            for (Course course : coursesEnrolled) {
                System.out.println("Nama Mata Kuliah: " + course.getCourseName());
                System.out.println("Kode Mata Kuliah: " + course.getCourseCode());
                System.out.println("Dosen Pengampu: " + course.getLecture().getName());
            }
        } else {
            System.out.println("Mahasiswa belum mengambil mata kuliah apapun.");
        }
    }
}