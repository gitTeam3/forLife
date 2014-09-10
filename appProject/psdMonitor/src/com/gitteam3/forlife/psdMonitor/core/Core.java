package com.gitteam3.forlife.psdMonitor.core;

/**
 * Author: zihao
 * Summary:
 * Date: 14-9-8
 */
public class Core {

    public int[] getDecimal(String memoryable){

        Translator t = new Translator(divide(uk(memoryable),3));

        return t.binToDecimal();
    }

    public String[] getLetter(String memoryable){

        Translator t = new Translator(divide(uk(memoryable),6));

        return t.binToChar();
    }

    private static byte[] uk(String inStr){

        byte bins[] = new byte[1000];//���ڴ�Ŷ���������ֽ�����
        int counter = 0;//��¼�����������±�
        for(int i =inStr.getBytes()[0];i<inStr.getBytes()[0]+100;i++) {
            int temp[] = SHA1.getAfterSHA1(inStr+i);
            for (int aTemp : temp) {
                bins[counter] = (byte) (aTemp%2);//�����ż���
                counter++;
            }
        }
        return bins;
    }

    /**
     *
     * @param bytes ��Ҫ�����ֵ��ֽ�����
     * @param grop��������λ����һ��
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
