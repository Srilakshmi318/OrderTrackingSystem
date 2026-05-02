class Order {
    private int orderId;
    private String customerName;
    private String productName;
    private String status;

    public Order(int orderId, String customerName, String productName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.status = "Pending";
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product Name: " + productName);
        System.out.println("Status: " + status);
        System.out.println("---------------------");
    }

    public int getOrderId() {
        return orderId;
    }
}