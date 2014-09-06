package com.gitTeam3.forLife.pswMonitor.core;

import org.junit.Test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Author: zihao
 * Summary: This class is encryption's core
 * Date: 14-9-6
 */
public class Core {

    private String memoryable;
    public Core(String memoryable){
        this.memoryable = memoryable;
    }
    public String getEncriptedNumber(){


        return null;
    }
    public String getEncriptedLetter(){

        return null;
    }

    public String getMemoryable() {
        return memoryable;
    }

    public void setMemoryable(String memoryable) {
        this.memoryable = memoryable;
    }
     public byte[] encrypt(String inStr){
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte bytes[] = md.digest(inStr.getBytes());
        System.out.println(bytes.length);
        /*for(byte b:bytes){
            System.out.println((char) b);
        }*/
        return bytes;
    }



}
