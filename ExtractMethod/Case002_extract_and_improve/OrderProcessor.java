public class OrderProcessor {
    public void processOrder(String customer, double amount) {
        if (customer == null || customer.isEmpty()) {
            System.out.println("Invalid customer.");
            return;
        }
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }
        System.out.println("Order confirmed for " + customer + ", total: $" + amount);
    }
}