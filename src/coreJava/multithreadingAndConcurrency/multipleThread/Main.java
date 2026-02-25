package coreJava.multithreadingAndConcurrency.multipleThread;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch1 = new StopWatch(Duration.ofSeconds(1));
        Thread green = new Thread(stopWatch1::countDown, ThreadColor.ANSI_GREEN.name());
        Thread purple = new Thread(() -> {
            stopWatch1.countDown(7);
        }, ThreadColor.ANSI_PURPLE.name());
        Thread red = new Thread(stopWatch1::countDown, ThreadColor.ANSI_RED.name());
        green.start();
        purple.start();
        red.start();
    }
}

class StopWatch {

    private Duration timeUnit;
    private int i;
    public StopWatch(Duration timeUnit) {
        this.timeUnit = timeUnit;
    }

    public void countDown(){
        countDown(5);
    }

    public void countDown(int unitCount){
        String threadName = Thread.currentThread().getName();
        ThreadColor threadColor = ThreadColor.ANSI_RESET;

        try {
            threadColor = ThreadColor.valueOf(threadName);
        } catch (IllegalArgumentException e) {
            // Use default color if thread name does not match any enum constant
        }

        String color = threadColor.getColor();

        for (i = unitCount; i > 0; i--) {
            try {
                Thread.sleep(timeUnit.getSeconds());
            } catch (InterruptedException e) {
                System.out.println(color + threadName + " interrupted");
                return;
            }
            System.out.printf("%s%s Thread : i = %d%n", color, threadName, i);
        }
    }
}
