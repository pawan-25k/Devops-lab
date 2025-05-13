package com.example;

public class HelloWorld {
    public String sayHello() {
        return "Hello, Jenkins!";
    }

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        System.out.println(hw.sayHello());
    }
}
