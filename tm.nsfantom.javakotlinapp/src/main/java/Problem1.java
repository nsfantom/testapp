package src.main.java;

import java.util.HashSet;

public final class Problem1 {

    public static void main(String[] args) {

        long time = System.nanoTime();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 3; i < 1000; i += 3)
            set.add(i);
        for (int i = 5; i < 1000; i += 5)
            set.add(i);
//        for (int i = 0; i < 1000; i++)
//            if(i%3==0 || i%5==0) set.add(i);

        final long[] sum = {0};
        set.forEach(s -> sum[0] += s);
        time = System.nanoTime() - time;
        System.out.print("nanoTime: " + time + "\nResult: " + sum[0]);
    }
}
