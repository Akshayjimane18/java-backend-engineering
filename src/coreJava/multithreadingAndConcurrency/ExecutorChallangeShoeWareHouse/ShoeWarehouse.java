package coreJava.multithreadingAndConcurrency.ExecutorChallangeShoeWareHouse;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShoeWarehouse {

    private List<Order> shippingItems;
    private final ExecutorService fulfillmentService;


    public final static String[] PRODUCT_LIST =
            {"Sneakers", "Boots", "Sandals", "Formal Shoes", "Running Shoes" };

    public ShoeWarehouse() {
        this.shippingItems = new ArrayList<>();
        fulfillmentService = Executors.newFixedThreadPool(3);
    }

    public void shutDown() {
        fulfillmentService.shutdown();
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
        System.out.println(Thread.currentThread().getName()+" Order received: " + item);
        fulfillmentService.submit(this::fullFillOrder);
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
