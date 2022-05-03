package com.example.javaAssignments.Assignment5;

public class Data {

    int testInt;
    char testChar;

//    public static void main(String[] args){
//        printInit();
//        printNonInit();
//    }

    public void printNonInit(){
        System.out.println("Int: " + testInt);
        System.out.println("Char: " + testChar);
    }

    public void printInit(){
        /*
        int localInit;
        char localChar;
        System.out.println("Int: " + localInit);
        System.out.println("Char: " + localChar);
         couldn't print without initializing them as they are just defined but not assigned to any value.
         */
    }
}
