package task2;

import java.util.concurrent.atomic.LongAdder;

public class Main {
    public static LongAdder longAdder = new LongAdder();

    public static void main(String[] args) {
        Shop shop1 = new Shop(longAdder, "Магазин 1");
        Shop shop2 = new Shop(longAdder, "Магазин 1");
        Shop shop3 = new Shop(longAdder, "Магазин 1");

        shop1.start();
        shop2.start();
        shop3.start();

        try {
            shop1.join();
            shop2.join();
            shop3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Общая выручка: " + longAdder.sum());
    }
}
