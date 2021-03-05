package task1;

public class Checker extends Thread {
    private static final long DELAY = 3000;

    @Override
    public void run() {

        if (!Main.check) {
            for (int i = 0; i < 10; i++) {
                try {
                    sleep(DELAY);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Вкл");
                Main.check = true;
            }
        }
    }
}