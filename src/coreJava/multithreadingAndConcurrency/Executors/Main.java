package coreJava.multithreadingAndConcurrency.Executors;

import coreJava.multithreadingAndConcurrency.multipleThread.ThreadColor;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.TimeUnit;

class ColorThreadFactory implements ThreadFactory {

    private String threadName;
    private int colorValue = 1;

    public ColorThreadFactory(ThreadColor threadName) {
        this.threadName = threadName.name();
    }

    public ColorThreadFactory() {

    }

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        String name = threadName;
        if (threadName == null) {
            name = ThreadColor.values()[colorValue].name();
        }

        if (++colorValue >= ThreadColor.values().length - 1) {
            colorValue = 1;
        }
        thread.setName(name);
        return thread;
    }
}

public class Main {

    public static void main(String[] args) {
        var multiExecutor = Executors.newCachedThreadPool();
        List<Callable<Integer>> taskList = List.of(
                () -> Main.sum(1, 10, 1, "red"),
                () -> Main.sum(10, 100, 10, "blue"),
                () -> Main.sum(100, 1000, 100, "yellow")
        );
        try {
            var result =  multiExecutor.invokeAny(taskList);
//            for (var res: result) {
//                System.out.println(res.get(500, TimeUnit.MILLISECONDS));
//            }
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }finally {
            multiExecutor.shutdown();
        }
    }
    public static void cachedMain(String[] args) {
        var multiExecutor = Executors.newCachedThreadPool();
        try {
            var redValue = multiExecutor.submit(
                    () -> Main.sum(1, 10, 1, "red")
            );
            var blueValue = multiExecutor.submit(
                    () -> Main.sum(10, 100, 10, "blue")
            );
            var yellowValue = multiExecutor.submit(
                    () -> Main.sum(100, 1000, 100, "yellow")
            );

            try {
                System.out.println(redValue.get(500, TimeUnit.MILLISECONDS));
                System.out.println(blueValue.get(500, TimeUnit.MILLISECONDS));
                System.out.println(yellowValue.get(500, TimeUnit.MILLISECONDS));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } finally {
            multiExecutor.shutdown();
        }
    }
    public static void fixedMain(String[] args) {
        int count = 3;
        var multiExecutor = Executors.newFixedThreadPool(count,
                new ColorThreadFactory()
        );

        for (int i = 0; i < count; i++) {
            multiExecutor.execute(Main::countDown);
        }

        multiExecutor.shutdown();
    }

    public static void singleMain(String[] args) {
        var blueExecutor = Executors.newSingleThreadExecutor(
                new ColorThreadFactory(ThreadColor.ANSI_BLUE)
        );
        blueExecutor.execute(Main::countDown);
        blueExecutor.shutdown();

        boolean isDone = false;
        try {
            isDone = blueExecutor.awaitTermination(500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        var yellowExecutor = Executors.newSingleThreadExecutor(
                new ColorThreadFactory(ThreadColor.ANSI_YELLOW)
        );

        if (isDone) {
            System.out.println("Blue is done");
            yellowExecutor.execute(Main::countDown);
            yellowExecutor.shutdown();

            boolean isDoneYellow = false;
            try {
                isDoneYellow = yellowExecutor.awaitTermination(500, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (isDoneYellow) {
                System.out.println("Yellow is done");
                var redExecutor = Executors.newSingleThreadExecutor(
                        new ColorThreadFactory(ThreadColor.ANSI_RED)
                );
                redExecutor.execute(Main::countDown);
                redExecutor.shutdown();
            }
        }

    }

    public static void notMain(String[] args) {
        Thread blue = new Thread(Main::countDown, ThreadColor.ANSI_BLUE.name());
        Thread yellow = new Thread(Main::countDown, ThreadColor.ANSI_YELLOW.name());
        Thread red = new Thread(Main::countDown, ThreadColor.ANSI_RED.name());

        blue.start();
        try {
            blue.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        yellow.start();
        try {
            yellow.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        red.start();
        try {
            red.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    private static void countDown() {
        String threadName = Thread.currentThread().getName();
        var threadColor = ThreadColor.ANSI_RESET;
        try {
            threadColor = ThreadColor.valueOf(threadName.toUpperCase());
        } catch (IllegalArgumentException e) {

        }

        String color = threadColor.getColor();
        for (int i = 20; i >= 0; i--) {
            System.out.println(color + " " +
                    threadName.replace("ANSI_", "") + " " + i);

        }
    }

    private static int sum(int start, int end, int delta, String colorString) {

        var threadColor = ThreadColor.ANSI_RESET;
        try {
            threadColor = ThreadColor.valueOf("ANSI_"+  colorString.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }

        String color = threadColor.getColor();
        int sum = 0;
        for (int i = start; i <= end; i+=delta) {
            sum += i;
        }
        System.out.println(color + Thread.currentThread().getName() + ", "
                + colorString + " " + sum);
        return sum;

    }


}
