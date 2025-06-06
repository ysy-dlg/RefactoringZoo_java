public class OrderCalculator {

    public double computeTotal(Order order) {
        double basePrice = order.quantity * order.itemPrice;
        double quantityDiscount = Math.max(0, order.quantity - 500) * order.itemPrice * 0.05;
        double shipping = Math.min(basePrice * 0.1, 100);
        return basePrice - quantityDiscount + shipping;
    }

    static class Order {
        int quantity;
        double itemPrice;

        public Order(int quantity, double itemPrice) {
            this.quantity = quantity;
            this.itemPrice = itemPrice;
        }
    }
}
