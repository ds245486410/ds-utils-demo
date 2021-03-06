package com.hellen.utils.concurrentdemo.multithread;

public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            Long time = ThreadLocalTool.tl.get();
            if(time == null){
                ThreadLocalTool.tl.set(System.currentTimeMillis());
            }
            System.out.println("ThreadA"+time);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
