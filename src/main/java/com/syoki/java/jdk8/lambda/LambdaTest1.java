package com.syoki.java.jdk8.lambda;

public class LambdaTest1 {

    public static void main(String[] args) {
        // 使用Lambda
        Runnable r1 = () -> System.out.println("Hello World 1");

        // 使用匿名类
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World 2");
            }
        };

        process(r1);
        process(r2);
        process(()-> System.out.println("Hello World 3"));

    }

    public static void process(Runnable r) {
        r.run();
    }

}
