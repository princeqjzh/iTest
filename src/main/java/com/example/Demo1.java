package com.example;

/**
 * Created by jizhi.qian on 2018/11/14.
 */
public class Demo1 {
    public int intAdd(int a, int b){
        int r = a + b;
        return r;
    }

    public int intSubtract(int a, int b){
        int r = a - b;
        return r;
    }

    public long intMultiply(int a, int b){
        long r = a * b;
        return r;
    }

    public int intSubtract2(int a, int b){
        int r = a - b;
        return r;
    }

    public int countlength(String str) {
        int leng = str.length();
        if(leng > 10){
            return -1;
        }
        return leng;
    }
}
