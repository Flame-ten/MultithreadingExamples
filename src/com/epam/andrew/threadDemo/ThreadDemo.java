package threadDemo;

public class ThreadDemo {
    public static void main(String[] args) {
        Talk talk  = new Talk();
        Thread walk = new Thread(new Walk());
        talk.start();
        walk.start();

        //threadDemo.Walk w = new threadDemo.Walk(); // просто объект, не поток
        // w.run(); //выполнится метод, но поток не запустится!
    }
}
