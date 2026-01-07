package coreJava.multithreadingAndConcurrency.runningThreads;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        try {
            System.out.println("Main thread is going to sleep for 1 second");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread = new Thread(() -> {
            String tname = Thread.currentThread().getName();
            System.out.println(tname + " should take 10 dots to run");
            for (int i = 0; i < 10; i++) {
                System.out.print(". ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread " + tname + " is interrupted");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            System.out.println("Thread " + tname + " is completed.");
        });

        Thread installThread = new Thread(() -> {
            try {
                for (int i = 0; i < 3; i++) {
                    Thread.sleep(700);
                    System.out.println("Installation step " + (i + 1) + " completed. ");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "InstallThread");

        Thread threadMonitor = new Thread(() ->
        {
            long now = System.currentTimeMillis();
            System.out.println("Now = " + now);
            while (thread.isAlive()) {
                try {
                    Thread.sleep(1000);
                    if (System.currentTimeMillis() - now > 3000) {
                        System.out.println("Main thread is interrupting " + thread.getName());
                        thread.interrupt();
                        System.out.println("B1. State = " + thread.getState());
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        System.out.println(thread.getName() + " starting");
        thread.start();


        threadMonitor.start();


        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (!thread.isInterrupted()) {
            installThread.start();
        } else {
            System.out.println("Previous thread was interrupted, "
                    + installThread.getName() + " will not start.");
        }
    }
}
