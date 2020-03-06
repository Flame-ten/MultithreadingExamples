package concurrentCallable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Solution {
    public static void main(String[] args) {
        ExecutorService ex =
                Executors.newCachedThreadPool();
        ex.execute(new SimpleThread());
        ex.execute(new SimpleThread());
        ex.shutdown();
    }
}
