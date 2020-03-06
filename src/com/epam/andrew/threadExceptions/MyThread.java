package threadExceptions;

class MyThread implements Runnable {
    public void run() {
        throw new RuntimeException();
    }
}
