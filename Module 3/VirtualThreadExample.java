import java.time.Duration;
import java.time.Instant;
public class VirtualThreadExample {
    public static void main(String[] args) throws InterruptedException {
        int count = 100_000;
        System.out.println("Running with Virtual Threads:");
        runWithVirtualThreads(count);
        System.out.println("\nRunning with Platform Threads:");
        runWithPlatformThreads(count);
    }
    private static void runWithVirtualThreads(int count) throws InterruptedException {
        Instant start = Instant.now();
        Thread[] threads = new Thread[count];
        for (int i = 0; i < count; i++) {
            threads[i] = Thread.startVirtualThread(() -> {
                System.out.println("Hello from virtual thread " + Thread.currentThread());
            });
        }
        for (Thread t : threads) {
            t.join();
        }
        Instant end = Instant.now();
        System.out.println("Time taken: " + Duration.between(start, end).toMillis() + " ms");
    }
    private static void runWithPlatformThreads(int count) throws InterruptedException {
        Instant start = Instant.now();
        Thread[] threads = new Thread[count];
        for (int i = 0; i < count; i++) {
            threads[i] = new Thread(() -> {
                System.out.println("Hello from platform thread " + Thread.currentThread());
            });
            threads[i].start();
        }
        for (Thread t : threads) {
            t.join();
        }
        Instant end = Instant.now();
        System.out.println("Time taken: " + Duration.between(start, end).toMillis() + " ms");
    }
}