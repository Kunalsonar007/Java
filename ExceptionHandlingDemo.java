public class ExceptionHandlingDemo {

  public static void main(String[] args) {
    try {
      int num = 10;
      int divisor = 0;
      System.out.println("Result: " + (num / divisor));
    } catch (ArithmeticException e) {
      System.out.println(
        "Arithmetic Exception: Division by zero is not allowed."
      );
    } finally {
      System.out.println("Execution completed.");
    }
  }
}
