public class LocalInnerClassDemo {

  void display() {
    class LocalInner {

      void showMessage() {
        System.out.println("Hello from the Local Inner Class!");
      }
    }

    LocalInner localInner = new LocalInner();
    localInner.showMessage();
  }

  public static void main(String[] args) {
    LocalInnerClassDemo demo = new LocalInnerClassDemo();
    demo.display();
  }
}
