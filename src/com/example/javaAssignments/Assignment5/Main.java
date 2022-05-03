package com.example.javaAssignments.Assignment5;

public class Main {
    public static void main(String[] args){
        Data data = new Data();
        data.printInit();
        data.printNonInit();

        Singleton singleton = Singleton.initVar("test string");
        singleton.print();
    }
}
