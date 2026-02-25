package coreJava.multithreadingAndConcurrency.basicThreadPractice2;

public class Main {

    EvenNumber evenNumberThread = new EvenNumber();

    Runnable oddRunnable = () -> {
        for(int i=1;i<=10;i++){

            if(i%2!=0) {
                System.out.println("Odd Number:"+i);
            }

            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println("Odd Number Thread Interrupted");
                break;
            }
        }
    };

    Thread oddThread = new Thread(oddRunnable);
    public void startThreads(){
        evenNumberThread.start();
        oddThread.start();

        evenNumberThread.interrupt();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.startThreads();
    }
}
