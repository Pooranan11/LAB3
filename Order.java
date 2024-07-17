import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private double itemCost = 0;
    private int itemCount = 0;
    private double shippingCost = 10;  // Default shipping cost
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(int id) {
        this.id = id;
    }

    public void addItem(double price) {
        this.itemCost += price;
        this.itemCount++;
        notifyObservers();
    }

    public void attachObserver(OrderObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }
}

