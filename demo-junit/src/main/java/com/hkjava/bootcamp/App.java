package com.hkjava.bootcamp;

/**
 * Hello world!
 *
 */
public class App {
    public static int add(int x, int y) {
        return x + y + anotherMethod(x + y);
    }

    public static int anotherMethod(int z) {
        return (z + 3) / 100;
    }

    public static int divide(int x, int y) {
        return x / y;
    }


}
