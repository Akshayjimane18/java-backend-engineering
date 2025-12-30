package coreJava.in28Minutes.MultiThreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultileAnyCallableRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<CallableTask> callableList = List.of(new CallableTask("in28Minutes"),
                new CallableTask("Akshay"),
                new CallableTask("Learning"));
        String results = executorService.invokeAny(callableList);

            System.out.println(results);


        executorService.shutdown();
    }
}
