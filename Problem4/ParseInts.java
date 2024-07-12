package QAP4_Java.Problem4;

import java.util.Scanner;

// Reads a line of text and prints the integers in the line.

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Enter a line of text:");
        System.out.println("");
        Scanner scanLine = new Scanner(scan.nextLine());
        System.out.println("");
        
        while (scanLine.hasNext()) {
            String token = scanLine.next();
            try {
                val = Integer.parseInt(token);
                sum += val;
            } catch (NumberFormatException e) {
                System.out.println("Not an integer: " + token);
                System.out.println("---------------------");
            }
        }
        System.out.println("");
        System.out.println("The sum of the integers on this line is " + sum);
        System.out.println("");
        scan.close();
        scanLine.close();
    }
}
