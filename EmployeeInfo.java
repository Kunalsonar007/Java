class Employee {

  String name;
  int empId;
  double salary;

  void displayDetails() {
    System.out.println("Employee Name: " + name);
    System.out.println("Employee ID: " + empId);
    System.out.println("Salary: " + salary);
  }
}

public class EmployeeInfo {

  public static void main(String[] args) {
    Employee emp = new Employee();
    emp.name = "John Doe";
    emp.empId = 12345;
    emp.salary = 75000.00;
    emp.displayDetails();
  }
}
