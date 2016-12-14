package com.company;


import java.io.*;
import java.math.BigInteger;
import java.security.*;

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
        return new byte[0];
    }

    public static KeyPair generatekey(){
        KeyPairGenerator keyGen = null;
        KeyPair pair = keyGen.generateKeyPair();
        PrivateKey priv = pair.getPrivate();
        PublicKey pub = pair.getPublic();
        return pair;
    }

    public static byte[] signar(byte[] text, PrivateKey Key){

        return new byte[0];
    }

    public static void concatenateByteArrays(byte[] encryptdigestionat){

    }

    public static void read(File f){

    }

    public static void write(String fitxerSignat){

    }
}
