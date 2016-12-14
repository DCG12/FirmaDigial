package com.company;


import java.io.*;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;

public class Utils {
    public static void main(String[] args){

    }

   public static boolean areKeysPresent() {
       File f1 = new File("private.key");
       File f2 = new File("public.key");
       if((f1.exists())&&(f2.exists())){
           return true;
       }
       else{
           return false;
       }

   }

    public static byte[] digestiona(File f, String algoritme) throws NoSuchAlgorithmException, IOException {
        MessageDigest digest = MessageDigest.getInstance("MD5");
        f = new File("F1.pdf");
        InputStream is = new FileInputStream(f);
        byte[] buffer = new byte[(int) f.length()];
        int read = 0;
        while ((read = is.read(buffer)) > 0)
        {
            digest.update(buffer, 0, read);
        }

        byte[] md5sum = digest.digest();
        BigInteger bigInt = new BigInteger(1, md5sum);
        String output = bigInt.toString(16);
        is.close();
        return new byte[0];
    }

    public static KeyPair generatekey(){


        return null;
    }

    public static byte[] signar(byte[] text, PrivateKey Key){

        return new byte[0];
    }

}
