package main.hackerrank;

public final class Day0WeightedMean {
    public static void main(String[] args){

        int[] in = {10,40,30,50,20,10,40,30,50,20,1,2,3,4,5,6,7,8,9,10};
        int[] in2 = {1,2,3,4,5,6,7,8,9,10,10,40,30,50,20,10,40,30,50,20};
        int[] v = new int[in.length];
        for(int i=0;i<v.length;i++){
            v[i]= in[i];
        }
        long sumW = 0, sumE = 0;
        for(int i =0; i< v.length;i++){
            float w =in2[i];
            sumW +=w;
            sumE +=w*v[i];
        }
        System.out.println(String.format("%.1f", (float) sumE/sumW));
    }
}
