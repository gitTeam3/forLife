package com.gitteam3.forlife.psdMonitor.core;

import java.util.Map;
import java.util.TreeMap;

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
     *
     * @return　翻译后的十进制数组
     */
    public  int[] binToDecimal(){

        int[] results = new int[bins.length];
        for(int i =0;i<bins.length;i++){
            results[i] = Integer.parseInt(bins[i].toString(),2)+1;
//System.out.println(bins[i].toString()+">>"+results[i]);
        }
        return results;
    }

    /**
     *
     * @return 翻译后得到的字符
     */
    public  String[] binToChar(){

        String[] results = new String[bins.length];
        for (int i=0;i<bins.length;i++){
            results[i]= (String) LetterMap.getMap().get( Integer.parseInt(bins[i].toString(),2)+1 );
//System.out.println(bins[i].toString()+">>"+Integer.parseInt(bins[i].toString(),2)+1);
        }
        return results;
    }

    public Object[] getBins() {
        return bins;
    }

    public void setBins(Object[] bins) {
        this.bins = bins;
    }
}
