import java.util.concurrent.*;
import java.util.*;
public class CallableExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int taskCount = 5;
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = new ArrayList<>();
        for (int i = 1; i <= taskCount; i++) {
            final int taskId = i;
            Callable<String> task = () -> {
                Thread.sleep(1000); 
                return "Result from Task " + taskId;
            };
            Future<String> future = executor.submit(task);
            futures.add(future);
        }
        for (Future<String> future : futures) {
            System.out.println(future.get()); 
        }
        executor.shutdown();
    }
}