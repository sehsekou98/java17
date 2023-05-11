package Multithread;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Current thread demo: " + thread);

        thread.setName("Sekou Thread");
        System.out.println("New name: " + thread);

        try {
            for (int i = 4; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
