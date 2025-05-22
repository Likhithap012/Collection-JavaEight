package com.gevernova.javaeightfeatures.functionalinterface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> lengthOfString = str -> str.length();
        System.out.println(lengthOfString.apply("hello")); // 5
    }
}

