package com.gevernova.javaeightfeatures.functionalinterface;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> greet = name -> System.out.println("Hello " + name);
        greet.accept("Alice"); // Hello Alice
    }
}

