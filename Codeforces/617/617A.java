/*
 * Problem  : 617A
 * Contest  : 617 | Problem : A
 * Language : Java 21 64bit
 * Date     : 10 May 2026
 */

import java.util.Scanner;

/**
 * Solution for Codeforces 617A - Elephant
 * The goal is to reach point x from 0 in minimum steps (max step size = 5).
 */
public class Elephant {
    public static void main(String[] args) {
        // Use try-with-resources to ensure the scanner is closed
        try (Scanner sc = new Scanner(System.in)) {
            if (sc.hasNextInt()) {
                int x = sc.nextInt();
                
                // Formula for ceiling of (x / 5) using integer division:
                // (x + (divisor - 1)) / divisor
                int steps = (x + 4) / 5;
                
                System.out.println(steps);
            }
        }
    }
}
