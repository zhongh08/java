package com.syoki.java.thread;

import java.util.concurrent.Exchanger;

public class ExchangerTest {

    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        Car car = new Car(exchanger);
        Bike bike = new Bike(exchanger);
        car.start();
        bike.start();
        System.out.println("Main end!");
    }

}

class Car extends Thread {
    private Exchanger<String> exchanger;

    public Car(Exchanger<String> exchanger) {
        super();
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + ": " + exchanger.exchange("Car"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Bike extends Thread {
    private Exchanger<String> exchanger;

    public Bike(Exchanger<String> exchanger) {
        super();
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + ": " + exchanger.exchange("Bike"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}