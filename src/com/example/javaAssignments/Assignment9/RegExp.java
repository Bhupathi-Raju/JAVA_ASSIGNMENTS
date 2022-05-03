package com.example.javaAssignments;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to check: ");
        String input = scanner.nextLine();
        if(Pattern.matches("[A-Z].*[.]$", input)){
            System.out.println("String starts with a capital letter and ends with .");
        }else{
            System.out.println("String doesn't match the requirement");
        }
    }
}
