public class MemberInnerClassDemo {

  private String message = "Hello from Member Inner Class!";

  class Inner {

    void displayMessage() {
      System.out.println(message);
    }
  }

  public static void main(String[] args) {
    MemberInnerClassDemo outer = new MemberInnerClassDemo();
    MemberInnerClassDemo.Inner inner = outer.new Inner();
    inner.displayMessage();
  }
}
