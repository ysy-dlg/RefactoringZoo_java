public class OrderCalculator {

    public double computeTotal(Order order) {
        return order.quantity * order.itemPrice -
               Math.max(0, order.quantity - 500) * order.itemPrice * 0.05 +
               Math.min(order.quantity * order.itemPrice * 0.1, 100);
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
