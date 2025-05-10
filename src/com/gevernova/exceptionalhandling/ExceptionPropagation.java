package com.gevernova.exceptionalhandling;

import java.util.Scanner;

public class ExceptionPropagation {
    public static void methodTwo(int numOne, int numTwo){
        methodOne(numOne, numTwo);
    }
    public static void methodOne(int numOne, int numTwo){
        try{
            System.out.println(numOne / numTwo);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numOne =scanner.nextInt();
        int numTwo = scanner.nextInt();
        methodTwo(numOne, numTwo);

    }
}
