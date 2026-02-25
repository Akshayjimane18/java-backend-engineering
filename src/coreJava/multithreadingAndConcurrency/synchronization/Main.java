package coreJava.multithreadingAndConcurrency.synchronization;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Akshay",10000);
        Thread thread1 = new Thread(() -> {bankAccount.withdrawn(2500);});
        Thread thread2 = new Thread(() -> {bankAccount.deposit(5000);});

        Thread thread3 = new Thread(() -> {bankAccount.setName("Pratik");});
        Thread thread4 = new Thread(() -> {bankAccount.withdrawn(5000);});

        thread1.start();
        thread2.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("FINAL BALANCE: %.2f%n", bankAccount.getBalance());
    }
}
