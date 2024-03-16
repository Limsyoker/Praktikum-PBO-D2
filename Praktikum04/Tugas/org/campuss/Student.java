package org.campuss;
import java.util.ArrayList;
import java.util.List;

import org.person.Person;
import org.course.*;

public class Student extends Person {
    private String studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, String studentID) {
        super(name, age, address);
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
    }

    public List<Course> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void viewEnrolledCourses() {
        for (Course course : coursesEnrolled) {
            System.out.println(course.getCourseName());
        }
    }
}
