package threadExceptions;

class SimpleThread extends Thread {
    public void run() {
        throw new RuntimeException("It is a great exception.");
    }
}
