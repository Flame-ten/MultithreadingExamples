package timeUnit;

import java.util.concurrent.TimeUnit;

public class TimeUnitThread {
    public int count = 0;
    public Integer call() {
        for (int i = 0; i < 1000000; i++) {
            count++;
            try {
                TimeUnit.MICROSECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return count;
    }
}
