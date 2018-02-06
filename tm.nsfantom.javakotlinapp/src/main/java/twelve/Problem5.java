package src.main.java.twelve;

public final class Problem5 {
    public static void main(String[] args) {
        int count = 0;
        int number = 20;
        while (count < 20) {
            number += 20;
            count = 0;
            for (int i = 1; i <= 20; i++) {
                if (number % i == 0) count++;
            }
            System.out.println(number);
        }
        System.out.println("Result: " + number);
    }
}
