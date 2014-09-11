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
        psw = merge(getNumbers(numbers),getLetters(letters));

        for(int i = 1;i<=reg.getIteration();i++){
            ps.setMemoryable(psw+reg.getPswSeek());
            numbers = ps.getDecimal();
            letters = ps.getLetter();
            psw = merge(getNumbers(numbers),getLetters(letters));
        }

        return psw;
    }

    private String[] getNumbers(int[] decimals){

        return null;
    }

    private String[] getLetters(String[] letters){

        return null;
    }

    private String merge(String[] nums,String[] letters){

        return null;
    }
}
