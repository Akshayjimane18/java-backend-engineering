package coreJava.multithreadingAndConcurrency.basicThreadPractice;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        var currentThread = Thread.currentThread();
        System.out.println("Current Thread: " + currentThread.getClass().getName());

        System.out.println(currentThread);
        printThreadState(currentThread);

        currentThread.setName("Main-Guy");
        currentThread.setPriority(Thread.MAX_PRIORITY);
        printThreadState(currentThread);

        CustomThread customThread = new CustomThread();
        customThread.start();

        Runnable runnable = () -> {
            for (int i = 1; i <= 3; i++) {
                System.out.print(" 2 ");
                try {
                    Thread.sleep(Duration.ofMillis(250));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread runnableThread = new Thread(runnable);
        runnableThread.start();

        for (int i = 1; i <= 3; i++) {
            System.out.print(" 0 ");
            try {
                Thread.sleep(Duration.ofSeconds(1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void  printThreadState(Thread thread) {
        System.out.println("----------------------------");
        System.out.println("Thread ID" + thread.getId());
        System.out.println("Thread Name: " + thread.getName());
        System.out.println("Thread Priority: " + thread.getPriority());
        System.out.println("Thread State: " + thread.getState());
        System.out.println("Thread Group: " + thread.getThreadGroup());
        System.out.println("Thread is Alive: " + thread.isAlive());
        System.out.println("----------------------------");
    }
}
