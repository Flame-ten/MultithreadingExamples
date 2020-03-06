package threadExceptions;

class NewThreadGroup extends ThreadGroup {
    NewThreadGroup(String n) {
        super(n);
    }

    NewThreadGroup(ThreadGroup parent, String n) {
        super(parent, n);
    }

    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t + " has unhandled exception:" + e);
    }
}
