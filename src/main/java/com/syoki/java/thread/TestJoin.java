package com.syoki.java.thread;

public class TestJoin {

    public static int a = 0;

    public static void main(String[] args){

        Thread thread = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0;i<5;i++)
                    a++;
            }
        });
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(a);

    }

}
