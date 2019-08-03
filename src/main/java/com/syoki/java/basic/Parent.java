package com.syoki.java.basic;

public class Parent {

    static {
        System.out.println("static in Parent");
    }

    {
        System.out.println("In class Parent");
    }

    public Parent() {
        System.out.println("Parent Contructor");
    }

}
