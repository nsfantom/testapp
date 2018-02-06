package src.main.java.twelve;

public final class Problem6 {
    public static void main(String[] args) {
        int pow = 0, sum = 0;
        for (int i = 1; i <= 100; i++) {
            pow += i * i;
            sum += i;
        }
        System.out.println("Result: " + (sum * sum - pow));
    }
}
