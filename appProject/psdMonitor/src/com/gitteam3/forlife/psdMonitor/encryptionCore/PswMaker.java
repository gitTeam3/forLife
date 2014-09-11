package com.gitteam3.forlife.psdMonitor.encryptionCore;

/**
 * Author: zihao
 * Summary: 供ｕｉ层直接调用的类
 * Date: 14-9-11
 */
public class PswMaker {

    private Regulation reg ;
    public PswMaker(Regulation reg){
        this.reg = reg;
    }

    public Regulation getReg() {
        return reg;
    }

    public void setReg(Regulation reg) {
        this.reg = reg;
    }

}
