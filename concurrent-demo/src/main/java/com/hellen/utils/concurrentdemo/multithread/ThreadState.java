package com.hellen.utils.concurrentdemo.multithread;

public class ThreadState implements Runnable {

    @Override
    public void run() {
        //System.out.println("当前线程id："+Thread.currentThread().getId());
        try {
            Thread.sleep(6000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int i = Integer.SIZE - 3;
        System.out.println(i);
        System.out.println( -1 << i);
        System.out.println( 0 << i);
        System.out.println( 1 << i);
        System.out.println( 2 << i);
    }
}
