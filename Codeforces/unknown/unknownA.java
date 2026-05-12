/*
 * Problem  : unknownA
 * Contest  : unknown | Problem : A
 * Language : Java 21 64bit
 * Date     : 12 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Use Scanner for simple input reading
        try (Scanner sc = new Scanner(System.in)) {
            // Read initial number n and the number of subtractions k
            int n = sc.nextInt();
            int k = sc.nextInt();

            // Perform the "wrong subtraction" k times
            for (int i = 0; i < k; i++) {
                if (n % 10 == 0) {
                    // Rule 1: If the last digit is 0, divide by 10
                    n /= 10;
                } else {
                    // Rule 2: If the last digit is non-zero, subtract 1
                    n -= 1;
                }
            }

            
            System.out.println(n);
        }
    }
}
