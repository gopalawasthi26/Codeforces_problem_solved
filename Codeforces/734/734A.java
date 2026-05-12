/*
 * Problem  : 734A
 * Contest  : 734 | Problem : A
 * Language : Java 21 64bit
 * Date     : 12 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of games played
        int n = scanner.nextInt();
        
        // Read the outcomes of the games
        String s = scanner.next();
        
        int antonWins = 0;
        int danikWins = 0;
        
        // Iterate through the string to count wins
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') {
                antonWins++;
            } else {
                danikWins++;
            }
        }
        
        // Determine and print the result based on counts
        if (antonWins > danikWins) {
            System.out.println("Anton");
        } else if (danikWins > antonWins) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
        
        scanner.close();
    }
}
