package com.example.javaAssignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of input dates to process: ");
        int numberOfInputs = scanner.nextInt();
        scanner.nextLine();
        String[][] inputs = new String[numberOfInputs][2];
        System.out.println("Enter the dates with space in between in dd-MM-yyyy format");
        for (int i = 0; i < numberOfInputs; i++) {
            System.out.println("Enter input " + (i+1) + ": ");
            inputs[i] = scanner.nextLine().split(" ");
        }
        for (String[] input : inputs) {
            try {
                Date singUpDate = new SimpleDateFormat("dd-MM-yyyy").parse(input[0]);
                Date currentDate = new SimpleDateFormat("dd-MM-yyyy").parse(input[1]);
                if (singUpDate.after(currentDate)) {
                    System.out.println("No range");
                } else {
                    Calendar currentYear = Calendar.getInstance();
                    Calendar minFillDate = Calendar.getInstance();
                    Calendar maxFillDate = Calendar.getInstance();
                    currentYear.setTime(currentDate);
                    minFillDate.setTime(singUpDate);
                    maxFillDate.setTime(singUpDate);
                    minFillDate.add(Calendar.DATE, -30);
                    maxFillDate.add(Calendar.DATE, 30);
                    minFillDate.set(Calendar.YEAR, currentYear.get(Calendar.YEAR));
                    maxFillDate.set(Calendar.YEAR, currentYear.get(Calendar.YEAR));
                    if (maxFillDate.after(currentYear)) {
                        maxFillDate = currentYear;
                    }

                    System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(minFillDate.getTime()) + " " +
                            new SimpleDateFormat("dd-MM-yyyy").format(maxFillDate.getTime()));
                }
            } catch (ParseException e) {
                System.out.println("Error occurred" + e.getMessage());
            }
        }
//        int input = scanner.next()

    }
}
