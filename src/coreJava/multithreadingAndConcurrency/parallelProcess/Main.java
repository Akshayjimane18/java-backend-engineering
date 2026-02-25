package coreJava.multithreadingAndConcurrency.parallelProcess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws Exception {
        int numbersLength = 100_000;
        long[] numbers = new Random().longs(numbersLength, 1, numbersLength).toArray();

        long sum = Arrays.stream(numbers).sum();

        System.out.println("Sum: " + sum);

        ForkJoinPool threadPool = ForkJoinPool.commonPool();

        List<Callable<Long>> tasks = new ArrayList<>();

        int taskNo = 10;
        int splitCount = numbersLength / taskNo;

        for (int i = 0; i < taskNo; i++) {
            int start = i * splitCount;
            int end = (i + 1) * splitCount;

            tasks.add(() -> {
                long taskSum = 0;
                for (int j = start; j < end; j++) {
                    taskSum += (long) numbers[j];
                }
                return taskSum;
            });
        }

        List<Future<Long>> futures = threadPool.invokeAll(tasks);

        System.out.println("Parallelism" + threadPool.getParallelism());
        System.out.println("Pool size" + threadPool.getPoolSize());
        System.out.println("Steal count" + threadPool.getStealCount());

        long totalSum = 0;
        for (var future : futures) {
            totalSum += future.get();
        }

        System.out.println("Total Sum: " + totalSum);

        threadPool.shutdown();

        System.out.println(threadPool.getClass().getName());
    }
}
