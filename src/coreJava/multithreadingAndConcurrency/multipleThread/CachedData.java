package coreJava.multithreadingAndConcurrency.multipleThread;

import java.time.Duration;

public class CachedData {
    private volatile boolean flag = false;

    public void toggleFlag() {
        flag = !flag;
    }

    public boolean isReady() {
        return flag;
    }

    public static void main(String[] args) {
        CachedData cachedData = new CachedData();

        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(Duration.ofSeconds(1).getSeconds());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedData.toggleFlag();
            System.out.println("A. Flag toggled to: " + cachedData.isReady());
        });

        Thread readerThread = new Thread(() -> {
            while (!cachedData.isReady()) {
                // Busy-waiting
            }
            System.out.println("B. Flag toggled to: " + cachedData.isReady());
        });

        writerThread.start();
        readerThread.start();

    }
}
