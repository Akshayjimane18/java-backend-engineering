package coreJava.multithreadingAndConcurrency.shoeShopApp;

import java.util.ArrayList;
import java.util.List;

public class ShoeWarehouse {

    private List<Order> shippingItems;
    public final static String[] PRODUCT_LIST =
            {"Sneakers", "Boots", "Sandals", "Formal Shoes", "Running Shoes" };

    public ShoeWarehouse() {
        this.shippingItems = new ArrayList<>();
    }
    public synchronized void receiveOrder(Order item) {
        while (shippingItems.size() >= 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        shippingItems.add(item);
        System.out.println("Order received: " + item);
        notifyAll();
    }

    public synchronized Order fullFillOrder() {
        while (shippingItems.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        Order order = shippingItems.remove(0);
        System.out.println(Thread.currentThread().getName() + " Order fulfilled: " + order);
        notifyAll();
        return order;
    }

}
