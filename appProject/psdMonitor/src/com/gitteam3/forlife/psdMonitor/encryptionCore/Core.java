package com.gitteam3.forlife.psdMonitor.encryptionCore;

import com.gitteam3.forlife.psdMonitor.encryptionCore.exception.InStrNullException;

/**
 * Author: zihao
 * Summary:　本类将一个任意字符串转换为一个ｉｎｔ数组和Ｓｔｒｉｎｇ数组
 * Date: 14-9-8
 */
public class Core {

    private String memoryable = "";
    public Core(String memoryable){
        this.memoryable = memoryable;
    }

    /**
     *
     * @summary　调用此方法得到数字数组
     * @return　装有１～９的数组
     */
    public int[] getDecimal() throws InStrNullException {

        Translator t;
        if(memoryable.length()>0) {
            t = new Translator(divide(getBins(memoryable), 3));
        }
        else{
            throw new InStrNullException();
        }
        return t.binToDecimal();
    }

    /**
     *
     * @summary 调用此方法得到字符数组
     * @return　装有Ａ－Ｚ，ａ－ｚ，及十二个特殊字符的数组（特殊字符暂未输入用的＝代替）
     */
    public String[] getLetter() throws InStrNullException {

        Translator t;
        if(memoryable.length()>0) {
            t = new Translator(divide(getBins(memoryable), 6));
        }
        else{
            throw new InStrNullException();
        }
        return t.binToChar();
    }

    private static byte[] getBins(String inStr){

        byte bins[] = new byte[1000];//最后返回的装有二进制码的字节数组
        int counter = 0;//ｂｉｎｓ数组的下标指针
        for(int i =inStr.getBytes()[0];i<inStr.getBytes()[0]+100;i++) {
            int temp[] = SHA1.getAfterSHA1(inStr+i);
            for (int aTemp : temp) {
                bins[counter] = (byte) (aTemp%2);//根据aTemp的奇偶性填充１或０
                counter++;
            }
        }
        return bins;
    }

    /**
     *
     * @param bytes 需要被分组的字节数组
     * @param grop　每组的长度
     *
     */
    private String[] divide(byte[] bytes,int grop){
        String results[] = new String[bytes.length/grop];
        int counter = 0;
         String str="";
        for(byte b :bytes){
            str+= b;
            if(str.length()>=grop && counter<results.length){
                results[counter] = str;
                str="";
                counter++;
            }

        }
        return results;
    }
}
