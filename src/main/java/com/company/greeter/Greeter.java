package com.company.greeter;

public final class Greeter {

    private Greeter() {
    }

    public static String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
