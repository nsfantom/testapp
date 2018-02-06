package src.main.java;

public final class Problem009 {
    /*
    A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
    a2 + b2 = c2
    For example, 32 + 42 = 9 + 16 = 25 = 52.

    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    Find the product abc.
     */
    public static void main(String[] args){
        int a=1,b=1,c=1,sum=1000;
        long pow;
        while (Math.pow(a,2) +Math.pow(b,2) !=Math.pow(c,2)){
            b++;
            if(b>=c){a++; b=a;}
            c = sum - a - b;
        }
        pow= a*b*c;
        System.out.println("result: "+ pow);
    }
}
