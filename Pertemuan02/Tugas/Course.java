import java.util.List;
import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List <Student> studentsEnrolled;

    public Course(String courseCode, String courseName, Lecture lecture) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }
 
    public void courseCode(String courseCode){
        this.courseCode = courseCode;
    }

    public void courseName(String courseName){
        this.courseName = courseName;
    }

    public void lecture(Lecture lecture){
        this.lecture = lecture;
    }

    public String getCourseCode(){
        return courseCode;
    }

    public String getCourseName(){
        return courseName;
    }

    public Lecture getLecture(){
        return lecture;
    }

    public void getDetails(){
        System.out.println("Kode Mata Kuliah: " + courseCode);
        System.out.println("Nama Mata Kuliah: " + courseName);
        System.out.println("Dosen Pengampu: " + lecture);
    }

    public void addStudent(Student student){
        studentsEnrolled.add(student);
    }

    public void removeStudent(Student student){
        studentsEnrolled.remove(student);
    } 

    public void viewEnrolledStudents(){
        if (!studentsEnrolled.isEmpty()) {
            for (Student student : studentsEnrolled) {
                System.out.println("Nama: " + student.getName());
                System.out.println("Umur: " + student.getAge());
                System.out.println("Alamat: " + student.getAddress());
                System.out.println("ID Mahasiswa: " + student.getStudentID());
            }
        } else {
            System.out.println("Belum ada mahasiswa yang terdaftar pada mata kuliah ini.");
        }
    }
}
