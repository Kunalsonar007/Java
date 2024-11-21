public class FunctionOverloading {

  public static void main(String[] args) {
    FunctionOverloading obj = new FunctionOverloading();
    System.out.println("Sum of 2 numbers: " + obj.add(10, 20));
    System.out.println("Sum of 3 numbers: " + obj.add(10, 20, 30));
  }

  int add(int a, int b) {
    return a + b;
  }

  int add(int a, int b, int c) {
    return a + b + c;
  }
}
