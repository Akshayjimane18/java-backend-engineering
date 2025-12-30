package coreJava.in28Minutes.MultiThreading;

class Tasks extends Thread{

    @Override
    public void run() {
        System.out.println("Task 1 Started");
        for (int i=101;i<=199;i++) {
            System.out.print(i + " ");
        }
        System.out.println("Task 1 Done");
    }
}

class Task2 implements Runnable {

    @Override
    public void run() {
        //Task 2
        System.out.println("Task 2 Started");

        for (int i=201;i<=299;i++) {
            System.out.print(i + " ");
        }

        System.out.println("Task 2 Done");
    }
}
public class Task1 {
    public static void main(String[] args) throws InterruptedException {


        Tasks t1 = new Tasks();

        t1.start();
        t1.join();
        Thread.sleep(1000);

        Task2 t2 = new Task2();

        Thread thread2 = new Thread(t2);
        thread2.start();
        thread2.join();
        Thread.sleep(1000);

        //Task 2
        System.out.println("Task 3 Started");
        for (int i=301;i<=399;i++) {
            System.out.print(i + " ");
        }

        System.out.println("Task 3 Done");
    }
}


