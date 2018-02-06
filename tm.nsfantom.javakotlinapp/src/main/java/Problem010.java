package src.main.java;

public final class Problem010 {
    /*
    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

    Find the sum of all the primes below two million.
     */
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long sum = 2, current = 1;
        int divider;
        while (current < 2000000) {
            current++;
            divider = 0;
            if (current % 2 != 0)
                for (long i = 1; i * i <= current && divider < 2; i += 2) {
                    if (current % i == 0) divider++;
                }
            if (divider == 1) {
                sum += current;
                long progress = System.currentTimeMillis() - startTime;
                System.out.println(": " + progress / 1000 + ":" + progress % 1000 + " : <" + sum + "> " + current);
            }
        }
        System.out.println("result: " + sum);
    }
}
