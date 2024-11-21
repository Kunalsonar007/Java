import java.util.Scanner;

public class BuiltInPackageDemo {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter your name: ");
      String name = sc.nextLine();

      System.out.print("Enter a number: ");
      int num = sc.nextInt();

      System.out.println("Hello, " + name + "!");
      System.out.println("Square of " + num + " is: " + (num * num));
    }
  }
}
