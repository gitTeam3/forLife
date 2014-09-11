package com.gitteam3.forlife.psdMonitor.encryptionCore;

/**
 * Author: zihao
 * Summary:用于封装生成密码的规则的类
 * Date: 14-9-11
 */
public class Regulation {

    private int length = 6;//默认密码总长度为６
    private int letter = 0;//默认生成的密码不含字母
    private String pswSeek ="";//密码种子　默认为空

    public Regulation(){}

    public Regulation(int length, int letter, String pswSeek) {
        this.length = length;
        this.letter = letter;
        this.pswSeek = pswSeek;
    }
    public String getPswSeek() {
        return pswSeek;
    }

    public void setPswSeek(String pswSeek) {
        this.pswSeek = pswSeek;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLetter() {
        return letter;
    }

    public void setLetter(int letter) {
        this.letter = letter;
    }

}
