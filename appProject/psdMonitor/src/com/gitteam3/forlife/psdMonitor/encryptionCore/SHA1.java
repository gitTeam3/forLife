package com.gitteam3.forlife.psdMonitor.encryptionCore;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Author: zihao
 * Summary: SHA-1加密工具
 * Date: 14-9-6
 */
public class SHA1 {

    public static int[] getAfterSHA1(String inStr){
        int outBytes[] = null;//��������������ֽ�����
        MessageDigest md = null;//��ȡ���ܶ���ָ���ǣӣȣ����㷨
        try {
            md = MessageDigest.getInstance("SHA-1");
            byte digests[] = md.digest(inStr.getBytes());//��ü��ܺ��ֵ
            outBytes = new int[(int)digests.length/2];
            int pointer_L =0;
            int pointer_R =digests.length-1;

            while(pointer_R - pointer_L >= 0){
                outBytes[pointer_L] = Math.abs( digests[pointer_L] )*Math.abs( digests[pointer_R] );//Ϊ��ʹÿ����ݵ�ֵ���
                pointer_L++;
                pointer_R--;

            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return outBytes;
    }
}
