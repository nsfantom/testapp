package teen;

import java.util.HashMap;


/*
    If the numbers 1 to 5 are written out in words: one, two, three, four, five,
    then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

    If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?


    NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters
    and 115 (one hundred and fifteen) contains 20 letters.
    The use of "and" when writing out numbers is in compliance with British usage.
 */
public final class Problem17 {
    private static final int x = 1000;
    private static HashMap<Integer, Integer> hashMap = new HashMap<>();
//    private static HashMap<Integer, String> hashStringMap = new HashMap<>();

    public static void main(String[] args) {
        initHashMap(hashMap);
        //initStringHashMap(hashStringMap);

        long sum = 0;
        long time = System.nanoTime();

        for (int i = 1; i < x; i++) {
            sum += countLessThanOneThousand(i);

            //System.out.println("number: " + i + " count: " + buff + " s: " + convertLessThanOneThousand(i));
        }
        sum += hashMap.get(1) + hashMap.get(1000); //add 1000
        time = System.nanoTime() - time;
        System.out.print("nanoTime: " + time + "\nResult: " + sum);
    }

//    private static String convertLessThanOneThousand(int number) {
//        String soFar = "";
//
//        if (number % 100 < 20) {
//            soFar += hashStringMap.get(number % 100);
//            number /= 100;
//        } else {
//
//            soFar = hashStringMap.get(number % 10);
//
//            soFar = hashStringMap.get(number % 100 - number % 10) + soFar;
//            number /= 100;
//        }
//        if (number == 0) return soFar;
//        if (soFar.length() > 0) soFar = hashStringMap.get(111) + soFar;
//        return hashStringMap.get(number) + hashStringMap.get(100) + soFar;
//    }

    private static int countLessThanOneThousand(int number) {
        int count = 0;

        if (number % 100 < 20) {
            count += hashMap.get(number % 100);
            number /= 100;
        } else {
            count = hashMap.get(number % 10);
            count = hashMap.get(number % 100 - number % 10) + count;
            number /= 100;
        }
        if (number == 0) return count;
        if (count > 0) count += hashMap.get(111);
        return hashMap.get(number) + hashMap.get(100) + count;
    }


    private static HashMap<Integer, Integer> initHashMap(HashMap<Integer, Integer> hashMap) {
        hashMap.put(1, 3);
        hashMap.put(2, 3);
        hashMap.put(3, 5);
        hashMap.put(4, 4);
        hashMap.put(5, 4);
        hashMap.put(6, 3);
        hashMap.put(7, 5);
        hashMap.put(8, 5);
        hashMap.put(9, 4);
        hashMap.put(10, 3);
        hashMap.put(11, 6);
        hashMap.put(12, 6);
        hashMap.put(13, 8);
        hashMap.put(14, 8);
        hashMap.put(15, 7);
        hashMap.put(16, 7);
        hashMap.put(17, 9);
        hashMap.put(18, 8);
        hashMap.put(19, 8);
        hashMap.put(20, 6);
        hashMap.put(30, 6);
        hashMap.put(40, 5);
        hashMap.put(50, 5);
        hashMap.put(60, 5);
        hashMap.put(70, 7);
        hashMap.put(80, 6);
        hashMap.put(90, 6);
        hashMap.put(100, 7);
        hashMap.put(1000, 8);
        hashMap.put(1000000, 7);
        hashMap.put(0, 0);
        hashMap.put(111, 3);//AND
        return hashMap;
    }

    private static HashMap<Integer, String> initStringHashMap(HashMap<Integer, String> hashMap) {
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(4, "four");
        hashMap.put(5, "five");
        hashMap.put(6, "six");
        hashMap.put(7, "seven");
        hashMap.put(8, "eight");
        hashMap.put(9, "nine");
        hashMap.put(10, "ten");
        hashMap.put(11, "eleven");
        hashMap.put(12, "twelve");
        hashMap.put(13, "thirteen");
        hashMap.put(14, "fourteen");
        hashMap.put(15, "fifteen");
        hashMap.put(16, "sixteen");
        hashMap.put(17, "seventeen");
        hashMap.put(18, "eighteen");
        hashMap.put(19, "nineteen");
        hashMap.put(20, "twenty");
        hashMap.put(30, "thirty");
        hashMap.put(40, "forty");
        hashMap.put(50, "fifty");
        hashMap.put(60, "sixty");
        hashMap.put(70, "seventy");
        hashMap.put(80, "eighty");
        hashMap.put(90, "ninety");
        hashMap.put(100, "hundred");
        hashMap.put(1000, "thousand");
        hashMap.put(0, "");
        hashMap.put(111, "and");//AND
        return hashMap;
    }

}
