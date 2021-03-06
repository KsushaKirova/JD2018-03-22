package by.it.verishko.jd02_01;

import java.util.Random;

public class Util {
    static void sleep(int start, int stop) {
        try {
            Thread.sleep(Util.random(start, stop));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private final static Random RANDOM = new Random();

    static int random(int bound) {
        return RANDOM.nextInt(bound);
    }

    private static int random(int start, int stop) {
        return start + RANDOM.nextInt(stop - start);
    }

    static void sleep(int timeout) {
        try {
            Thread.sleep(timeout / 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
