package task1;

public class Unchecker extends Thread {
    @Override
    public void run() {
        while (!interrupted()) {
            if (Main.check) {
                Main.check = false;
                System.out.println("Выкл");
            }
        }
    }
}
