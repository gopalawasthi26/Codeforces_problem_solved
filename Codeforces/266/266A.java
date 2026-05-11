/*
 * Problem  : 266A
 * Contest  : 266 | Problem : A
 * Language : Java 21 64bit
 * Date     : 11 May 2026
 */

import java.util.Scanner;

public class StonesOnTable {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            
            if (!sc.hasNext()) return;
            String stones = sc.next();
            
            int removals = 0;
            
            for (int i = 0; i < n - 1; i++) {
                if (stones.charAt(i) == stones.charAt(i + 1)) {
                    removals++;
                }
            }
            
            // Output the total count of removals
            System.out.println(removals);
        }
    }
}
