import java.util.Scanner;

public class Fibonacci {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number of terms: ");
      int terms = sc.nextInt();

      int first = 0, second = 1;
      System.out.print("Fibonacci Series: " + first + ", " + second);

      for (int i = 2; i < terms; i++) {
        int next = first + second;
        System.out.print(", " + next);
        first = second;
        second = next;
      }
    }
  }
}
