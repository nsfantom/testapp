package twenty;

/*
    Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:

    21 22 23 24 25
    20  7  8  9 10
    19  6  1  2 11
    18  5  4  3 12
    17 16 15 14 13

    It can be verified that the sum of the numbers on the diagonals is 101.

    What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
 */

public final class Problem28 {
    private final static int capacity = 1001*1001;

    public static void main(String[] args) {
        long sum = 1;
        int counter = 1, k = 2;
        long time = System.nanoTime();
        while (counter<capacity){
            for (int i = 0; i <4 ; i++)
                sum+=counter+=k;
            k+=2;
        }
        time = System.nanoTime() - time;
        System.out.print("nanoTime: " + time + "\nResult: " + sum);
    }
}
