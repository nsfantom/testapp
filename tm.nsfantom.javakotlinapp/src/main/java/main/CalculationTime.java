package main;

public final class CalculationTime {

    private static long startTime=0;

    public static void init() {
        startTime = System.nanoTime();
    }

    public static long stop(){
        return System.nanoTime() - startTime;
    }
}
