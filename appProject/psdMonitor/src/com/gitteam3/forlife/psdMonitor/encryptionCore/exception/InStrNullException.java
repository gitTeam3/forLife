package com.gitteam3.forlife.psdMonitor.encryptionCore.exception;

/**
 * Author: zihao
 * Summary: 当被加密字符为空时此异常对象被抛出
 * Date: 14-9-10
 */
public class InStrNullException extends Exception{
    public InStrNullException() {
        super("In String is null!!");
    }
}
