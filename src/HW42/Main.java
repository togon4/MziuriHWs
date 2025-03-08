package HW42;
import java.util.concurrent.*;
import static HW42.SecretCodeGenerator.generateSecretCode;

public class Main {
    private static final int NUM_THREADS = 100;
    public static void main(String[] args) {
        // 1
//        Thread thread = new Thread(new HelloWorldRunnable());
//        thread.start();
        // 2
//        CounterThread thread = new CounterThread();
//        thread.start();
        // 3
//        Counter counter = new Counter();
//        Runnable task = () -> {
//            for (int i = 0; i < 1000; i++) {
//                counter.increment();
//            }
//        };
//        Thread thread1 = new Thread(task);
//        Thread thread2 = new Thread(task);
//        thread1.start();
//        thread2.start();
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Final count: " + counter.getCount());
        // 4
//        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
//        CountDownLatch latch = new CountDownLatch(NUM_THREADS);
//
//        long startTime = System.currentTimeMillis();
//
//        for (int i = 0; i < NUM_THREADS; i++) {
//            executor.execute(() -> {
//                generateSecretCode();
//                latch.countDown();
//            });
//        }
//        try {
//            latch.await(3, TimeUnit.SECONDS);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        executor.shutdown();
//        long endTime = System.currentTimeMillis();
//        System.out.println("Execution Time: " + (endTime - startTime) + " ms");
    }
}
