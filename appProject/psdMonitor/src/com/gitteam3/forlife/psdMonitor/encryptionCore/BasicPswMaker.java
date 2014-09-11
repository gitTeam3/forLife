package com.gitteam3.forlife.psdMonitor.encryptionCore;

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
    public String produce(){
        return null;
    }

    private String getNumber(){

        return null;
    }

    private String getLetter(){

        return null;
    }

}
