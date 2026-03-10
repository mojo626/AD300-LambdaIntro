public class SimpleRunnable {
    
    public static void run() {

        Runnable runner = () -> {
            System.out.println("Hello, World!");
        };

        Thread t = new Thread(runner);
        t.start();
    }
}
