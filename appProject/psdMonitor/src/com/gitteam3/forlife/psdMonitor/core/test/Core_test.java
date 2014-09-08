package com.gitteam3.forlife.psdMonitor.core.test;

import com.gitteam3.forlife.psdMonitor.core.Core;
import org.junit.Test;

/**
 * Author: zihao
 * Summary:Core.java µƒ≤‚ ‘¿‡
 * Date: 14-9-8
 */
public class Core_test {
    @Test
    public void testUk(){
        String[] b = new Core().getBinStr("zfbzh5");
        System.out.println("bins.length="+b.length);
        for(String bb:b)
            System.out.println(bb);

        /*String str = new BigDecimal(3.141592665).;
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(52));*/
    }
}
