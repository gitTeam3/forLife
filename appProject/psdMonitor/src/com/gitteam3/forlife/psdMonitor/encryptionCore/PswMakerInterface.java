package com.gitteam3.forlife.psdMonitor.encryptionCore;

import com.gitteam3.forlife.psdMonitor.encryptionCore.tools.PI;
import com.gitteam3.forlife.psdMonitor.encryptionCore.tools.PswSource;

/**
 * Author: zihao
 * Summary: 密码生成器的结构，上层ｕｉ只用针对接口进行调用
 * Date: 14-9-11
 */
public interface PswMakerInterface {
    public Regulation getReg();
    public void setReg(Regulation reg);
    public String produce();
}
