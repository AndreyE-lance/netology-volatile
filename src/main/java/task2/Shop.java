package task2;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.LongAdder;

public class Shop extends Thread {
    private static final int GAIN_AMOUNT = 1000;
    private Random rnd = new Random();
    private LongAdder longAdder;
    private String name;

    public Shop(LongAdder longAdder, String name) {
        this.longAdder = longAdder;
        this.name = name;
    }

    @Override
    public void run() {
        long sum = getSum(getArray());
        longAdder.add(sum);
        System.out.println(name + " выручка: " + sum);
    }

    private int[] getArray() {
        int[] gain = new int[GAIN_AMOUNT];
        for (int i = 0; i < GAIN_AMOUNT; i++) {
            gain[i] = rnd.nextInt(100);
        }
        return gain;
    }

    private long getSum(int[] array) {
        return Arrays.stream(array).sum();
    }
}
