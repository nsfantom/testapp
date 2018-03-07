package main.hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public final class JavaAnagrams {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    static boolean isAnagram(String a, String b) {
        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();
        if(a.length()!=b.length()) return false;
        a=a.toLowerCase();
        b=b.toLowerCase();
        char aa,bb;
        for (int i = 0; i < a.length(); i++) {
            aa = a.charAt(i);
            bb = b.charAt(i);
            if(mapA.containsKey(aa))
                mapA.put(aa,mapA.get(aa)+1);
            else mapA.put(aa,1);
            if(mapB.containsKey(bb))
                mapB.put(bb,mapB.get(bb)+1);
            else mapB.put(bb,1);
        }
        for (char c: mapA.keySet()) {
            if(mapA.get(c)!=(mapB.getOrDefault(c,0)))
                return false;
        }
        return true;
    }
}

