package com.gitteam3.forlife.psdMonitor.encryptionCore;

import com.gitteam3.forlife.psdMonitor.encryptionCore.exception.InStrNullException;
import com.gitteam3.forlife.psdMonitor.encryptionCore.tools.PswSource;

/**
 * Author: zihao
 * Summary: 供ｕｉ层直接调用的类
 * Date: 14-9-11
 */
public class BasicPswMaker implements PswMakerInterface {

    private Regulation reg ;
    public BasicPswMaker(Regulation reg){
        this.reg = reg;
    }

    @Override
    public Regulation getReg() {
        return reg;
    }

    @Override
    public void setReg(Regulation reg) {
        this.reg = reg;
    }

    @Override
    public String produce() throws InStrNullException {
        String psw ="";
        PswSource ps = new PswSource(reg.getMemoryable()+reg.getPswSeek());
        int[] numbers;
        String[] letters;
        numbers = ps.getDecimal();
        letters = ps.getLetter();
        psw = merge(getNumbers(numbers,(reg.getLength()-reg.getLetter())),getLetters(letters,reg.getLetter()));

        for(int i = 1;i<=reg.getIteration();i++){
            ps.setMemoryable(psw+reg.getPswSeek());
            numbers = ps.getDecimal();
            letters = ps.getLetter();
            psw = merge(getNumbers(numbers,(reg.getLength()-reg.getLetter())),getLetters(letters,reg.getLetter()));        }

        return psw;
    }

    private String[] getNumbers(int[] decimals,int len){

        String[] numbers = new String[len];
        int start = Integer.parseInt(decimals[0]+""+decimals[1]);
        for(int i = 0;i<len;i++){
            numbers[i] = String.valueOf(decimals[start+i]);
        }
        return numbers;
    }

    private String[] getLetters(String[] str_letter,int len){

        String[] letters = new String[len];
        int start = str_letter[0].getBytes()[0];
        for(int i = 0;i<len;i++){
            letters[i] = str_letter[start+1];
        }
        return letters;
    }

    private String merge(String[] nums,String[] letters){

        return null;
    }

}
