package com.example.javaAssignments;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.util.regex.Pattern;

public class Assignment1 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Type Exit to exit");
            System.out.println("Enter file name to search");
            String inputRegex = scanner.next();
            if (inputRegex.equals("Exit") || inputRegex.equals("exit")) {
                break;
            } else {
                searchDirectory("/home/tbraju", inputRegex);
            }

        }
    }

    public static void searchDirectory(String searchDirectoryPath, String inputRegex){
        File searchFile = new File(searchDirectoryPath);
        if(searchFile.isDirectory()) {
            File[] filesList = searchFile.listFiles();
            if(filesList == null){
                System.out.println("Some Error Occurred");
            }
            else if (filesList.length > 0) {
                for (File file : filesList) {
                    if (file.isDirectory()) {
                        searchDirectory(file.getAbsolutePath(), inputRegex);
                    } else {
                        if (Pattern.matches(inputRegex, file.getName())) {
                            System.out.println("File Found: " + file.getAbsolutePath());
                        }
                    }
                }
            }
        }
        if(Pattern.matches(inputRegex, searchFile.getName())){
            System.out.println("File Found:" + searchFile.getAbsolutePath());
        }
    }
}
