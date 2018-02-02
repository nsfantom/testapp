/*
    Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
    there are exactly 6 routes to the bottom right corner.

    How many such routes are there through a 20×20 grid?
 */

import java.math.BigInteger;

public class Problem15 {
    private static final int x = 10, y = 10;

    public static void main(String[] args) {
        long time = System.nanoTime();
        BigInteger result = getFactorialBigInt(new BigInteger(String.valueOf(x + y)), new BigInteger(String.valueOf(x+1)))
                .divide(getFactorialBigInt(new BigInteger(String.valueOf(y)), new BigInteger("1")));
        time = System.nanoTime() - time;
        System.out.print("nanoTime: " + time + "\nResult: " + result.toString());
    }

    private static BigInteger getFactorialBigInt(BigInteger value, BigInteger stopvalue) {
        if (value.equals(stopvalue)) return value;
        return value.multiply(getFactorialBigInt(value.subtract(new BigInteger("1")), stopvalue));
    }
}
