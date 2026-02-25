package coreJava.multithreadingAndConcurrency.ExecutorChallangeShoeWareHouse;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

record Order(long orderId, String item, int qty) {
};

public class Main {
    private static final Random random = new Random();

    public static void main(String[] args) {

        ShoeWarehouse shoeWarehouse = new ShoeWarehouse();

        ExecutorService orderService = Executors.newCachedThreadPool();
        Callable<Order> orederTask = () -> {
            {
                Order order = generateOrder();
                try {
                    shoeWarehouse.receiveOrder(order);
                    Thread.sleep(random.nextInt(500, 2000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return order;
            }
        };

//        List<Callable<Order>> orderTasks = Collections.nCopies(15, orederTask);
//        try {
//            orderService.invokeAll(orderTasks);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        try {

            for (int i = 0; i < 15; i++) {
                Thread.sleep(random.nextInt(500, 2000));
                orderService.submit(() -> shoeWarehouse.receiveOrder(generateOrder()));
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        orderService.shutdown();

        try {
            orderService.awaitTermination(6, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        shoeWarehouse.shutDown();

    }

    private static Order generateOrder() {
        return new Order(
                random.nextLong(100000, 999999),
                ShoeWarehouse.PRODUCT_LIST[random.nextInt(0, ShoeWarehouse.PRODUCT_LIST.length - 1)],
                random.nextInt(1, 4));
    }
}
