package org.main;
import org.course.*;
import org.campuss.*;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Lecture
        Lecture lecture = new Lecture("John Doe", 40, "123 Main St", "EMP123");

        // Membuat objek Student
        Student student1 = new Student("Alice", 20, "456 Elm St", "S123");
        Student student2 = new Student("Bob", 22, "789 Oak St", "S456");

        // Membuat objek Course
        Course course = new Course("CSC101", "Introduction to Computer Science", lecture);

        // Menambahkan student ke course
        course.addStudent(student1);
        course.addStudent(student2);

        // Melakukan enroll course untuk student
        student1.enrollCourse(course);
        student2.enrollCourse(course);

        // Menampilkan course yang diambil oleh student
        System.out.println("Courses enrolled by " + student1.getName() + ":");
        student1.viewEnrolledCourses();

        // Menampilkan course yang diajarkan oleh lecture
        System.out.println("\nCourses taught by " + lecture.getName() + ":");
        lecture.teachCourse(course);
        lecture.viewTaughtCourses();
    }
}
