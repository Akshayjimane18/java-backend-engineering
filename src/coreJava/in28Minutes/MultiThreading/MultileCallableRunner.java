package coreJava.in28Minutes.MultiThreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultileCallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        List<CallableTask> callableList = List.of(new CallableTask("in28Minutes"),
                new CallableTask("Akshay"),
                new CallableTask("Learning"));
        List<Future<String>> results = executorService.invokeAll(callableList);
        for(Future<String> result:results) {
            System.out.println(result.get());
        }

        executorService.shutdown();
    }
}
