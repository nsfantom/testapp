package src.main.java.twenty;/*
    n! means n × (n − 1) × ... × 3 × 2 × 1

    For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
    and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

    Find the sum of the digits in the number 100!
 */

import java.math.BigInteger;

public final class Problem20 {
    public static void main(String[] args){
        long sum = 0;
        long time = System.nanoTime();
        BigInteger result = getFactorialBigInt(BigInteger.valueOf(100));
        System.out.println(result);
        BigInteger[] a;
        do {
            a = result.divideAndRemainder(BigInteger.TEN);
            result = a[0];
            sum+=a[1].intValue();
        }while (BigInteger.ZERO.compareTo(a[1])<=0 && BigInteger.ZERO.compareTo(a[0])<0);
        time = System.nanoTime() - time;
        System.out.print("nanoTime: " + time + "\nResult: " + sum);
    }

    private static BigInteger getFactorialBigInt(BigInteger value) {
        if (value.equals(BigInteger.ONE)) return value;
        return value.multiply(getFactorialBigInt(value.subtract(BigInteger.ONE)));
    }
}
