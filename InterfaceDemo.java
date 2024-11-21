interface Animal {
  void sound();
  void eat();
}

class Dog implements Animal {

  public void sound() {
    System.out.println("Dog barks");
  }

  public void eat() {
    System.out.println("Dog eats food");
  }
}

public class InterfaceDemo {

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.sound();
    dog.eat();
  }
}
