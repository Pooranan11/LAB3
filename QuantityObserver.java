public class QuantityObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getItemCount() > 5) {
            System.out.println("QuantityObserver: Free shipping applied.");
        } else {
            System.out.println("QuantityObserver: Default shipping cost applied.");
        }
    }
}
