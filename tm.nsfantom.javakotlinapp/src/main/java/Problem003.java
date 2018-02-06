package src.main.java;

import java.util.ArrayList;

public final class Problem003 {
    /*
    The prime factors of 13195 are 5, 7, 13 and 29.
    What is the largest prime factor of the number 600851475143 ?
     */
    public static void main(String[] args) {
        long num = 600851475143L;
        ArrayList<Long> factor = new ArrayList<>();
        long d = 2;
        while (num > 1) {
            while (num % d == 0) {
                factor.add(d);
                System.out.println(d);
                num /= d;
            }
            d++;
        }
        System.out.println("Result: " + factor.get(factor.size() - 1));
    }
}
