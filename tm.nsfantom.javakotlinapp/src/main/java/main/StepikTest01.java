package main;

import java.util.Scanner;

public final class StepikTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0;
        do
            n = scanner.nextInt();
        while (n < 1 || n > 20);
        for (int i = 1; i <= n; i++)
            if (i % 3 != 0) sum += i * i;
        System.out.println(sum);
    }
}
