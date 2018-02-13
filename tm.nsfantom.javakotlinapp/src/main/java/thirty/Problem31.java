package thirty;

import java.util.Arrays;

/*
    In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:

    1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
    It is possible to make £2 in the following way:

    1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
    How many different ways can £2 be made using any number of coins?
 */
public final class Problem31 {
    public static void main(String[] args) {
        int target = 200;
        int[] arr = new int[]{1, 2, 5, 10, 20, 50, 100, 200};
        long time = System.nanoTime();

//        int result = findCoins(target, arr);
        int result= findWays(target, arr);
        time = System.nanoTime() - time;
        System.out.print("nanoTime: " + time + "\nResult: " + result);
    }

    private static int findCoins(int total, int[] coins) {
        if (total <= 0 || coins.length == 0)
            return 0;
        int coin = coins[0], sum = 0;
        for (int i = 0; i * coin <= total; i++)
            if (i * coin == total) sum += 1;
            else sum += findCoins(total - i * coin, Arrays.stream(coins).skip(1).toArray());
        return sum;
    }

    private static int findWays(int total, int[] coins) {
        int[] ways = new int[total + 1];
        ways[0] = 1;
        for (int i = 0; i < coins.length; i++)
            for (int j = coins[i]; j <= total; j++)
                ways[j] += ways[j - coins[i]];
        return ways[total];
    }
}
