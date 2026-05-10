/*
 * Problem  : 791A
 * Contest  : 791 | Problem : A
 * Language : Java 21 64bit
 * Date     : 10 May 2026
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Use Scanner to read input from standard input
        Scanner sc = new Scanner(System.in);
        
        // Read initial weights of Limak (a) and Bob (b)
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int years = 0;
        
        // Loop until Limak is strictly heavier than Bob
        while (a <= b) {
            a *= 3; // Limak's weight triples
            b *= 2; // Bob's weight doubles
            years++; // Increment year counter
        }
        
        // Output the total number of years it took
        System.out.println(years);
        
        sc.close();
    }
}
