package main.hackerrank;

import java.util.Arrays;
/*
    In this challenge, we practice calculating standard deviation.
 */


public final class Day1StandardDeviation {
    public static void main(String[] args) {

        int[] x = {10,40,30,50,20};
//        Arrays.sort(x);
        float m = Arrays.stream(x).sum()/x.length;
        float sum =0;
        for (int i = 0; i < x.length; i++) {
            sum+= Math.pow(x[i]-m,2);
        }
        float sd = (float) Math.sqrt(sum/x.length);
        System.out.println(String.format("%.1f", sd));
    }

}
