package com.gitteam3.forlife.psdMonitor.encryptionCore;

import java.util.Map;
import java.util.TreeMap;

/**
 * Author: zihao
 * Summary:　字符映射表类
 * Date: 14-9-8
 */
public class LetterMap {

    private LetterMap instance = new LetterMap();
    private static TreeMap map = new TreeMap();

    /**
     * 以下代码只用被加载一次所以放在静态代码块中
     */
    static{
        map.put(Integer.valueOf(1),"E");
        map.put(Integer.valueOf(2),"T");
        map.put(Integer.valueOf(3),"O");
        map.put(Integer.valueOf(4),"S");
        map.put(Integer.valueOf(5),"B");
        map.put(Integer.valueOf(6),"M");
        map.put(Integer.valueOf(7),"U");
        map.put(Integer.valueOf(8),"A");
        map.put(Integer.valueOf(9),"D");
        map.put(Integer.valueOf(10),"R");
        map.put(Integer.valueOf(11),"z");
        map.put(Integer.valueOf(12),"F");
        map.put(Integer.valueOf(13),"C");
        map.put(Integer.valueOf(14),"N");
        map.put(Integer.valueOf(15),"y");
        map.put(Integer.valueOf(16),"V");
        map.put(Integer.valueOf(17),"W");
        map.put(Integer.valueOf(18),"x");
        map.put(Integer.valueOf(19),"J");
        map.put(Integer.valueOf(20),"X");
        map.put(Integer.valueOf(21),"G");
        map.put(Integer.valueOf(22),"P");
        map.put(Integer.valueOf(23),"u");
        map.put(Integer.valueOf(24),"Y");
        map.put(Integer.valueOf(25),"Z");
            map.put(Integer.valueOf(26),"=");
        map.put(Integer.valueOf(27),"Q");
        map.put(Integer.valueOf(28),"v");
        map.put(Integer.valueOf(29),"H");
        map.put(Integer.valueOf(30),"m");
        map.put(Integer.valueOf(31),"d");
        map.put(Integer.valueOf(32),"K");
            map.put(Integer.valueOf(33),"=");
        map.put(Integer.valueOf(34),"r");
        map.put(Integer.valueOf(35),"w");
        map.put(Integer.valueOf(36),"I");
        map.put(Integer.valueOf(37),"s");
            map.put(Integer.valueOf(38),"=");
        map.put(Integer.valueOf(39),"t");
        map.put(Integer.valueOf(40),"l");
            map.put(Integer.valueOf(41),"=");
        map.put(Integer.valueOf(42),"L");
        map.put(Integer.valueOf(43),"c");
        map.put(Integer.valueOf(44),"q");
        map.put(Integer.valueOf(45),"e");
        map.put(Integer.valueOf(46),"a");
        map.put(Integer.valueOf(47),"n");
            map.put(Integer.valueOf(48),"=");
        map.put(Integer.valueOf(49),"b");
            map.put(Integer.valueOf(50),"=");
        map.put(Integer.valueOf(51),"h");
            map.put(Integer.valueOf(52),"=");
            map.put(Integer.valueOf(53),"=");
            map.put(Integer.valueOf(54),"=");
            map.put(Integer.valueOf(55),"=");
        map.put(Integer.valueOf(56),"f");
        map.put(Integer.valueOf(57),"i");
        map.put(Integer.valueOf(58),"k");
            map.put(Integer.valueOf(59),"=");
        map.put(Integer.valueOf(60),"j");
        map.put(Integer.valueOf(61),"o");
            map.put(Integer.valueOf(62),"=");
        map.put(Integer.valueOf(63),"p");
        map.put(Integer.valueOf(64),"g");
    }
    private LetterMap(){}
    public LetterMap getInstance() {
        return instance;
    }

    public static Map getMap(){
        return map;
    }


}
