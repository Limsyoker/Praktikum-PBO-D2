package org.campuss;

import java.util.ArrayList;
import java.util.List;

import org.course.Course;
import org.person.Person;

public class Lecture extends Person {
    private String employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, String employeeID) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public void teachCourse(Course course) {
        coursesTaught.add(course);
    }

    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void viewTaughtCourses() {
        for (Course course : coursesTaught) {
            System.out.println(course.getCourseName());
        }
    }
}
