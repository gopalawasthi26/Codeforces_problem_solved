/*
 * Problem  : 59A
 * Contest  : 59 | Problem : A
 * Language : Java 21 64bit
 * Date     : 11 May 2026
 */

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        // Use a Scanner to read the input word from the console
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNext()) return;
        String s = sc.next();
        
        // Count the number of uppercase characters using the Stream API
        long upperCount = s.chars()
                          .filter(Character::isUpperCase)
                          .count();
        
        // Count lowercase characters
        long lowerCount = s.length() - upperCount;

        // Convert the string based on which case is more frequent
        // If counts are equal, lowerCount takes precedence as per requirements
        if (upperCount > lowerCount) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
        
        sc.close();
    }
}
