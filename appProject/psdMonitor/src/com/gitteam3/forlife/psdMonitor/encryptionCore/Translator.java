package com.gitteam3.forlife.psdMonitor.encryptionCore;

/**
 * Author: zihao
 * Summary:二进制的数组的翻译类
 * Date: 14-9-8
 */
public class Translator {

    private Object[] bins;//需要翻译的二进制数组
    public Translator(Object[] bins){
        this.bins = bins;
    }
    /**
     *＠summary 二进制专十进制
     * @return　翻译后的十进制数组
     */
    public  int[] binToDecimal(){

        if(bins.length>0) {
            int[] results = new int[bins.length];
            for (int i = 0; i < bins.length; i++) {
                results[i] = Integer.parseInt(bins[i].toString(), 2) + 1;//二进制转换为十进制再加一
//System.out.println(bins[i].toString()+">>"+results[i]);
            }
            return results;
        }
        else return null;
    }

    /**
     *@summary 二进制专字符
     * @return 翻译后得到的字符
     */
    public  String[] binToChar(){

        if(bins.length>0) {
            String[] results = new String[bins.length];
            for (int i = 0; i < bins.length; i++) {
                //先将二进制转换为十进制加一然后到字符映射表查找对应的字符
                results[i] = (String) LetterMap.getMap().get(Integer.parseInt(bins[i].toString(), 2) + 1);
//System.out.println(bins[i].toString()+">>"+Integer.parseInt(bins[i].toString(),2)+1);
            }
            return results;
        }
        else return null;
    }

    public Object[] getBins() {
        return bins;
    }

    public void setBins(Object[] bins) {
        this.bins = bins;
    }
}
