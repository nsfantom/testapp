package main.hackerrank;

import java.util.Arrays;
import java.util.HashMap;

public final class Day0MeanMedianMode {
    public static void main(String[] args) {

        int[] in = {64630, 11735, 14216, 99233, 14470, 4978, 73429, 38120, 51135, 67060}; //Scanner in = new Scanner(System.in);
        int[] x = new int[in.length]; // new int[in.nextInt()];
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            x[i] = in[i]; // in.nextInt();
            sum += x[i];
        } // in.close();

        System.out.println(Float.valueOf((float) (sum * 1.0 / x.length)));
        Arrays.sort(x);
        System.out.println(Float.valueOf((float) ((x[x.length / 2] + x[(x.length / 2) - 1]) / 2.0)));

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < x.length; i++)
            if (map.containsKey(x[i])) map.put(x[i], map.get(x[i]) + 1);
            else map.put(x[i], 1);

        int min = x[0];
        for (int i : x) if (map.get(i) > map.get(min)) min = i;


        System.out.println(min);
    }
}
