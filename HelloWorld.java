package com.example;

public class HelloWorld {
    public String sayHello() {
        return "Hello, Welcome to Jenkins!";
    }

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        System.out.println(hw.sayHello());
    }
}
