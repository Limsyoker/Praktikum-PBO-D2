public class Main {
    public static void main(String[] args) {
      Lecture Alex = new Lecture("Alex", 54, "Tembalang", 188084);
      Lecture Ben = new Lecture("Ben", 56, "Banyumanik", 195623);
      
      Student Chris = new Student("Chris", 19, "Ngesrep Timur", 855081);
      Student Daniel = new Student("Daniel", 19, "Gondang Barat", 855170);
      Student Eric = new Student("Eric", 19, "Gondang Timur", 854190);
      
      Course bk101 = new Course("BK101", "Intro to Computer Science",Alex);
      Course bk102 = new Course("BK102", "Data Structures",Alex);
      Course bk103 = new Course("BK103", "Algorithms", Alex);
      
      Chris.enrollInCourse(bk103);
      
      Alex.teachCourse(bk101);
      Alex.teachCourse(bk102);
      Ben.teachCourse(bk103);
  
      bk101.addStudent(Chris);
      bk101.addStudent(Daniel);
      bk101.addStudent(Eric);
  
      bk102.addStudent(Chris);
      bk102.addStudent(Daniel);
  
      bk103.addStudent(Chris);
  
      Chris.viewEnrolledCourses();
      Alex.viewTaughtCourses();
      bk103.viewEnrolledStudents();
    }
  }
  