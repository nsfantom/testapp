package main;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class MD5Encoder {
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        if(args.length==0) return;
        System.out.println(new BigInteger(1,MessageDigest.getInstance("MD5").digest(args[0].getBytes("UTF-8"))).toString(16));
    }
}
