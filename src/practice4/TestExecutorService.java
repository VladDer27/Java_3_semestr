package practice4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class TestExecutorService {
    public static void main(String[] args) {
        Callable<String> task = () -> Thread.currentThread().getName();
        MyExecutorService service = new MyExecutorService(4);
        for (int i = 0; i < 6; i++) {
            Future result = service.submit(task);
            try {
                System.out.println(result.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        service.shutdown();
    }
}
