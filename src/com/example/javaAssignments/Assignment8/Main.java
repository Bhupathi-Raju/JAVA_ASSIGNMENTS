package com.example.javaAssignments.Assignment8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Type any number from 1-4: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        try {
            switch (input) {
                case 1 -> throw new Exception1("exception 1");
                case 2 -> throw new Exception2("exception 2");
                case 3 -> throw new Exception3("exception 3");
                case 4 -> throw new NullPointerException();
            }
        } catch (Exception1 | Exception3 | Exception2 e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Reached finally");
        }
    }
}
