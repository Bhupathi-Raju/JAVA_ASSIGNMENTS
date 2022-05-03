package com.example.javaAssignments.Assignment5;

public class Singleton {
    String testVar;

    Singleton(String input){
        testVar = input;
    }

    public static Singleton initVar(String input){
        return new Singleton(input);
    }

    public void print(){
        System.out.println(testVar);
    }
}
