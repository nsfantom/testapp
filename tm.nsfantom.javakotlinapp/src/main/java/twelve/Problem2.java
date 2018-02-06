package src.main.java.twelve;

public final class Problem2 {

    public static void main(String[] args) {
        final long[] sum = {0};
        int prev = 0,current = 1,buff;
        while (current <= 4000000) {
            if ((current + prev) % 2 == 0) {
                System.out.print("+ ");
                sum[0] += prev + current;
            }
            System.out.println(prev + current);
            buff = prev;
            prev = current;
            current += buff;
        }
        System.out.println("Result: " + sum[0]);
    }
}
