package com.example.javaAssignments.Assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExp {

    public static Boolean checkString(String input){
        return Pattern.matches("[A-Z].*[.]$", input);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to check: ");
        if(checkString(scanner.nextLine())){
            System.out.println("String starts with a capital letter and ends with .");
        } else{
            System.out.println("String doesn't match the requirement");
        }

    }
}
