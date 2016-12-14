package com.company;

import org.jcp.xml.dsig.internal.dom.Utils;

import java.io.*;
import java.security.*;

public class Main {

    public static final String PRIVATE_KEY_FILE = "private.key";

    public static final String FITXER_PLA = "Sparring.pdf";
    public static final String FITXER_SIGNAT = "firmat.pdf";


    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, ClassNotFoundException {

        KeyPair keyPair = null;
        PrivateKey prik = null;

        File f = new File(FITXER_PLA);

        if(!com.company.Utils.areKeysPresent()){
            keyPair = com.company.Utils.generatekey();
            prik = keyPair.getPrivate();
        }else{
            ObjectInputStream inputStream = null;
            inputStream = new ObjectInputStream(new FileInputStream(PRIVATE_KEY_FILE));
            prik = (PrivateKey) inputStream.readObject();
        }

        byte[] digestionat = com.company.Utils.digestiona(f,"MD5");
        byte[] encryptdigestionat = com.company.Utils.signar(digestionat,prik);
        System.out.println("Longitud del fitxer: "+f.length());
        System.out.println("Longitud de la firma: "+encryptdigestionat.length);
        com.company.Utils.write(FITXER_SIGNAT,com.company.Utils.concatenateByteArrays(com.company.Utils.read(f),encryptdigestionat));

    }
}
