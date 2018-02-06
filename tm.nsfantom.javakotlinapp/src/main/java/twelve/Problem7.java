package src.main.java.twelve;

public final class Problem7 {
    /*
    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
    What is the 10 001st prime number?
     */
    public static void main(String[] args) {
        int count = 0, divider;
        long current = 1;
        while (count < 10001) {
            current++;
            divider = 0;
            for (long i = 1; i <= current && divider < 3; i++) {
                if (current % i == 0) divider++;
            }
            if (divider == 2) {
                count++;
                System.out.println("<" + count + "> " + current);
            }
        }
        System.out.println("Result: " + current);
    }
}
