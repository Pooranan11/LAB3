public class PriceObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getItemCost() > 200) {
            double discount = 20;
            order.setItemCost(order.getItemCost() - discount);
            System.out.println("PriceObserver: Discount applied. New total cost: " + order.getItemCost());
        }
    }
}

