package main.hackerrank;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public final class SHA256Encoder {
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Scanner sc  = new Scanner(System.in);
        String text = sc.nextLine();

        byte[] b = MessageDigest.getInstance("SHA-256").digest(text.getBytes("UTF-8"));
        StringBuffer hexString = new StringBuffer();

        for (int i = 0; i < b.length; i++) {
            String hex = Integer.toHexString(0xff & b[i]);
            if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        System.out.println(hexString);
    }
}
