/*
 * Problem  : 41A
 * Contest  : 41 | Problem : A
 * Language : Java 21 64bit
 * Date     : 12 May 2026
 */

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        // Use Scanner to read input from stdin
        Scanner sc = new Scanner(System.in);
        
        // Read the two input words
        if (sc.hasNext()) {
            String s = sc.next();
            String t = sc.next();
            
            // Reverse string 's' using StringBuilder's built-in reverse() method
            String reversedS = new StringBuilder(s).reverse().toString();
            
            // Compare the reversed string with 't' and print the result
            if (reversedS.equals(t)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
