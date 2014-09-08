package com.gitteam3.forlife.psdMonitor.core;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Author: zihao
 * Summary:算出给定字符串的ＳＨＡ１值
 * Date: 14-9-6
 */
public class SHA1 {

    public static int[] getAfterSHA1(String inStr){
        int outBytes[] = null;//最终向外输出的字节数组
        MessageDigest md = null;//获取加密对象并指定是ＳＨＡ１算法
        try {
            md = MessageDigest.getInstance("SHA-1");
            byte digests[] = md.digest(inStr.getBytes());//获得加密后的值
            outBytes = new int[(int)digests.length/2];
            int pointer_L =0;
            int pointer_R =digests.length-1;

            while(pointer_R - pointer_L >= 0){
                outBytes[pointer_L] = Math.abs( digests[pointer_L] )*Math.abs( digests[pointer_R] );//为了使每个数据的值变大
                pointer_L++;
                pointer_R--;

            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return outBytes;
    }
}
