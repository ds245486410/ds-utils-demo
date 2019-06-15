package com.hellen.utils.concurrentdemo.multithread;

public class ThreadLocalTest {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.start();
        threadB.start();

    }
}
