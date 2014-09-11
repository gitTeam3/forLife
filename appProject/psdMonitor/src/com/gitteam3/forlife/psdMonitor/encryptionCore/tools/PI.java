package com.gitteam3.forlife.psdMonitor.encryptionCore.tools;
/**
 * Author: zihao
 * Summary:���ڼ���Уɵ�ֵ
 * Date: 14-9-8
 */
import java.math.*;
public class PI {

    private  BigDecimal result;//���յļ�����

    public  void run(int n, int scale) {

        BigDecimal upper = new BigDecimal(426880.0000 * Math.sqrt(10005.0000));
        upper = upper.setScale(scale, BigDecimal.ROUND_HALF_EVEN);
        BigDecimal downer = BigDecimal.valueOf(0);

        for (int i = 0; i <= n; i++) {
            BigDecimal d0 = factorial(6 * i).multiply ( new BigDecimal( 545140134 * i + 13591409));
            BigDecimal d1 = factorial(i);
            BigDecimal d2 = pow(d1, 3);
            BigDecimal d3 = factorial(3 * i);
            BigDecimal d4 = pow(-640320, 3 * i);
            BigDecimal d5 = d2.multiply(d3);
            BigDecimal d6 = d4.multiply(d5);
            BigDecimal d = d0.divide( d6, BigDecimal.ROUND_HALF_EVEN );
            downer = downer.add(d);

        }
        result = upper.divide(downer, BigDecimal.ROUND_HALF_EVEN);
    }

    public BigDecimal getResult() {
        return result;
    }

    private static BigDecimal pow(double val, int power){
        return pow(new BigDecimal(val), power);
    }

    private static BigDecimal pow(BigDecimal val, int power){
        BigDecimal value = BigDecimal.valueOf(1);
        for(int i = 1; i <= power; i ++){
            value = value.multiply(val);
        }
        return value;
    }

    private static BigDecimal factorial(int n){
        BigDecimal value = BigDecimal.valueOf(1);
        for(int i = 1; i <=n ; i++){
            value = value.multiply(BigDecimal.valueOf(i));
        }
        return value;
    }
}