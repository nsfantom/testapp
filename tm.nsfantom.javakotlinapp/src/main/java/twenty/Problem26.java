package twenty;

/*
    A unit fraction contains 1 in the numerator. The decimal representation of the unit fractions with denominators 2 to 10 are given:

    1/2	= 	0.5
    1/3	= 	0.(3)
    1/4	= 	0.25
    1/5	= 	0.2
    1/6	= 	0.1(6)
    1/7	= 	0.(142857)
    1/8	= 	0.125
    1/9	= 	0.(1)
    1/10	= 	0.1
    Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It can be seen that 1/7 has a 6-digit recurring cycle.

    Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.
 */

import java.util.HashMap;
import java.util.Map;

public final class Problem26 {
    public static void main(String[] args) {
        long time = System.nanoTime();
        int result = 0;
        int longest = 0;
        for (int i = 1; i <= 1000; i++) {
            int length = getCycleLength(i);
            if (length > longest) {
                result = i;
                longest = length;
            }
        }
        time = System.nanoTime() - time;
        System.out.print("nanoTime: " + time + "\nResult: " + result);
    }

    private static int getCycleLength(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        int state = 1;
        int i = 0;
        while (!map.containsKey(state)) {
            map.put(state, i);
            state = state * 10 % n;
            i++;
        }
        return i - map.get(state);
    }

}
