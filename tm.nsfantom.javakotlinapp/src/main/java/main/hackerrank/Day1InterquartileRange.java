package main.hackerrank;

import java.util.Arrays;
/*
    In this challenge, we practice calculating the interquartile range.
    We recommend you complete the Quartiles challenge before attempting this problem.
 */


public final class Day1InterquartileRange {
    public static void main(String[] args) {

        int[] x = {6,12,8,10,20,16};
        int[] f = {5,4,3,2,1,5};
        int countf = Arrays.stream(f).sum();
        int[] v = new int[countf];
        float q1, q2, q3;
        int count =0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < f[i]; j++) {
                v[count] = x[i];
                count++;
            }
        }

        Arrays.sort(v);
        for (int i:v) System.out.print(" "+i);
        System.out.println();

        q2 = getQuartile(v);
        q1 = getQuartile(Arrays.copyOfRange(v, 0, (v.length / 2)));
        q3 = getQuartile(Arrays.copyOfRange(v, v.length - v.length / 2, v.length));

        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
        System.out.println(q3-q1);
    }

    private static int getQuartile(int[] a) {
        if (a.length % 2 == 1)
            return a[a.length / 2];
        else return (a[a.length / 2 - 1] + a[a.length / 2]) / 2;
    }
}
