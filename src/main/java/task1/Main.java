package task1;

public class Main {
    public static volatile boolean check;

    public static void main(String[] args) {
        Unchecker unchecker = new Unchecker();
        Checker checker = new Checker();
        checker.start();
        unchecker.start();
        try {
            checker.join();
            unchecker.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
