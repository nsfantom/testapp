import java.math.BigInteger;


/*
    2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

    What is the sum of the digits of the number 2^1000?
 */
public final class Problem16 {
    private static final int x = 1000;

    public static void main(String[] args) {
        long sum = 0;
        long time = System.nanoTime();
        BigInteger result = BigInteger.valueOf(2).pow(x);
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

}
