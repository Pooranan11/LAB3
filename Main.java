public class Main {
    public static void main(String[] args) {
        Order order = new Order(1);

        // Attach observers
        order.attachObserver(new PriceObserver());
        order.attachObserver(new QuantityObserver());

        // Add items
        order.addItem(50);
        order.addItem(60);
        order.addItem(100);  // This should trigger the PriceObserver
        order.addItem(30);
        order.addItem(20);
        order.addItem(10);   // This should trigger the QuantityObserver
    }
}
