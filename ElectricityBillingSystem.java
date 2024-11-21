import java.util.Scanner;

class Consumer {

  private String consumerName;
  private int consumerID;
  private int unitsConsumed;
  private double billAmount;

  // Constructor
  public Consumer(String consumerName, int consumerID, int unitsConsumed) {
    this.consumerName = consumerName;
    this.consumerID = consumerID;
    this.unitsConsumed = unitsConsumed;
    this.billAmount = calculateBill();
  }

  // Method to calculate the bill based on units consumed
  private double calculateBill() {
    double rate;
    if (unitsConsumed <= 100) {
      rate = 1.5; // Rate for first 100 units
    } else if (unitsConsumed <= 300) {
      rate = 2.5; // Rate for 101-300 units
    } else {
      rate = 4.0; // Rate for above 300 units
    }
    return unitsConsumed * rate;
  }

  // Method to display consumer details and bill
  public void displayBill() {
    System.out.println("Electricity Bill");
    System.out.println("----------------");
    System.out.println("Consumer Name: " + consumerName);
    System.out.println("Consumer ID: " + consumerID);
    System.out.println("Units Consumed: " + unitsConsumed);
    System.out.println("Total Bill Amount: Rs. " + billAmount); // Replaced ₹ with Rs.
  }
}

public class ElectricityBillingSystem {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input consumer details
    System.out.print("Enter Consumer Name: ");
    String consumerName = scanner.nextLine();
    System.out.print("Enter Consumer ID: ");
    int consumerID = scanner.nextInt();
    System.out.print("Enter Units Consumed: ");
    int unitsConsumed = scanner.nextInt();

    // Create Consumer object and display the bill
    Consumer consumer = new Consumer(consumerName, consumerID, unitsConsumed);
    consumer.displayBill();

    scanner.close();
  }
}
