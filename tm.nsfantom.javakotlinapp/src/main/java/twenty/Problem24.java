package src.main.java.twenty;

/*
    A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4.
    If all of the permutations are listed numerically or alphabetically,
    we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:
    012   021   102   120   201   210

    What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 */
public final class Problem24 {
    private static int[] a = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    //    private static int[] a = new int[]{0, 1, 2};
    private static int count = 1;

    public static void main(String[] args) {
        long time = System.nanoTime();

        while (count < 1000000) {
            if (doPermutation()) count++;
            else break;
        }
        time = System.nanoTime() - time;
        System.out.print("nanoTime: " + time + "\nResult: " + intArrayToString());
    }

    private static String intArrayToString() {
        StringBuilder res = new StringBuilder();
        for (int anA : a) res.append(anA);
        return res.toString();
    }

    private static boolean doPermutation() {

        // Find longest non-increasing suffix
        int i = a.length - 1;
        while (i > 0 && a[i - 1] >= a[i])
            i--;
        // Now i is the head index of the suffix

        // Are we at the last permutation already?
        if (i <= 0)
            return false;

        // Let a[i - 1] be the pivot
        // Find rightmost element that exceeds the pivot
        int j = a.length - 1;
        while (a[j] <= a[i - 1])
            j--;
        // Now the value a[j] will become the new pivot
        // Assertion: j >= i

        // Swap the pivot with j
        int temp = a[i - 1];
        a[i - 1] = a[j];
        a[j] = temp;

        // Reverse the suffix
        j = a.length - 1;
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        // Successfully computed the next permutation
        return true;
    }
}
