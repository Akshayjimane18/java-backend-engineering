package coreJava.in28Minutes.MultiThreading;

public class Practice {

    public static void main(String[] args) {

        ThreadPractice t1 = new ThreadPractice("First Thread ");
        ThreadPractice t2 = new ThreadPractice("Second Thread ");
        t1.start();
        t2.start();

    }
}

class ThreadPractice extends Thread {

    String threadName = "";

    ThreadPractice(String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i<10; i++) {
            System.out.println(threadName+i);
        }
    }

}
