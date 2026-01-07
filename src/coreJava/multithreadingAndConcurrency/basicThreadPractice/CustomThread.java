package coreJava.multithreadingAndConcurrency.basicThreadPractice;

public class CustomThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(" 1 ");
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        CustomThread thread = new CustomThread();
        thread.start();
    }
}
