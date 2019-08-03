package com.syoki.java.basic;

public class Child extends Parent {

    static {
        System.out.println("static in Child");
    }

    {
        System.out.println("In class Child");
    }

    public Child() {
        System.out.println("Child Contructor");
    }

    public static void main(String[] args) {
        new Child();
    }

}
