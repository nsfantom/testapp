/*
    The following iterative sequence is defined for the set of positive integers:

    n → n/2 (n is even)
    n → 3n + 1 (n is odd)

    Using the rule above and starting with 13, we generate the following sequence:

    13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
    It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
    Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

    Which starting number, under one million, produces the longest chain?

    NOTE: Once the chain starts the terms are allowed to go above one million.
 */

public final class Problem14 {
    private final static int limit = 1000000;

    public static void main(String[] args) {
        int count,max=0,maxValue=0;
        long value = 0;
        long time = System.nanoTime();
        for (int i = 1; i <= limit; i++) {
            value = i;
            count = 1;
            System.out.print("value: " + value);
            while (value > 1) {
                value = iterate(value);
                count++;
                System.out.print(" -> " + value);
            }
            if (max < count) {
                max = count;
                maxValue = i;
            }
            System.out.println(" count: " + count);
        }
        time = System.nanoTime() - time;
        System.out.println("nanoTime: " + time + "\nResult: " + maxValue + " produce sequence of " + max);

    }

    private static long iterate(final long value) {
        if (value % 2 == 0) return value / 2;
        else return 3 * value + 1;
    }
}
