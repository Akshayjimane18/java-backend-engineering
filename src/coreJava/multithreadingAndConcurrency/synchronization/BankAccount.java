package coreJava.multithreadingAndConcurrency.synchronization;

public class BankAccount {
    private double balance;
    private String name;
    private final Object nameLock = new Object();
    private final Object balanceLock = new Object();

    public BankAccount(String name, double balance) {
        this.balance = balance;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        synchronized (nameLock) {
            this.name = name;
            System.out.println("Name updated to: " + name);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (balanceLock) {
            double originalBalance = balance;
            balance += amount;
            System.out.printf("STARTING BALANCE: %.2f, DEPOSIT AMOUNT: %.2f, NEW BALANCE: %.2f%n",
                    originalBalance, amount, balance);

            addPromotionalDollars(amount);
        }
    }

    private void addPromotionalDollars(double amount) {
        if(amount >= 5000) {
            synchronized (balanceLock) {
                balance += 50;
                System.out.printf("PROMOTIONAL DOLLARS ADDED! NEW BALANCE: %.2f%n", balance);
            }
        }
    }

    public synchronized void withdrawn(double amount) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        double originalBalance = balance;
        if (amount <= balance) {
            balance -= amount;
            System.out.printf("STARTING BALANCE: %.2f, WITHDRAWN AMOUNT: %.2f, NEW BALANCE: %.2f%n",
                    originalBalance, amount, balance);
        } else {
            System.out.printf("STARTING BALANCE: %.2f, WITHDRAWN AMOUNT: %.2f, INSUFFICIENT FUNDS!%n",
                    originalBalance, amount);
        }
    }
}
