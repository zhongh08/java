package com.syoki.java.thread;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

    private static final int THREAD_NUM = 5;

    public static class WorkerThread implements Runnable {

        CyclicBarrier barrier;

        public WorkerThread(CyclicBarrier b) {
            this.barrier = b;
        }

        @Override
        public void run() {
            try {
                System.out.println("Worker's waiting");
                // 线程在这里等待，直到所有线程都到达barrier
                barrier.await();
                System.out.println("ID:"+Thread.currentThread().getId()+" Working");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(THREAD_NUM, new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Barrier");
            }
        });

        for (int i=0;i<THREAD_NUM;i++) {
            new Thread(new WorkerThread(cb)).start();
        }
    }

}
