package com.gitTeam3.forLife.pswMonitor.core.test;

import com.gitTeam3.forLife.pswMonitor.core.Core;
import com.gitTeam3.forLife.pswMonitor.core.util.SHA1;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;

/**
 * Author: zihao
 * Summary:
 * Date: 14-9-6
 */
public class Core_Test {
        @Test
        public void testEncrype(){

            Core c = new Core("aaa");
            System.out.print("1: ");
            c.encrypt("ab");
            System.out.print("2: ");
            c.encrypt("bcd");
            System.out.print("3: ");
            c.encrypt("cdsdgfef");
            System.out.print("4: ");
            c.encrypt("de549tfyrdtfsdg1365g");
        }

}
