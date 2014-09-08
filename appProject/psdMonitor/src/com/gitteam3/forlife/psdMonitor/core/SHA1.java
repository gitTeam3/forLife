package com.gitteam3.forlife.psdMonitor.core;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Author: zihao
 * Summary:
 * Date: 14-9-6
 */
public class SHA1 {

    public static int[] getAfterSHA1(String inStr) throws NoSuchAlgorithmException {
        int outBytes[];//最终向外输出的字节数组
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        byte digests[] = md.digest(inStr.getBytes());
        outBytes = new int[(int)digests.length/2];
        int pointer_L =0;
        int pointer_R =digests.length-1;

        while(pointer_R - pointer_L >= 0){
            byte l = (byte) Math.abs( digests[pointer_L] );
            byte r = (byte) Math.abs( digests[pointer_R] );
            outBytes[pointer_L] = l*r;
            pointer_L++;
            pointer_R--;

        }
        return outBytes;
    }
}
