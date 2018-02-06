package src.main.java;

public final class Problem4 {
    public static void main(String[] args) {
        int max = 0;
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                if (isPolindrome(i * j)) {
                    System.out.println("polindrome: " + (i * j));
                    if (max < i * j) max = i * j;
                }
            }
        }
        System.out.println("Result: " + max);
    }

    private static boolean isPolindrome(int num) {
        StringBuilder a = new StringBuilder("" + num);
        return a.toString().equals(a.reverse().toString());
    }
}
