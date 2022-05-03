package com.example.javaAssignments;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Assignment3 {
    public  static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the host to ping: ");
        String hostName = scanner.next();
        System.out.println("Enter how many times to ping: ");
//        String timesToPing = scanner.next();
        int timesToPing = 0;
        try {
            timesToPing = Integer.parseInt(scanner.next());
        }catch (NumberFormatException e){
            System.out.println("Input is not an integer");
        }
        ArrayList<Double> time = new ArrayList<>();

        ProcessBuilder build = new ProcessBuilder("ping", hostName, "-c", String.valueOf(timesToPing));
        Process process = build.start();
        BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String systemOutput = "";
        double d;
        int start;
        int end;

        while((systemOutput = input.readLine()) != null){
            System.out.println(systemOutput);
            if(systemOutput.contains("time=")){
                start = systemOutput.indexOf("time") + 5;
                end = systemOutput.indexOf("ms");
                d = Double.parseDouble(systemOutput.substring(start, end));
                time.add(d);
            }
        }
        Collections.sort(time);
        if(time.size() != 0) {
            if (time.size() % 2 == 0) {
                System.out.println("Median: " + (time.get(((time.size() / 2) - 1)) + time.get(((time.size() + 2) / 2) - 1)) / 2);
            } else {
                System.out.println("Median: " + time.get(((time.size() + 1) / 2) - 1));
            }
        }
    }
}