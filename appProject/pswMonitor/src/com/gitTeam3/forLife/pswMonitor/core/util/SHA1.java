package com.gitTeam3.forLife.pswMonitor.core.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Author: zihao
 * Summary:
 * Date: 14-9-6
 */
public class SHA1 {

    public static byte[] digest(String inStr,String Algorithm) throws NoSuchAlgorithmException {
        String outStr ="";
            MessageDigest md = MessageDigest.getInstance(Algorithm);
        byte digests[] = md.digest(inStr.getBytes());
        return digests;
    }
}
