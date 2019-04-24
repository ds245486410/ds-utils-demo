package com.hellen.utils.concurrentdemo.atomic;

import com.hellen.utils.concurrentdemo.ConcurrentDemoApplicationTests;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

@Slf4j
public class AtomTest extends ConcurrentDemoApplicationTests {
    private volatile int  a  = 100;
    @Test
    public void testBoolean(){
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        atomicBoolean.set(false);
        System.out.println(atomicBoolean);
    }
    @Test
    public void testInteger(){
        AtomicInteger atomicInteger = new AtomicInteger(10);
        System.out.println(atomicInteger);
    }
    @Test
    public void testIntegerArray(){
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(new int[]{1000, 101010});
        int i = atomicIntegerArray.get(0);
        System.out.println(i);
    }
    @Test
    public void testIngeterFieldUpdater(){
        AtomicIntegerFieldUpdater<AtomTest> a = AtomicIntegerFieldUpdater.newUpdater(AtomTest.class, "a");
        AtomTest test = new AtomTest();
        boolean b = a.compareAndSet(test, 100, 200);
        System.out.println(b);
        System.out.println(test.a);
    }
    @Test
    public void testLong(){

    }
    @Test
    public void testLongArray(){

    }
    @Test
    public void testLongFieldUpdater(){

    }@Test
    public void testMarkableReference(){

    }@Test
    public void testReference(){

    }@Test
    public void testReferenceFieldUpdater(){

    }
    @Test
    public void testStampedReference(){

    }
    @Test
    public void testDoubleAccumulator(){

    }
    @Test
    public void testDoubleAdder(){

    }
    @Test
    public void testLongAccumlator(){

    }
    @Test
    public void testLongAdder(){

    }
    @Test
    public void testStriped64(){

    }





}
