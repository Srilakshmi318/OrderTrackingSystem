import java.util.ArrayList;
import java.util.Scanner;

public class OrderTrackingSystem {
    public static void main(String[] args) {

        ArrayList<Order> orders = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== ORDER TRACKING SYSTEM ===");
            System.out.println("1. Create Order");
            System.out.println("2. Update Order Status");
            System.out.println("3. View Orders");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Order ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Product Name: ");
                    String product = sc.nextLine();

                    orders.add(new Order(id, name, product));
                    System.out.println("Order created!");
                    break;

                case 2:
                    System.out.print("Enter Order ID: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();

                    boolean found = false;

                    for (Order o : orders) {
                        if (o.getOrderId() == searchId) {
                            System.out.print("New Status: ");
                            String status = sc.nextLine();
                            o.updateStatus(status);
                            System.out.println("Updated!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Order not found!");
                    }
                    break;

                case 3:
                    for (Order o : orders) {
                        o.displayOrder();
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}