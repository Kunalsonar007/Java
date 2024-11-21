class Student {

  String name;
  int rollNumber;
  String course;

  void displayInfo() {
    System.out.println("Student Name: " + name);
    System.out.println("Roll Number: " + rollNumber);
    System.out.println("Course: " + course);
  }
}

public class StudentInfo {

  public static void main(String[] args) {
    Student student = new Student();
    student.name = "Alice";
    student.rollNumber = 101;
    student.course = "Computer Science";
    student.displayInfo();
  }
}
