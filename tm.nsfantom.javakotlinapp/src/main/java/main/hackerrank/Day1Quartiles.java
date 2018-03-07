package main.hackerrank;

import java.util.Arrays;
/*
Given an array, , of  integers, calculate the respective first quartile (), second quartile (), and third quartile ().
It is guaranteed that , , and  are integers.
 */


public final class Day1Quartiles {
    public static void main(String[] args) {

        int[] in = {3, 7, 8, 5, 12, 14, 21, 13, 18};
        int[] in2 = {7, 15, 36, 39, 40, 41};
        int[] v = new int[in.length];
        int q1, q2, q3;

        for (int i = 0; i < v.length; i++) {
            v[i] = in[i];
        }

        Arrays.sort(v);
        q2 = getQuartile(v);
        q1 = getQuartile(Arrays.copyOfRange(v, 0, (v.length / 2)));
        q3 = getQuartile(Arrays.copyOfRange(v, v.length - v.length / 2, v.length));

        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
    }

    private static int getQuartile(int[] a) {
        if (a.length % 2 == 1)
            return a[a.length / 2];
        else return (a[a.length / 2 - 1] + a[a.length / 2]) / 2;
    }
}
