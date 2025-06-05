public class OrderProcessor {
    public void processOrder(String customer, double amount) {
        if (!isValidOrder(customer, amount)) {
            return;
        }
        confirmOrder(customer, amount);
    }

    private boolean isValidOrder(String customer, double amount) {
        if (customer == null || customer.isEmpty()) {
            System.out.println("Invalid customer.");
            return false;
        }
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return false;
        }
        return true;
    }

    private void confirmOrder(String customer, double amount) {
        System.out.println("Order confirmed for " + customer + ", total: $" + amount);
    }
}