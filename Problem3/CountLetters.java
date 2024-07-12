package QAP4_Java.Problem3;

// ****************************************************************
// CountLetters.java
//
// Reads a word from the standard input and prints the number of
// occurrences of each letter in that word.
// ****************************************************************

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26]; // Array to hold the count of each letter
        Scanner scan = new Scanner(System.in);

        // Get word from user
        System.out.println("");
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();

        // Convert to all upper case
        word = word.toUpperCase();

        // Count frequency of each letter in string
        for (int i = 0; i < word.length(); i++) {
            try {
                counts[word.charAt(i) - 'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("");
                System.out.println("Not a letter: " + word.charAt(i));
            }
        }

        // Print frequencies
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
                System.out.println("-----------------");
            }
        }
        scan.close();
    }
}
