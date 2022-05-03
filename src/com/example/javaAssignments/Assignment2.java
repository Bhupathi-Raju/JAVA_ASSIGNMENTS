package com.example.javaAssignments;

import java.util.*;

public class Assignment2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to search");
        String input = scanner.next();
        if(searchString(input)){
            System.out.println("String contains all the alphabets from a-z");
        }else{
            System.out.println("String doesn't contain all the alphabets");
        }
    }

    public static boolean searchString(String inputString){
        if(inputString.length() < 26){
            return false;
        }
        Boolean[] alphabetCheckList = new Boolean[26];
        Arrays.fill(alphabetCheckList, false);
        int iterationCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char inputCharacter = inputString.charAt(i);
            iterationCount ++ ;
            if ((inputCharacter >= 'a' && inputCharacter <= 'z')) {
                alphabetCheckList[inputCharacter - 'a'] = true;
            }
            if (iterationCount > 25){
                 if(checkAllAlphabet(alphabetCheckList))
                     return true;
            }
        }
        return false;
    }

    public static boolean checkAllAlphabet(Boolean[] alphabetCheckList){
        for (Boolean isCharPresent : alphabetCheckList){
            if(!isCharPresent)
                return false;
        }
        return true;
    }
}

// Space Complexity: O(1) (Array of 26 is always constant)
// Time complexity: O(N  * 26) ~ O(N)
