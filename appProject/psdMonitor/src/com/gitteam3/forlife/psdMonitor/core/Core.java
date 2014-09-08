package com.gitteam3.forlife.psdMonitor.core;

/**
 * Author: zihao
 * Summary:
 * Date: 14-9-8
 */
public class Core {


    public String[] getBinStr(String memoryable){

        return divide(uk(memoryable),6);
    }

    private static byte[] uk(String inStr){

        byte bins[] = new byte[1000];//用于存放二进制码的字节数组
        int counter = 0;//记录ｂｉｎｓ数组的下标
        for(int i =inStr.getBytes()[0];i<inStr.getBytes()[0]+100;i++) {
            int temp[] = SHA1.getAfterSHA1(inStr+i);
            for (int aTemp : temp) {
                bins[counter] = (byte) (aTemp%2);//奇数填１偶数填０
                counter++;
            }
        }
        return bins;
    }

    /**
     *
     * @param bytes 需要被划分的字节数组
     * @param grop　按多少位划分一组
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
