package com.gitteam3.forlife.psdMonitor.encryptionCore.test;

import com.gitteam3.forlife.psdMonitor.encryptionCore.SHA1;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;

/**
 * Author: zihao
 * Summary:
 * Date: 14-9-8
 */
public class SHA1_Test {
    @Test
    public void testGetOutString() throws NoSuchAlgorithmException {
        for(int i=99;i>0;i--) {
            int b[] = SHA1.getAfterSHA1("sgsd" + i);
            for (int temp : b) {
                System.out.print(temp + " - ");
            }
            System.out.println();
        }
    }

}
