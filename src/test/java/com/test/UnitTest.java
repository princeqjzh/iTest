package com.test;

import com.example.Demo1;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;
import org.apache.log4j.Logger;


public class UnitTest {
    private Logger logger = Logger.getLogger(UnitTest.class);

    @Test
    public void testAddInt(){
        int a = new Random().nextInt(1000);
        int b = new Random().nextInt(2000);

        int c = a + b;
        int r = new Demo1().intAdd(a, b);
        logger.info("函数intAdd(a, b)实际返回值：" + r + ", 期望值：" + c);
        Assertions.assertEquals(c, r,"函数intAdd(a, b)实际返回值：" + r + ", 期望值：" + c);
    }

    @Test
    public void testSubtractInt(){
        int a = new Random().nextInt(1000);
        int b = new Random().nextInt(2000);

        int c = a - b;
        int r = new Demo1().intSubtract(a, b);
        logger.info("函数intSubtract(a, b)实际返回值：" + r + ", 期望值：" + c);
        Assertions.assertEquals(c, r, "函数intSubtract(a, b)实际返回值：" + r + ", 期望值：" + c);
    }

    @Test
    public void testSubtractInt2(){
        int a = new Random().nextInt(1000);
        int b = new Random().nextInt(2000);

        int c = a - b;
        int r = new Demo1().intSubtract2(a, b);
        logger.info("函数intSubtract2(a, b)实际返回值：" + r + ", 期望值：" + c);
        Assertions.assertEquals(c, r, "函数intSubtract2(a, b)实际返回值：" + r + ", 期望值：" + c);
    }

    @Test
    public void testMultiplyInt(){
        int a = new Random().nextInt(100);
        int b = new Random().nextInt(200);

        int c = a * b;
        int r = new Demo1().intMultiply(a, b);
        logger.info("函数intMultiply(a, b)实际返回值：" + r + ", 期望值：" + c);
        Assertions.assertEquals(c, r, "函数intMultiply(a, b)实际返回值：" + r + ", 期望值：" + c);
    }

    @Test
    public void testStringLeng(){
        String str = "1234567890";
        int actLen = new Demo1().countlength(str);
        int expLen = str.length();
        logger.info("函数countlength(l)实际返回值：" + actLen + ", 期望值：" + expLen);
        Assertions.assertEquals(expLen, actLen, "函数countlength(l)实际返回值：" + actLen + ", 期望值：" + expLen);
    }

    @Test
    public void testStringLeng1(){
        String str = "123456789012";
        int actLen = new Demo1().countlength(str);
        int expLen = -1;
        logger.info("函数countlength(l)实际返回值：" + actLen + ", 期望值：" + expLen);
        Assertions.assertEquals(expLen, actLen, "函数countlength(l)实际返回值：" + actLen + ", 期望值：" + expLen);
    }
}
