/*
    Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
    If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

    For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284.
    The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

    Evaluate the sum of all the amicable numbers under 10000.
 */
public final class Problem21 {
    public static void main(String[] args) {
        long sum = 0;
        int current;
        long time = System.nanoTime();
        for (int i = 0; i <= 10000; i++) {
            current = getSumDivisors(i);
            if (i == getSumDivisors(current) && current > i) sum += i + current;
        }
        time = System.nanoTime() - time;
        System.out.print("nanoTime: " + time + "\nResult: " + sum);
    }

    private static int getSumDivisors(final int value) {
        int sum = 0;
        for (int i = 1; i <= value / 2; i++)
            if (value % i == 0) sum += i;
        return sum;
    }
}
