class Person {

  String name;
  int age;

  void display() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }
}

public class ClassObjectDemo {

  public static void main(String[] args) {
    Person p = new Person();
    p.name = "John";
    p.age = 25;
    p.display();
  }
}
