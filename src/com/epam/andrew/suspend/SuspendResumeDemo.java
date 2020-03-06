package suspend;

public class SuspendResumeDemo {

    public static void main(String[] args) throws InterruptedException {
        ConsoleClock clock = new ConsoleClock();
        clock.start();
        Thread.sleep(3000);
        clock.suspend();
        Thread.sleep(3000);
        clock.resume();
    }
}
