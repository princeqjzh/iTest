package com.example;

public class Demo1 {
    public int intAdd(int a, int b){
        int r = a + b;
        return r;
    }

    public int intSubtract(int a, int b){
        int r = a - b;
        return r;
    }

    public int intMultiply(int a, int b){
        int r = a * b;
        return r;
    }

    public int intSubtract2(int a, int b) {
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
