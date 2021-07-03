package com.test;

import com.example.Demo1;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

/**
 * Created by jizhi.qian on 2018/11/14.
 */
public class UnitTest {
    @Test
    public void testAddInt(){
        int a = new Random().nextInt(1000);
        int b = new Random().nextInt(2000);

        int c = a + b;
        int r = new Demo1().intAdd(a, b);
        Assertions.assertEquals(c, r,"函数intAdd(a, b)实际返回值：" + r + ", 期望值：" + c);
    }

    @Test
    public void testSubtractInt(){
        int a = new Random().nextInt(1000);
        int b = new Random().nextInt(2000);

        int c = a - b;
        int r = new Demo1().intSubtract(a, b);
        Assertions.assertEquals(c, r, "函数intSubtract(a, b)实际返回值：" + r + ", 期望值：" + c);
    }

    @Test
    public void testSubtractInt2(){
        int a = new Random().nextInt(1000);
        int b = new Random().nextInt(2000);

        int c = a - b;
        int r = new Demo1().intSubtract2(a, b);
        Assertions.assertEquals(c, r, "函数intSubtract2(a, b)实际返回值：" + r + ", 期望值：" + c);
    }

    @Test
    public void testMultiplyInt(){
        int a = new Random().nextInt(1000);
        int b = new Random().nextInt(2000);

        long c = a * b;
        long r = new Demo1().intMultiply(a, b);
        Assertions.assertEquals(c, r, "函数intMultiply(a, b)实际返回值：" + r + ", 期望值：" + c);
    }

    @Test
    public void testStringLeng() throws Exception{
        String str = "1234567890";
        int actLen = new Demo1().countlength(str);
        int expLen = str.length();
        Assertions.assertEquals(expLen, actLen, "函数countlength(l)实际返回值：" + actLen + ", 期望值：" + expLen);
    }
}
